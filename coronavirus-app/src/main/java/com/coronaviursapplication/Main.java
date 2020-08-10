package com.coronaviursapplication;

import java.io.IOException;

import com.coronaviursapplication.service.App;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Main {
    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
    {
       App app = new App();
       app.runApplication();
    }
}
