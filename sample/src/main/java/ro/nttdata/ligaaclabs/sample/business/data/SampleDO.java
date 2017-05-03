package ro.nttdata.ligaaclabs.sample.business.data;

import java.util.Date;

/**
 * Data object storing basic information about sample entities.
 *
 */
public class SampleDO {
	/**
	 * The id.
	 */
	private long id;

	/**
	 * The name.
	 */
	private String name;

	/**
	 * The created timestamp.
	 */
	private Date createdTimestamp;

	/**
	 * Default constructor
	 */
	public SampleDO() {
		super();
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the id to set
	 */
	public void setId(final long id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Gets the creation timestamp.
	 *
	 * @return the createdTimestamp
	 */
	public Date getCreatedTimestamp() {
		return (this.createdTimestamp != null) ? new Date(this.createdTimestamp.getTime()) : null;
	}

	/**
	 * Sets the created timestamp.
	 *
	 * @param createdTimestamp
	 *            the createdTimestamp to set
	 */
	public void setCreatedTimestamp(final Date createdTimestamp) {
		this.createdTimestamp = (createdTimestamp != null) ? new Date(createdTimestamp.getTime()) : null;
	}
}
