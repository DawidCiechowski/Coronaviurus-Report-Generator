package com.coronaviursapplication;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.coronaviursapplication.model.CoronavirusDayOne;
import com.coronaviursapplication.model.CoronavirusDayOneList;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
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
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        CoronavirusDayOneList l = mapper.readValue(new URL("https://api.covid19api.com/dayone/country/poland/status/confirmed"), CoronavirusDayOneList.class);
    }
}
