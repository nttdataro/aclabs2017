package ro.nttdata.ligaaclabs.sample.business.data;

import java.util.Date;

/**
 * Data object corresponding to a detailed representation of sample entities.
 *
 */
public class DetailedUserDO {
	/**
	 * The id.
	 */
	private long id;

	/**
	 * The first name.
	 */
	private String firstName;

	/**
	 * The last name.
	 */
	private String lastName;

	/**
	 * Default constructor
	 */
	public DetailedUserDO() {
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
	 * Gets the first name.
	 *
	 * @return the firstName
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
}
