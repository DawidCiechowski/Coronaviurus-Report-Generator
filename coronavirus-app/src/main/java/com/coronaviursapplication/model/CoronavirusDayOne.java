package com.coronaviursapplication.model;

import java.time.LocalDate;
import java.util.Objects;

public class CoronavirusDayOne {
    String country, status, lon, lat, conutryCode;
    String date;
    int cases;
    

    public CoronavirusDayOne() {
    }

    public CoronavirusDayOne(String country, String status, String lon, String lat, String conutryCode, String date, int cases) {
        this.country = country;
        this.status = status;
        this.lon = lon;
        this.lat = lat;
        this.conutryCode = conutryCode;
        this.date = date;
        this.cases = cases;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLon() {
        return this.lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return this.lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getConutryCode() {
        return this.conutryCode;
    }

    public void setConutryCode(String conutryCode) {
        this.conutryCode = conutryCode;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCases() {
        return this.cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public CoronavirusDayOne country(String country) {
        this.country = country;
        return this;
    }

    public CoronavirusDayOne status(String status) {
        this.status = status;
        return this;
    }

    public CoronavirusDayOne lon(String lon) {
        this.lon = lon;
        return this;
    }

    public CoronavirusDayOne lat(String lat) {
        this.lat = lat;
        return this;
    }

    public CoronavirusDayOne conutryCode(String conutryCode) {
        this.conutryCode = conutryCode;
        return this;
    }

    public CoronavirusDayOne date(String date) {
        this.date = date;
        return this;
    }

    public CoronavirusDayOne cases(int cases) {
        this.cases = cases;
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
        return Objects.equals(country, coronavirusDayOne.country) && Objects.equals(status, coronavirusDayOne.status) && Objects.equals(lon, coronavirusDayOne.lon) && Objects.equals(lat, coronavirusDayOne.lat) && Objects.equals(conutryCode, coronavirusDayOne.conutryCode) && Objects.equals(date, coronavirusDayOne.date) && cases == coronavirusDayOne.cases;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, status, lon, lat, conutryCode, date, cases);
    }

    @Override
    public String toString() {
        return "{" +
            " country='" + getCountry() + "'" +
            ", status='" + getStatus() + "'" +
            ", lon='" + getLon() + "'" +
            ", lat='" + getLat() + "'" +
            ", conutryCode='" + getConutryCode() + "'" +
            ", date='" + getDate() + "'" +
            ", cases='" + getCases() + "'" +
            "}";
    }

    
}