package com.coronaviursapplication.model.API;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiModel {

    String Country, Province, CityCode, Status, Lat, Lon, CountryCode, City;
    String Date;
    int Cases, Confirmed, Deaths, Recovered, Active;    


    public ApiModel() {
    }

    public ApiModel(@JsonProperty("Country") String Country, 
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

    public ApiModel(@JsonProperty("Country") String Country, 
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
        this.Country = Country;
        this.Province = Province;
        this.CityCode = CityCode;
        this.Status = Status;
        this.Lat = Lat;
        this.Lon = Lon;
        this.CountryCode = CountryCode;
        this.City = City;
        this.Date = Date;
        this.Confirmed = Confirmed;
        this.Deaths = Deaths;
        this.Active = Active;
        this.Recovered = Recovered;
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

    public int getConfirmed() {
        return this.Confirmed;
    }

    public void setConfirmed(int Confirmed) {
        this.Confirmed = Confirmed;
    }

    public int getDeaths() {
        return this.Deaths;
    }

    public void setDeaths(int Deaths) {
        this.Deaths = Deaths;
    }

    public int getRecovered() {
        return this.Recovered;
    }

    public void setRecovered(int Recovered) {
        this.Recovered = Recovered;
    }

    public int getActive() {
        return this.Active;
    }

    public void setActive(int Active) {
        this.Active = Active;
    }

    public ApiModel Country(String Country) {
        this.Country = Country;
        return this;
    }

    public ApiModel Province(String Province) {
        this.Province = Province;
        return this;
    }

    public ApiModel CityCode(String CityCode) {
        this.CityCode = CityCode;
        return this;
    }

    public ApiModel Status(String Status) {
        this.Status = Status;
        return this;
    }

    public ApiModel Lat(String Lat) {
        this.Lat = Lat;
        return this;
    }

    public ApiModel Lon(String Lon) {
        this.Lon = Lon;
        return this;
    }

    public ApiModel CountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
        return this;
    }

    public ApiModel City(String City) {
        this.City = City;
        return this;
    }

    public ApiModel Date(String Date) {
        this.Date = Date;
        return this;
    }

    public ApiModel Cases(int Cases) {
        this.Cases = Cases;
        return this;
    }

    public ApiModel Confirmed(int Confirmed) {
        this.Confirmed = Confirmed;
        return this;
    }

    public ApiModel Deaths(int Deaths) {
        this.Deaths = Deaths;
        return this;
    }

    public ApiModel Recovered(int Recovered) {
        this.Recovered = Recovered;
        return this;
    }

    public ApiModel Active(int Active) {
        this.Active = Active;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ApiModel)) {
            return false;
        }
        ApiModel apiModel = (ApiModel) o;
        return Objects.equals(Country, apiModel.Country) && Objects.equals(Province, apiModel.Province) && Objects.equals(CityCode, apiModel.CityCode) && Objects.equals(Status, apiModel.Status) && Objects.equals(Lat, apiModel.Lat) && Objects.equals(Lon, apiModel.Lon) && Objects.equals(CountryCode, apiModel.CountryCode) && Objects.equals(City, apiModel.City) && Objects.equals(Date, apiModel.Date) && Cases == apiModel.Cases && Confirmed == apiModel.Confirmed && Deaths == apiModel.Deaths && Recovered == apiModel.Recovered && Active == apiModel.Active;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Country, Province, CityCode, Status, Lat, Lon, CountryCode, City, Date, Cases, Confirmed, Deaths, Recovered, Active);
    }

}