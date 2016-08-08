package com.sgmarghade.dropwizard;

import com.sgmarghade.dropwizard.config.ApplicationConfig;
import com.sgmarghade.dropwizard.health.ApiHealthCheck;
import com.sgmarghade.dropwizard.resource.ApiResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Hello world!
 * 1. mvn clean install
 * 2. java -jar target/dropwizard-basic-restapi-1.0-SNAPSHOT.jar server src/main/resources/config.yml
 * 3. Health check : http://localhost:3000/admin/healthcheck?pretty=true
 * 4. GET API : http://localhost:3000/api/models/1
 */
public class Server extends Application<ApplicationConfig>
{

    public static void main(String[] args) throws Exception {
        new Server().run(args);
    }
    @Override
    public void run(ApplicationConfig applicationConfig, Environment environment) throws Exception {

        //Registering the api resource.
        ApiResource component = new ApiResource(applicationConfig);
        environment.jersey().register(component);

        //Registering the health check..
        environment.healthChecks().register("API HEALTH",new ApiHealthCheck("testing"));
    }
}
