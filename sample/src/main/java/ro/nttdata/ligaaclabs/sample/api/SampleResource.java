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

import ro.nttdata.ligaaclabs.sample.business.control.SampleController;
import ro.nttdata.ligaaclabs.sample.business.data.DetailedSampleDO;
import ro.nttdata.ligaaclabs.sample.business.data.SampleDO;

/**
 * Sample REST endpoint for getting info about the sample entities.
 *
 */
@Path("/sampleentity")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SampleResource {
	@Inject
	private SampleController sampleController;

	/**
	 * Gets all sample entities stored in the database.
	 * 
	 * @return all sample entities
	 */
	@GET
	public Response getSampleEntities() {
		List<SampleDO> sampleEntities = sampleController.getSampleObjects();
		return Response.ok().entity(new GenericEntity<List<SampleDO>>(sampleEntities) {
		}).build();
	}

	/**
	 * Gets a sample entity with the given ID.
	 * 
	 * @return sample entity by ID
	 */
	@GET
	@Path("{sampleEntityID}")
	public Response getSampleEntity(@NotNull @PathParam("sampleEntityID") String sampleEntityID) {
		DetailedSampleDO sampleDO = sampleController.getSampleEntity(sampleEntityID);
		return Response.ok().entity(sampleDO).build();
	}
}
