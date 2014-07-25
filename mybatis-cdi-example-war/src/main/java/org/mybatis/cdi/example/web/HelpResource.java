package org.mybatis.cdi.example.web;

import org.mybatis.cdi.example.beans.HelpService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("help")
@Produces(MediaType.APPLICATION_JSON)
public class HelpResource {

    @Inject
    private HelpService helpService;

    @GET
    @Path("{id}")
    public Response getOne(@PathParam("id") Long id) {
        return Response.ok().entity(helpService.getHelp(id)).build();
    }
}
