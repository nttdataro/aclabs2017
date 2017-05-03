package ro.nttdata.ligaaclabs.sample.business.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Sample JPA entity.
 *
 */
@Entity
@Table(name = "t_sample", schema = "sample")
@NamedQueries({
		@NamedQuery(name = SampleEntity.ALL, query = "SELECT s FROM SampleEntity s"),
		@NamedQuery(name = SampleEntity.BY_ID, query = "SELECT s FROM SampleEntity s where s.id = :id"), })
@SequenceGenerator(name = "sq_sample_object_id", sequenceName = "sq_sample_object_id", allocationSize = 1)
public class SampleEntity implements Serializable {
	/**
	 * UID for serialization.
	 */
	private static final long serialVersionUID = 6252015434537821354L;

	/**
	 * The Constant PREFIX.
	 */
	public static final String PREFIX = "ro.nttdata.ligaaclabs.sample.business.entity.SampleEntity";

	/**
	 * The Constant ALL.
	 */
	public static final String ALL = PREFIX + ".all";

	/**
	 * The Constant BY_ID.
	 */
	public static final String BY_ID = PREFIX + ".by.id";

	/**
	 * The id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_sample_object_id")
	@Column(name = "sample_object_id", unique = true, nullable = false)
	private long id;

	/**
	 * The name.
	 */
	@Column(name = "name")
	private String name;

	/**
	 * The internal name.
	 */
	@Column(name = "internal_name")
	private String internalName;

	/**
	 * The created timestamp.
	 */
	@Column(name = "created_timestamp")
	private Date createdTimestamp;

	/**
	 * The updated timestamp.
	 */
	@Column(name = "updated_timestamp")
	private Date updatedTimestamp;

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
