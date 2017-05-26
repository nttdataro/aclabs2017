package ro.nttdata.ligaaclabs.sample.api;

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
 * This class provides the REST endpoint for performing hello calls.
 *
 */
@Path("/status/hello")
@Stateless
public class HelloResource {
	@Context
	private UriInfo context;

	/** Creates a new instance of HelloResource */
	public HelloResource() {
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