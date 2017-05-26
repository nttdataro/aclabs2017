package ro.nttdata.ligaaclabs.dojo.api;

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
 * This class provides the REST endpoint for performing calls.
 * modified after comment, please review :) :
 *  Resursa pt hello ar putea fi inlocuita cu o resursa de Ping
 *  specifica pt dojo management - de facut in pasul urmator :)
 *  
 *
 */
@Path("/status/dojo")
@Stateless
public class DojoPingResource {
	@Context
	private UriInfo context;

	/** Creates a new instance of DojoPingResource */
	public DojoPingResource() {
		super();
	}

	/**
	 * Performs a call.
	 *
	 * @param name
	 *            the name
	 * @return response
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response ping(@QueryParam("name") final String name) {

		if (name != null && name.length() > 0) {
			return Response.ok().entity("Hello, " + name + "! I'm a Dojo Resource!").build();

		} else {
			return Response.ok("Hello! I'm a Dojo Resource!").build();
		}
	}

}