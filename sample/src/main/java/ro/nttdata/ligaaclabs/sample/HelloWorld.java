/**
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package ro.nttdata.ligaaclabs.sample;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * Root resource (exposed at "sampleworld" path)
 */
@Path("/status/hello")
@Stateless
public class HelloWorld {
	@Context
	private UriInfo context;

	/** Creates a new instance of HelloWorld */
	public HelloWorld() {
		super();
	}

	/**
	 * Performs a hello call.
	 *
	 * @param name
	 *            the name
	 * @return response
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response ping(@QueryParam("name") final String name) {
		
		
		if (name != null && name.length() > 0) {
			return Response.ok().entity("Hello, " + name + "! I'm a resource!").build();

		} else {
			return Response.ok("Hello! I'm a resource!").build();
		}
	}

}
