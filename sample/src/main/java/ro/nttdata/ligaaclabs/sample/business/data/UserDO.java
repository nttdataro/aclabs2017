package ro.nttdata.ligaaclabs.sample.business.data;

/**
 * Data object storing basic information about sample entities.
 *
 */
public class UserDO {
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
	public UserDO() {
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
	 * Gets the firstName.
	 *
	 * @return the firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param first name
	 *            the first name to set
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	/**
	 * Gets the lastName.
	 *
	 * @return the lastName
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param last name
	 *            the last name to set
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

}
