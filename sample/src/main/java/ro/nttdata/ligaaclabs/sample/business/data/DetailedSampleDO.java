package ro.nttdata.ligaaclabs.sample.business.data;

import java.util.Date;

/**
 * Data object corresponding to a detailed representation of sample entities.
 *
 */
public class DetailedSampleDO {
	/**
	 * The id.
	 */
	private long id;

	/**
	 * The name.
	 */
	private String name;

	/**
	 * The internal name.
	 */
	private String internalName;

	/**
	 * The creation timestamp.
	 */
	private Date createdTimestamp;

	/**
	 * The updated timestamp.
	 */
	private Date updatedTimestamp;

	/**
	 * Default constructor
	 */
	public DetailedSampleDO() {
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
	 * Gets the internal name.
	 *
	 * @return the internal name
	 */
	public String getInternalName() {
		return internalName;
	}

	/**
	 * Sets the internal name.
	 *
	 * @param internalName
	 *            the internalName to set
	 */
	public void setInternalName(String internalName) {
		this.internalName = internalName;
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

	/**
	 * Gets the timestamp for the last update.
	 *
	 * @return the updatedTimestamp
	 */
	public Date getUpdatedTimestamp() {
		return (this.updatedTimestamp != null) ? new Date(this.updatedTimestamp.getTime()) : null;
	}

	/**
	 * Sets the timestamp for the last update.
	 *
	 * @param updatedTimestamp
	 *            the updatedTimestamp to set
	 */
	public void setUpdatedTimestamp(Date updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}
}
