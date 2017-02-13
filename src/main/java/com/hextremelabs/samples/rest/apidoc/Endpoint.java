package com.hextremelabs.samples.rest.apidoc;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.APPLICATION_XML;

/**
 *
 * @author oladeji
 */
@Path("endpoint")
public class Endpoint {

  @HeaderParam("sessionId")
  private String sessionId;

  @GET
  @Path("{id}")
  @Produces({APPLICATION_JSON, APPLICATION_XML})
  public Stuff getStuff(@PathParam("id") Long id) {
    return new Stuff();
  }

  @POST
  @Consumes({APPLICATION_JSON, APPLICATION_XML})
  @Produces({APPLICATION_JSON, APPLICATION_XML})
  public Stuff addStuff(Stuff stuff) {
    stuff.setId((long) (Math.random() * 10000));
    return stuff;
  }
}
