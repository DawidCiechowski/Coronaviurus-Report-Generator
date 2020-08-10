package com.coronaviursapplication.model.API;


import com.fasterxml.jackson.annotation.JsonProperty;



public class CoronavirusDayOne extends ApiModel{
    String Country, Province, CityCode, Status, Lat, Lon, CountryCode, City;
    String Date;
    int Cases;
    

    public CoronavirusDayOne() {
        super();
    }

    public CoronavirusDayOne(@JsonProperty("Country") String Country, 
    @JsonProperty("Province") String Province, 
    @JsonProperty("CityCode") String CityCode, 
    @JsonProperty("Status") String Status, 
    @JsonProperty("Lat") String Lat, 
    @JsonProperty("Lon") String Lon, 
    @JsonProperty("CountryCode") String CountryCode, 
    @JsonProperty("City") String City, 
    @JsonProperty("Date") String Date, 
    @JsonProperty("Cases") int Cases) {

        super(Country, Province, CityCode, Status, Lat, Lon, CountryCode, 
        City, Date, Cases);

    }
    
}