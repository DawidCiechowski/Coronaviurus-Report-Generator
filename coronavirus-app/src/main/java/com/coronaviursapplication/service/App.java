package com.coronaviursapplication.service;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import com.coronaviursapplication.model.API.CoronavirusCountryData;
import com.coronaviursapplication.model.API.CoronavirusDayOne;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class App {

    public App() {}

    /**
     * Runs the entire process of the application
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    public void runApplication() throws JsonParseException, JsonMappingException, IOException {

        Scanner scanner = new Scanner(System.in);
        String country = "";

        System.out.print("Enter the country, for which you'd like a report for: ");
        country = scanner.nextLine();

        CoronavirusDayOne[] listOfDayOne = getDayOneData(country);
        CoronavirusDayOne dayOne = listOfDayOne[0];

        CoronavirusCountryData[] coronavirusCountryData = getCountryData(country, dayOne);

        printAllData(country, dayOne, coronavirusCountryData);
        scanner.close();
    }

    /**
     * Prints all the relevant data
     * @param country - String containing the country
     * @param dayOne - CoronavirusDayOne object holding the information regarding the data for day one of coronavirus in the country
     * @param data - CoronavirusCountryData object containing information about the country from day one until the current date
     */
    private void printAllData(String country, CoronavirusDayOne dayOne, CoronavirusCountryData[] data) {
        System.out.println("First recorded case of Covid19 in " + country.substring(0, 1).toUpperCase()
                + country.substring(1).toLowerCase() + " was on " + dayOne.getDate());
        System.out.println("Number of confirmed cases: " + data[data.length - 1].getCases());
    }

    /**
     * 
     * @param country - String for the country, for which the data has been obtained
     * @param dayOne - The data on first date the coronavirus has appeared in the country
     * @return CoronavirusCountryData array
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    private CoronavirusCountryData[] getCountryData(String country, CoronavirusDayOne dayOne)
            throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(
            new URL("https://api.covid19api.com/total/country/" +
            country.toLowerCase() + 
            "/status/confirmed?from="+ 
            dayOne.getDate() +
            "&to=2020-08-10T00:00:00Z"), 
            CoronavirusCountryData[].class);
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


    
}