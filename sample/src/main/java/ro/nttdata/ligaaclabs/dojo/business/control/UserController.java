package ro.nttdata.ligaaclabs.dojo.business.control;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import ro.nttdata.ligaaclabs.dojo.business.data.AttendanceUserDO;
import ro.nttdata.ligaaclabs.dojo.business.data.UserDO;
import ro.nttdata.ligaaclabs.dojo.business.entity.Attendance;
import ro.nttdata.ligaaclabs.dojo.business.entity.User;

/**
 * Controller for handling operations related to user and attendance.
 *
 */
@SuppressWarnings("unused")
public class UserController {

	/**
	 * The Entity Manager.
	 */
	@Inject
	private EntityManager em;

	/**
	 * Gets all the public data related to the user entities stored in the
	 * database.
	 * 
	 * @return the user data objects
	 */

	@SuppressWarnings("unchecked")
	public List<UserDO> getUserObjects() {
		final List<User> userEntities = this.em.createNamedQuery(User.ALL).getResultList();
		return userEntities.stream().map((se) -> this.toUserDO(se)).collect(Collectors.toList());
	}

	private UserDO toUserDO(User se) {
		UserDO userDO = new UserDO();
		userDO.setId(se.getId());
		userDO.setFirstName(se.getFirstName());
		userDO.setLastName(se.getLastName());
		return userDO;
	}

	/**
	 * Gets the user entity with the given ID
	 * 
	 * @param userEntityID
	 *            ID of the entity
	 * @return the details of the user entity
	 */
	public UserDO getUserEntity(String userEntityID) {
		TypedQuery<User> query = this.em.createNamedQuery(User.BY_ID, User.class);
		query.setParameter("id", Long.valueOf(userEntityID));
		List<User> resultList = query.getResultList();
		if (resultList == null || resultList.isEmpty()) {
			return null;
		}

		return toUserDO(query.getResultList().get(0));
	}

	/**
	 * Gets the user entity with the workshop
	 * 
	 * @param workshop
	 * 
	 * @return the details of the workshop attendance
	 */
	public List<AttendanceUserDO> getWorkshopAttendance(String workshopName) {
		List<AttendanceUserDO> result = new ArrayList<>();
		TypedQuery<User> query = this.em.createNamedQuery(User.BY_WKS, User.class);
		query.setParameter("workshop", Long.valueOf(workshopName));
		List<User> resultList = query.getResultList();
		if (resultList != null && !resultList.isEmpty()) {
			for (User userEntity : resultList) { // stream in java 8
				result.add(toAttendanceUserDO(userEntity, Integer.valueOf(workshopName)));
			}
		}

		return result;
	}

	private AttendanceUserDO toAttendanceUserDO(User userEntity, int wks) {
		AttendanceUserDO attendanceUserDO = new AttendanceUserDO();
		attendanceUserDO.setId(userEntity.getId());
		attendanceUserDO.setFirstName(userEntity.getFirstName());
		attendanceUserDO.setLastName(userEntity.getLastName());
		attendanceUserDO.setWorkshop(wks); // need review on @param wks
		return attendanceUserDO;
	}
}
