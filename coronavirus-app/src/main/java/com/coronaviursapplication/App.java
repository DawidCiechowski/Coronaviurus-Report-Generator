package com.coronaviursapplication;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.coronaviursapplication.model.CoronavirusDayOne;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args)
            throws JsonParseException, JsonMappingException, MalformedURLException, IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        Scanner scanner = new Scanner(System.in);
        String country = "";

        System.out.print("Enter the country, for which you'd like a report for: ");
        country = scanner.nextLine();

        CoronavirusDayOne[] listOfDayOne = mapper.readValue(new URL("https://api.covid19api.com/dayone/country/" + country.toLowerCase() + "/status/confirmed"), CoronavirusDayOne[].class);
        CoronavirusDayOne dayOne = listOfDayOne[0];
        System.out.println("First recorded case of Covid19 in " + country.substring(0,1).toUpperCase() + country.substring(1).toLowerCase() + " was on " + dayOne.getDate());
        scanner.close();
    }
}
