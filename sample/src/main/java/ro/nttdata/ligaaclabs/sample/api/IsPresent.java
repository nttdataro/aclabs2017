package ro.nttdata.ligaaclabs.sample.api;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ro.nttdata.ligaaclabs.sample.business.control.UserController;
import ro.nttdata.ligaaclabs.sample.business.data.AttendanceUserDO;
import ro.nttdata.ligaaclabs.sample.business.data.DetailedUserDO;
import ro.nttdata.ligaaclabs.sample.business.data.UserDO;

/**
 * Sample REST end point for getting info about the present.
 *
 */
@Path("/userentity")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class IsPresent {
	@Inject
	private UserController UserController;

	/**
	 * Gets all user entities stored in the database.
	 * 
	 * @return if a user is present or not.
	 */
	@GET
	@Path("present/{userentityID}/{created_timestamp}")
	public Response getPresent(@NotNull @PathParam("id") long id,@NotNull @PathParam("created_timestamp") Date created_timestamp) {
		boolean attendanceDO = UserController.getPresent(id,created_timestamp);
		return Response.ok().entity(new GenericEntity(attendanceDO){}).build();
	}

}
