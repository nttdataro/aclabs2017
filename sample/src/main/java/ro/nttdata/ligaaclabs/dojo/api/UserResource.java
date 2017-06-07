package ro.nttdata.ligaaclabs.dojo.api;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ro.nttdata.ligaaclabs.dojo.business.control.UserController;
import ro.nttdata.ligaaclabs.dojo.business.data.AttendanceUserDO;
import ro.nttdata.ligaaclabs.dojo.business.data.UserDO;

/**
 * Sample REST end point for getting info about the user entities.
 *
 */
@Path("/user")
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
		UserDO userDO = UserController.getUserEntity(userEntityID);
		return Response.ok().entity(userDO).build();
	}
/*
 * Generic Entity http://docs.oracle.com/javaee/7/api/javax/ws/rs/core/GenericEntity.html
 * 
 */
	@GET
	@Path("workshop/{workshop}")
	public Response getWorkshopAttendance(@NotNull @PathParam("workshop") @Pattern(regexp="[0-9]", message="doar numere " ) String workshopName) {
		List<AttendanceUserDO> attendanceDO = UserController.getWorkshopAttendance(workshopName);
		return Response.ok().entity(new GenericEntity<List<AttendanceUserDO>>(attendanceDO){}).build();
	}
}
