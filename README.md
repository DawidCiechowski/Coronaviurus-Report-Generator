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

<a name="todo"></a>
## TODO

- [ ] Enable user to enter the country, for which they'd like a report.
- [ ] Get and parse all the other information from Covid19API
- [ ] Generate the report and save it to the currently working directory
- [ ] Add other possible extensions to the application 