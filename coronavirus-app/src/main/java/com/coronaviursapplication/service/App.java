package com.coronaviursapplication.service;

import java.util.Scanner;

import com.coronaviursapplication.statistics.CovidStatistics;



public class App {

    public App() {}

    /**
     * Runs the entire process of the application
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    public void runApplication() {

        Scanner scanner = new Scanner(System.in);
        String country = "";

        System.out.print("Enter the country, for which you'd like a report for: ");
        country = scanner.nextLine();

        printAllData(country);
        scanner.close();
    }

    /**
     * Prints all the relevant data
     * @param country - String containing the country
     * @param dayOne - CoronavirusDayOne object holding the information regarding the data for day one of coronavirus in the country
     * @param data - CoronavirusCountryData object containing information about the country from day one until the current date
     */
    private void printAllData(String country) {

        CovidStatistics statistics = new CovidStatistics(country);
        
        System.out.println();

        System.out.println("First recorded case of Covid19 in " + country.substring(0, 1).toUpperCase()
                + country.substring(1).toLowerCase() + " was on " + statistics.getDayOne());
        System.out.println();

        System.out.println("Number of confirmed cases: " + statistics.getConfirmedCases());
        System.out.println();

        System.out.println("Current number of deaths in " + country + " from COVID-19: " + 
        statistics.getCurrentDeaths());

        System.out.println();
        System.out.println("Current number of recovered cases in " + country + " from COVID-19: " + 
        statistics.getCurrentRecoveredCases());

        System.out.println();
        System.out.println("Current number of active cases in " + country + ": " + 
        statistics.getCurrentActiveCases());

        System.out.println();
        System.out.println("Average daily growth since the first case: " + statistics.getAverageDailyGrowth());

        System.out.println();
        System.out.println("Average daily growth in last seven days: " + statistics.getAverageDailyGrowthInLastWeek());

        System.out.println();


    }



    
}