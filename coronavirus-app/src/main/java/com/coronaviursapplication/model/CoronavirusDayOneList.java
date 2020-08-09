package com.coronaviursapplication.model;

import java.util.Objects;

public class CoronavirusDayOneList {
    CoronavirusDayOne[] dayOneArray;


    public CoronavirusDayOneList() {
    }

    public CoronavirusDayOneList(CoronavirusDayOne[] dayOneArray) {
        this.dayOneArray = dayOneArray;
    }

    public CoronavirusDayOne[] getDayOneArray() {
        return this.dayOneArray;
    }

    public void setDayOneArray(CoronavirusDayOne[] dayOneArray) {
        this.dayOneArray = dayOneArray;
    }

    public CoronavirusDayOneList dayOneArray(CoronavirusDayOne[] dayOneArray) {
        this.dayOneArray = dayOneArray;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CoronavirusDayOneList)) {
            return false;
        }
        CoronavirusDayOneList coronavirusDayOneList = (CoronavirusDayOneList) o;
        return Objects.equals(dayOneArray, coronavirusDayOneList.dayOneArray);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dayOneArray);
    }

    @Override
    public String toString() {
        return "{" +
            " dayOneArray='" + getDayOneArray() + "'" +
            "}";
    }

}