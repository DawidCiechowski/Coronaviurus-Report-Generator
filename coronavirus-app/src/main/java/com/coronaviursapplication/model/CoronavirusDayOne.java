package com.coronaviursapplication.model;

import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CoronavirusDayOne {
    String Country, Province, CityCode, Status, Lat, Lon, CountryCode, City;
    String Date;
    int Cases;
    



    public CoronavirusDayOne() {
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
        this.Country = Country;
        this.Province = Province;
        this.CityCode = CityCode;
        this.Status = Status;
        this.Lat = Lat;
        this.Lon = Lon;
        this.CountryCode = CountryCode;
        this.City = City;
        this.Date = Date;
        this.Cases = Cases;
    }

    public String getCountry() {
        return this.Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getProvince() {
        return this.Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public String getCityCode() {
        return this.CityCode;
    }

    public void setCityCode(String CityCode) {
        this.CityCode = CityCode;
    }

    public String getStatus() {
        return this.Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getLat() {
        return this.Lat;
    }

    public void setLat(String Lat) {
        this.Lat = Lat;
    }

    public String getLon() {
        return this.Lon;
    }

    public void setLon(String Lon) {
        this.Lon = Lon;
    }

    public String getCountryCode() {
        return this.CountryCode;
    }

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    public String getCity() {
        return this.City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getDate() {
        return this.Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getCases() {
        return this.Cases;
    }

    public void setCases(int Cases) {
        this.Cases = Cases;
    }

    public CoronavirusDayOne Country(String Country) {
        this.Country = Country;
        return this;
    }

    public CoronavirusDayOne Province(String Province) {
        this.Province = Province;
        return this;
    }

    public CoronavirusDayOne CityCode(String CityCode) {
        this.CityCode = CityCode;
        return this;
    }

    public CoronavirusDayOne Status(String Status) {
        this.Status = Status;
        return this;
    }

    public CoronavirusDayOne Lat(String Lat) {
        this.Lat = Lat;
        return this;
    }

    public CoronavirusDayOne Lon(String Lon) {
        this.Lon = Lon;
        return this;
    }

    public CoronavirusDayOne CountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
        return this;
    }

    public CoronavirusDayOne City(String City) {
        this.City = City;
        return this;
    }

    public CoronavirusDayOne Date(String Date) {
        this.Date = Date;
        return this;
    }

    public CoronavirusDayOne Cases(int Cases) {
        this.Cases = Cases;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CoronavirusDayOne)) {
            return false;
        }
        CoronavirusDayOne coronavirusDayOne = (CoronavirusDayOne) o;
        return Objects.equals(Country, coronavirusDayOne.Country) && Objects.equals(Province, coronavirusDayOne.Province) && Objects.equals(CityCode, coronavirusDayOne.CityCode) && Objects.equals(Status, coronavirusDayOne.Status) && Objects.equals(Lat, coronavirusDayOne.Lat) && Objects.equals(Lon, coronavirusDayOne.Lon) && Objects.equals(CountryCode, coronavirusDayOne.CountryCode) && Objects.equals(City, coronavirusDayOne.City) && Objects.equals(Date, coronavirusDayOne.Date) && Cases == coronavirusDayOne.Cases;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Country, Province, CityCode, Status, Lat, Lon, CountryCode, City, Date, Cases);
    }

    @Override
    public String toString() {
        return "{" +
            " Country='" + getCountry() + "'" +
            ", Province='" + getProvince() + "'" +
            ", CityCode='" + getCityCode() + "'" +
            ", Status='" + getStatus() + "'" +
            ", Lat='" + getLat() + "'" +
            ", Lon='" + getLon() + "'" +
            ", CountryCode='" + getCountryCode() + "'" +
            ", City='" + getCity() + "'" +
            ", Date='" + getDate() + "'" +
            ", Cases='" + getCases() + "'" +
            "}";
    }
   
    

    
}