package me.holzenkamp.sample.java.rest;

import me.holzenkamp.sample.java.rest.internal.SampleJson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class TestService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public SampleJson get() {
        return new SampleJson("OK", "This is a simple JSON response.");
    }

}
