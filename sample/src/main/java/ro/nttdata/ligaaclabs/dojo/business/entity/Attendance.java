package ro.nttdata.ligaaclabs.dojo.business.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Attendance JPA entity.
 *
 */
@SuppressWarnings("unused")
@Entity
@Table(name = "user_attendance", schema = "sample")
@NamedQuery(name = User.BY_WKS, query ="SELECT u FROM User u JOIN u.attendance a WHERE a.workshop = :workshop")
@SequenceGenerator(name = "sq_num_id", sequenceName = "sq_num_id", allocationSize = 1)
public class Attendance implements Serializable {
	/**
	 * UID for serialization.
	 */
	private static final long serialVersionUID = 6252015434537821354L;

	/**
	 * The Constant PREFIX.
	 */
	public static final String PREFIX = "ro.nttdata.ligaaclabs.sample.business.entity.UserEntity";
	/**
	 * The id for the attendance table.
	 */
	/**
	 * The Constant BY_WKS.
	 */
	public static final String BY_WKS = PREFIX + ".by.wks";
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_num_id")
	@Column(name = "num_id", unique = true, nullable = false, table = "user_attendance")
	private long numId;

	/**
	 * The timestamp.
	 */
	@Column(name = "created_timestamp", table = "user_attendance")
	private Date createdTimestamp;
	
	/**
	 * The workshop.
	 */
	@Column(name = "workshop", table = "user_attendance")
	private int workshop;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	

	// getters and setters

	/**
	 * Gets the id for the user_attendance table.
	 *
	 * @return the numId
	 */
	public long getNumId() {
		return this.numId;
	}

	/**
	 * Sets the id for the user_attendance table.
	 *
	 * @param numId
	 *            the numId to set
	 */
	public void setNumId(final long numId) {
		this.numId = numId;
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
	 * Gets the workshop.
	 *
	 * @return the workshop
	 */
	public int getWorkshop() {
		return workshop;
	}

	/**
	 * Sets the workshop
	 *
	 * @param workshop
	 *            the workshop to set
	 */
	public void setWorkshop(int workshop) {
		this.workshop = workshop;

	}

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	
	public User getUser() {
		return user;
	}
	/**
	 * Sets the user
	 *
	 * @param user
	 *           
	 */
	
	public void setUser(User user) {
		this.user = user;
	}

}
