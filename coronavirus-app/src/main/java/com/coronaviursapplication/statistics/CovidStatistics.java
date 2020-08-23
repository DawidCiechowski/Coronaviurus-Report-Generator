package com.coronaviursapplication.statistics;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

import com.coronaviursapplication.model.API.CoronavirusDayOne;
import com.coronaviursapplication.model.API.CoronavirusTotalCountryData;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class CovidStatistics {

    private String country;
    private ArrayList<CoronavirusTotalCountryData> totalData;
    private CoronavirusDayOne[] dayOne;


    public CovidStatistics(String country) {
        this.country = country;
        try{
            this.dayOne = getDayOneData(country);
            this.totalData = getTotalData(country, this.dayOne[0].getDate());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    

    public float getAverageDailyGrowth() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        LocalDate firstDay = LocalDate.parse(totalData.get(0).getDate(), format);
        LocalDate lastDay = LocalDate.parse(totalData.get(totalData.size()-1).getDate(), format);
        float numberOfDaysBetween = (float) ChronoUnit.DAYS.between(firstDay, lastDay);

        float average = (float) totalData.get(totalData.size()-1).getConfirmed() / numberOfDaysBetween;

        return average;
    }

    public float getAverageDailyGrowthInLastWeek() {

        return (float) (totalData.get(totalData.size()-1).getConfirmed() - totalData.get(totalData.size()-7).getConfirmed()) / 7;
    }

    public String getDayOne() {
        return this.dayOne[0].getDate();
    }

    public int getConfirmedCases() {
        return this.totalData.get(this.totalData.size() - 1).getConfirmed();
    }

    public int getCurrentActiveCases() {
        return this.totalData.get(this.totalData.size() - 1).getActive();
    }

    public int getCurrentDeaths() {
        return this.totalData.get(this.totalData.size() - 1).getDeaths();
    }

    public int getCurrentRecoveredCases() {
        return this.totalData.get(this.totalData.size() - 1).getRecovered();
    }

    

    /**
     * 
     * @param country - String holding country's name
     * @return CoronavirusDayOne array containing the data about day one of coronavirus appearance in the country
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    private CoronavirusDayOne[] getDayOneData(String country) throws JsonParseException, JsonMappingException,
            IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(
            new URL("https://api.covid19api.com/dayone/country/" + 
            country.toLowerCase() + 
            "/status/confirmed"), 
            CoronavirusDayOne[].class);
    }

    private ArrayList<CoronavirusTotalCountryData> getTotalData(String country, String dayOneDate) throws JsonParseException, JsonMappingException,
            IOException {
        ObjectMapper mapper = new ObjectMapper();
        CoronavirusTotalCountryData[] totalCountryDataArray = mapper.readValue(
            new URL("https://api.covid19api.com/total/country/" + country), 
            CoronavirusTotalCountryData[].class);

        ArrayList<CoronavirusTotalCountryData> totalData = new ArrayList<>();

        Stream<CoronavirusTotalCountryData> dataStream = Arrays.stream(totalCountryDataArray);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dataStream
                .filter(date -> LocalDate.parse(dayOneDate, format)
                                            .compareTo(LocalDate.parse(date.getDate(), format)) < 0)
                .forEach(totalData::add);
                

        return totalData;
    }


    // Getters&Setters, Helper methods
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public CovidStatistics country(String country) {
        this.country = country;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CovidStatistics)) {
            return false;
        }
        CovidStatistics covidStatistics = (CovidStatistics) o;
        return Objects.equals(country, covidStatistics.country);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(country);
    }

    @Override
    public String toString() {
        return "{" +
            " country='" + getCountry() + "'" +
            "}";
    }

    
}