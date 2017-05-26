package ro.nttdata.ligaaclabs.dojo.business.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * User JPA entity.
 *
 */
@SuppressWarnings("unused")
@Entity
@Table(name = "user_table", schema = "dojo")
@NamedQueries({
		@NamedQuery(name = User.ALL, query = "SELECT u FROM User u"),
		@NamedQuery(name = User.BY_ID, query = "SELECT u FROM User u where u.id = :id"),})
@SequenceGenerator(name = "sq_user_id", sequenceName = "sq_user_id", allocationSize = 1)
public class User implements Serializable {
	/**
	 * UID for serialization.
	 */
	private static final long serialVersionUID = 6252015434537821354L;

	/**
	 * The Constant PREFIX.
	 */
	public static final String PREFIX = "ro.nttdata.ligaaclabs.sample.business.entity.UserEntity";

	/**
	 * The Constant ALL.
	 */
	public static final String ALL = PREFIX + ".all";

	/**
	 * The Constant BY_ID.
	 */
	public static final String BY_ID = PREFIX + ".by.id";
	/**
	 * The Constant BY_WKS.
	 */
	public static final String BY_WKS = PREFIX + ".by.wks";

	/**
	 * The id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_user_id")
	@Column(name = "user_id", unique = true, nullable = false, table = "user_table")
	private long id;

	/**
	 * The first name.
	 */
	@Column(name = "firstname", table = "user_table")
	private String firstName;

	/**
	 * The last name.
	 */
	@Column(name = "lastname", table = "user_table")
	private String lastName;
	
	@OneToMany(mappedBy = "user")
	private List<Attendance> attendance;
	
	// getters and setters
	
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
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName
	 *            the name to set
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * Gets the attendance.
	 *
	 * @return attendance
	 */
	
	public List<Attendance> getAttendance() {
		return attendance;
	}
	/**
	 * Sets the attendance.
	 *
	 * @param attendance
	 *           
	 */
 
	public void setAttendance(List<Attendance> attendance) {
		this.attendance = attendance;
	}
}
