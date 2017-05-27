package ro.nttdata.ligaaclabs.attendance.business.data;

import java.util.Date;

/**
 * Data object storing basic information about attendance entities.
 *
 */
public class AttendanceDO {
	/**
	 * The attendance id.
	 */
	private int attendanceID;

	/**
	 * The firstName.
	 */
	private String firstName;

	/**
	 * The lastName.
	 */
	private String lastName;

	/**
	 * The created timestamp.
	 */
	private Date createdTimestamp;

	/**
	 * The dojo.
	 */
	private String dojo;

	/**
	 * The laboratory.
	 */
	private String laboratory;

	/**
	 * Default constructor
	 */
	public AttendanceDO() {
		super();
	}


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
