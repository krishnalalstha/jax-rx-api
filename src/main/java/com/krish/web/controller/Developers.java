package com.krish.web.controller;

import com.krish.web.model.Developer;
import com.krish.web.service.DeveloperService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by krishna on 6/20/17.
 */
@Path("developers")
public class Developers {

    DeveloperService developerService = new DeveloperService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Developer> getAllDevelopers(@QueryParam("id") int id) {
        return developerService.getAllDevelopers();

    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Developer fetchDeveloper(@PathParam("id") int id) {
        return developerService.getDeveloperHavingId(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Developer addDeveloper(Developer developer) {
        developerService.addDeveloper(developer);
        return developer;
    }

}
