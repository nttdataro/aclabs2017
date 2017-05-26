package ro.nttdata.ligaaclabs.sample.api;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ro.nttdata.ligaaclabs.sample.business.control.AttendanceController;
import ro.nttdata.ligaaclabs.sample.business.control.InsertAttendanceDO;
import ro.nttdata.ligaaclabs.sample.data.AttendanceDO;

/**
 * Sample REST endpoint for getting info about the sample entities.
 *
 */
@Path("/sampleentity")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AttendanceResource {
	@Inject
	private AttendanceController attendanceController;

	/**
	 * Gets all sample entities stored in the database.
	 * 
	 * @return all sample entities
	 */
//	@GET
//	public Response getSampleEntities() {
//		List<AttendanceDO> sampleEntities = attendanceController.insertUserAttendanceObject();
//		return Response.ok().entity(new GenericEntity<List<AttendanceDO>>(sampleEntities) {
//		}).build();
//	}
	@POST
	public Response createAttendance(AttendanceDO attDO) {
		attendanceController.insertUserAttendanceObject(attDO);
		return Response.ok().entity(attendanceController).build();
	}
}
