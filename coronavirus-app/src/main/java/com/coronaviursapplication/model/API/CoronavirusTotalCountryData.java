package com.coronaviursapplication.model.API;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoronavirusTotalCountryData extends ApiModel {

    public CoronavirusTotalCountryData(){}

    public CoronavirusTotalCountryData(@JsonProperty("Country") String Country, 
    @JsonProperty("Province") String Province, 
    @JsonProperty("CityCode") String CityCode, 
    @JsonProperty("Status") String Status, 
    @JsonProperty("Lat") String Lat, 
    @JsonProperty("Lon") String Lon, 
    @JsonProperty("CountryCode") String CountryCode, 
    @JsonProperty("City") String City, 
    @JsonProperty("Date") String Date, 
    @JsonProperty("Confirmed") int Confirmed,
    @JsonProperty("Deaths") int Deaths, 
    @JsonProperty("Recovered") int Recovered,
    @JsonProperty("Active") int Active
    ) {
        super(Country, Province, CityCode, Status, Lat, Lon, CountryCode, City, Date, Confirmed, Deaths, 
        Recovered, Active);
    }
    
}