# Coronavirus Information Provider

## List of Contents

- [ Introduction ](#introduction)
- [ Frameworks ](#frameworks)
- [ How it works ](#works)
- [ Updates ](#updates)
- [ TODO ](#todo)

<a name="introduction"></a>
## Introduction

This is a Java application (in the early stages of working), which obtaines information about coronavirus statistics from an open API, analyses them and provides a generated PDF document that will converts all the available information, into one cohesive file.

<a name="frameworks"></a>
## Frameworks 

- Maven 3.1
- Covid19API 1.0 
- Jackson 2.11.2

<a name="works"></a>
## How it works

- The application obtains information via URL Get request, from Covid19API service to get A JSON objects about all the available information. The application then parses it and generates a PDF file for the information about the COVID19 in the given country.

<a name="updates"></a>
## Updates

* 09/08/2020
    * An initial commit, with basic DayOne structure.
* 10/08/2020
    * Restructured the project directory
    * Added API call to obtain country's data from day one until current date.
    * Created a reusable base class for API calls
    * Call to API total information about the country to obtain deaths, active and recovered cases
* 24/08/2020
    * Refactored App.java 
    * Added statistics module to the application
    * Refactored API and arraylist handling. 
    * Removed unnecessary API calls
    * Added statistics, such as peak number of active cases and averages

<a name="todo"></a>
## TODO

- [X] Enable user to enter the country, for which they'd like a report.
- [ ] Statistical information in regards to the country, e.g. average number of cases per day, peak number of cases, prediction for next day, etc.
- [ ] Generate different kind of reports, e.g. overall report, specific date-to-date report, multiple countries reports
- [ ] Create report abstract factory and report class builder
- [ ] Get and parse all the other information from Covid19API
- [ ] Generate the report and save it to the currently working directory
- [ ] Add other possible extensions to the application 
- [ ] Fix 'Premature EOS error' on Unied States