package ro.nttdata.ligaaclabs.attendance.business.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Attendance JPA entity.
 *
 */
@Entity
@Table(name = "attendanceTable", schema = "attendance")
@SequenceGenerator(name = "sqAttendanceObjectID", sequenceName = "sqAttendanceObjectID", allocationSize = 1)
public class AttendanceEntity implements Serializable {
	/**
	 * UID for serialization.
	 */
	private static final long serialVersionUID = 6252015434537821354L;

	/**
	 * The attendance id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sqAttendanceObjectID")
	@Column(name = "attendanceID", unique = true, nullable = false)
	private int attendanceID;

	/**
	 * The FirstName.
	 */
	@Column(name = "firstName")
	private String firstName;

	/**
	 * The last name.
	 */
	@Column(name = "lastName")
	private String lastName;

	/**
	 * The created timestamp.
	 */
	@Column(name = "createdTimestamp")
	private Date createdTimestamp;

	/**
	 * The dojo.
	 */
	@Column(name = "dojo")
	private String dojo;

	/**
	 * The laboratory.
	 */
	@Column(name = "laboratory")
	private String laboratory;

	/**
	 * Gets the attendance id.
	 *
	 * @return the attendance id
	 */
	public int getAttendanceID() {
		return attendanceID;
	}

	/**
	 * Sets the attendance id
	 *
	 * @param attendance id
	 *            the attendance id to set
	 */
	public void setAttendanceID(int attendanceID) {
		this.attendanceID = attendanceID;
	}

	/**
	 * Gets the creation firstName.
	 *
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the firstName.
	 *
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the lastName.
	 *
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the lastName.
	 *
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the dojo.
	 *
	 * @return the dojo
	 */
	public String getDojo() {
		return dojo;
	}

	/**
	 * Sets the dojo
	 *
	 * @param dojo
	 *            the dojo to set
	 */
	public void setDojo(String dojo) {
		this.dojo = dojo;
	}

	/**
	 * Gets the laboratory.
	 *
	 * @return the laboratory
	 */
	public String getLaboratory() {
		return laboratory;
	}

	/**
	 * Sets the laboratory.
	 *
	 * @param laboratory
	 *            the laboratory to set
	 */
	public void setLaboratory(String laboratory) {
		this.laboratory = laboratory;
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
