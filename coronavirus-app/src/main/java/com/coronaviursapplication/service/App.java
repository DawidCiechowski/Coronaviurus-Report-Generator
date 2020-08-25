package com.coronaviursapplication.service;

import java.util.Scanner;

import com.coronaviursapplication.model.PdfGenerator.GeneralReport;



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

        GeneralReport report = new GeneralReport(country);
        report.generateReport();
        scanner.close();
    }   
}