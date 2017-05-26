package ro.nttdata.ligaaclabs.sample.business.control;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import ro.nttdata.ligaaclabs.sample.business.data.AttendanceUserDO;
import ro.nttdata.ligaaclabs.sample.business.data.DetailedUserDO;
import ro.nttdata.ligaaclabs.sample.business.data.UserDO;
import ro.nttdata.ligaaclabs.sample.business.entity.Attendance;
import ro.nttdata.ligaaclabs.sample.business.entity.User;

/**
 * Controller for handling operations related to sample entities.
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
	public DetailedUserDO getUserEntity(String userEntityID) {
		TypedQuery<User> query = this.em.createNamedQuery(User.BY_ID, User.class);
		query.setParameter("id", Long.valueOf(userEntityID));
		List<User> resultList = query.getResultList();
		if (resultList == null || resultList.isEmpty()) {
			return null;
		}

		return toDetailedUserDO(query.getResultList().get(0));
	}

	private DetailedUserDO toDetailedUserDO(User se) {
		DetailedUserDO detailedUserDO = new DetailedUserDO();
		detailedUserDO.setId(se.getId());
		detailedUserDO.setFirstName(se.getFirstName());
		detailedUserDO.setLastName(se.getLastName());

		return detailedUserDO;
	}
<<<<<<< Updated upstream

	/**
	 * Gets the user entity with the workshop
	 * 
	 * @param workshop
	 * 
	 * @return the details of the workshop attendance
	 */
	public List<AttendanceUserDO> getWorkshopAttendance(String workshopName) {
		TypedQuery<UserEntity> query = this.em.createNamedQuery(UserEntity.BY_WKS, UserEntity.class);
		query.setParameter("workshop", Long.valueOf(workshopName));
		List<UserEntity> resultList = query.getResultList();
		if (resultList == null || resultList.isEmpty()) {
			return null;
		}
		List<AttendanceUserDO> result = new ArrayList<>();
		for (UserEntity userEntity : resultList) {
			result.add(toAttendanceUserDO(userEntity));
		}
		return result;
	}

	private AttendanceUserDO toAttendanceUserDO(UserEntity se) {
		AttendanceUserDO attendanceUserDO = new AttendanceUserDO();
		attendanceUserDO.setId(se.getId());
		attendanceUserDO.setFirstName(se.getFirstName());
		attendanceUserDO.setLastName(se.getLastName());
		attendanceUserDO.setWorkshop(se.getWorkshop());
		return attendanceUserDO;
	}
||||||| merged common ancestors
=======

	/**
	 * Gets the user entity with the workshop
	 * 
	 * @param workshop
	 * 
	 * @return the details of the workshop attendance
	 */
	public List<AttendanceUserDO> getWorkshopAttendance(String workshopName) {
		TypedQuery<User> query = this.em.createNamedQuery(User.BY_WKS, User.class);
		query.setParameter("workshop", Long.valueOf(workshopName));
		List<User> resultList = query.getResultList();
		if (resultList == null || resultList.isEmpty()) {
			return null;
		}
		List<AttendanceUserDO> result = new ArrayList<>();
		for (User userEntity : resultList) {
			result.add(toAttendanceUserDO(userEntity, Integer.valueOf(workshopName)));
		}
		return result;
	}

	private AttendanceUserDO toAttendanceUserDO(User userEntity, int wks) {
		AttendanceUserDO attendanceUserDO = new AttendanceUserDO();
		attendanceUserDO.setId(userEntity.getId());
		attendanceUserDO.setFirstName(userEntity.getFirstName());
		attendanceUserDO.setLastName(userEntity.getLastName());
		attendanceUserDO.setWorkshop(wks); 
		return attendanceUserDO;
	}
>>>>>>> Stashed changes
}
