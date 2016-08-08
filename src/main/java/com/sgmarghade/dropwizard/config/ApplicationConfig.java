package com.sgmarghade.dropwizard.config;

import io.dropwizard.Configuration;

/**
 * Created by swapnil on 08/08/16.
 */
public class ApplicationConfig extends Configuration {
    private String apiResponse;

    public ApplicationConfig(){

    }

    public String getApiResponse() {
        return apiResponse;
    }

    public void setApiResponse(String apiResponse) {
        this.apiResponse = apiResponse;
    }

    @Override
    public String toString() {
        return "ApplicationConfig{" +
                "apiResponse='" + apiResponse + '\'' +
                '}';
    }
}

