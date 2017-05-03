package ro.nttdata.ligaaclabs.sample.business.control;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import ro.nttdata.ligaaclabs.sample.business.data.DetailedSampleDO;
import ro.nttdata.ligaaclabs.sample.business.data.SampleDO;
import ro.nttdata.ligaaclabs.sample.business.entity.SampleEntity;

/**
 * Controller for handling operations related to sample entities.
 *
 */
public class SampleController {

	/**
	 * The Entity Manager.
	 */
	@Inject
	private EntityManager em;

	/**
	 * Gets all the public data related to the sample entities stored in the
	 * database.
	 * 
	 * @return the sample data objects
	 */
	@SuppressWarnings("unchecked")
	public List<SampleDO> getSampleObjects() {
		final List<SampleEntity> sampleEntities = this.em.createNamedQuery(SampleEntity.ALL).getResultList();
		return sampleEntities.stream().map((se) -> this.toSampleDO(se)).collect(Collectors.toList());
	}

	private SampleDO toSampleDO(SampleEntity se) {
		SampleDO sampleDO = new SampleDO();
		sampleDO.setId(se.getId());
		sampleDO.setName(se.getName());
		sampleDO.setCreatedTimestamp(se.getCreatedTimestamp());
		return sampleDO;
	}

	/**
	 * Gets the sample entity with the given ID
	 * 
	 * @param sampleEntityID
	 *            ID of the entity
	 * @return the details of the sample entity
	 */
	public DetailedSampleDO getSampleEntity(String sampleEntityID) {
		TypedQuery<SampleEntity> query = this.em.createNamedQuery(SampleEntity.BY_ID, SampleEntity.class);
		query.setParameter("id", Long.valueOf(sampleEntityID));
		List<SampleEntity> resultList = query.getResultList();
		if (resultList == null || resultList.isEmpty()) {
			return null;
		}

		return toDetailedSampleDO(query.getResultList().get(0));
	}

	private DetailedSampleDO toDetailedSampleDO(SampleEntity se) {
		DetailedSampleDO detailedSampleDO = new DetailedSampleDO();
		detailedSampleDO.setId(se.getId());
		detailedSampleDO.setName(se.getName());
		detailedSampleDO.setInternalName(se.getInternalName());
		detailedSampleDO.setCreatedTimestamp(se.getCreatedTimestamp());
		detailedSampleDO.setUpdatedTimestamp(se.getUpdatedTimestamp());
		return detailedSampleDO;
	}
}
