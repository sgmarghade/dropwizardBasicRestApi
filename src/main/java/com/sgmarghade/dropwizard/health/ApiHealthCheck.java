package com.sgmarghade.dropwizard.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by swapnil on 08/08/16.
 */
public class ApiHealthCheck extends HealthCheck {
    private String checkName;

    public ApiHealthCheck(String checkName) {
        this.checkName = checkName;
    }

    @Override
    protected Result check() throws Exception {
        if(checkName != null && checkName.equalsIgnoreCase("testing")){
            return Result.healthy("API Check is healthy");
        }else{
            return Result.unhealthy("API is not healthy");
        }
    }
}
