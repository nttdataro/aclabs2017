package ro.nttdata.ligaaclabs.dojo.business.data;


/**
 * Data object corresponding to a detailed representation of user entities.
 *
 */
public class AttendanceUserDO {
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
	 * The workshop.
	 */
	private int workshop;

	/**
	 * Default constructor
	 */
	public AttendanceUserDO() {
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
	/**
	 * Gets the workshop.
	 *
	 * @return the workshop
	 */
	public int getWorkshop() {
		return workshop;
	}

	/**
	 * Sets the workshop.
	 *
	 * @param workshop
	 *            the workshop to set
	 */
	public void setWorkshop(int workshop) {
		this.workshop = workshop;
	}
}

