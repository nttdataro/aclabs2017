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
 * User JPA entity.
 *
 */
@SuppressWarnings("unused")
@Entity
@Table(name = "user_table", schema = "sample")
@NamedQueries({
		@NamedQuery(name = UserEntity.ALL, query = "SELECT s FROM UserEntity s"),
		@NamedQuery(name = UserEntity.BY_ID, query = "SELECT s FROM UserEntity s where s.id = :id"), })
@SequenceGenerator(name = "sq_user_id", sequenceName = "sq_user_id", allocationSize = 1)
public class UserEntity implements Serializable {
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
	 * The id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_user_id")
	@Column(name = "user_id", unique = true, nullable = false)
	private long id;

	/**
	 * The first name.
	 */
	@Column(name = "firstname")
	private String firstName;

	/**
	 * The last name.
	 */
	@Column(name = "lastname")
	private String lastName;


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

}
