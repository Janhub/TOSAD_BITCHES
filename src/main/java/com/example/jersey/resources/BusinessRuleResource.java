package com.example.jersey.resources;

import oracle.jdbc.proxy.annotation.Pre;
import org.json.JSONObject;

import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/businessRule")
public class BusinessRuleResource {

    @Path("/all")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(String x){
        ResourceFacade facade = new ResourceFacade();
        return facade.getAll(new JSONObject(x));
    }

    @Path("/generate")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response generate(String x){
        ResourceFacade facade = new ResourceFacade();
        return facade.generate(new JSONObject(x));
    }

    @Path("/activate")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response activate(String x){
        ResourceFacade facade = new ResourceFacade();
        facade.activateRule(new JSONObject(x));
        return null;
    }

    @Path("/deactivate")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response deactivate(String x){
        ResourceFacade facade = new ResourceFacade();
        facade.deactivateRule(new JSONObject(x));
        return null;
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(String x){
        ResourceFacade facade = new ResourceFacade();
        facade.deleteBusinessRule(new JSONObject(x));
        return null;
    }
}
