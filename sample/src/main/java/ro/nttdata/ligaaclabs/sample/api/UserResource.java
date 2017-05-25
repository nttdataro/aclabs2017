package ro.nttdata.ligaaclabs.sample.api;

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
 * Sample REST end point for getting info about the sample entities.
 *
 */
@Path("/userentity")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
	@Inject
	private UserController UserController;

	/**
	 * Gets all user entities stored in the database.
	 * 
	 * @return all user entities
	 */
	@GET
	public Response getUserEntities() {
		List<UserDO> userEntities = UserController.getUserObjects();
		return Response.ok().entity(new GenericEntity<List<UserDO>>(userEntities) {
		}).build();
	}

	/**
	 * Gets a user entity with the given ID.
	 * 
	 * @return user entity by ID
	 */
	@GET
	@Path("{userentityID}")
	public Response getUserEntity(@NotNull @PathParam("userentityID") String userEntityID) {
		DetailedUserDO userDO = UserController.getUserEntity(userEntityID);
		return Response.ok().entity(userDO).build();
	}

	@GET
	@Path("workshop/{workshop}")
	public Response getWorkshopAttendance(@NotNull @PathParam("workshop") String workshopName) {
		List<AttendanceUserDO> attendanceDO = UserController.getWorkshopAttendance(workshopName);
		return Response.ok().entity(new GenericEntity<List<AttendanceUserDO>>(attendanceDO){}).build();
	}
}
