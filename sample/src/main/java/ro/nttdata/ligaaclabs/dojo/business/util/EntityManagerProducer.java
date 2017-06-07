package ro.nttdata.ligaaclabs.dojo.business.util;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * This class is the producer for ContainerManaged EntityManager instances.
 */
public class EntityManagerProducer {
	/**
	 * The entity manager.
	 */
	@PersistenceContext(unitName = "dojo")
	private EntityManager em;

	/**
	 * Constructor.
	 */
	public EntityManagerProducer() {
	}

	/**
	 * Gets the entity manager.
	 *
	 * @return The injected EntityManager instance.
	 */
	@Produces
	public EntityManager expose() {
		return this.em;
	}
}
