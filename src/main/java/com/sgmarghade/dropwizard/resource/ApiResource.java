package com.sgmarghade.dropwizard.resource;

import com.sgmarghade.dropwizard.config.ApplicationConfig;
import com.sgmarghade.dropwizard.models.ApiModel;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by swapnil on 08/08/16.
 */
@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
public class ApiResource {
    private ApplicationConfig config;

    public ApiResource(ApplicationConfig config) {
        this.config = config;
    }

    @Path("/models/{id}")
    @GET
    public ApiModel getModel(@PathParam("id")Integer id){
        return new ApiModel("ThisISKey",config.getApiResponse());
    }
}
