package ro.nttdata.ligaaclabs.attendance.business.control;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import ro.nttdata.ligaaclabs.attendance.business.data.AttendanceDO;
import ro.nttdata.ligaaclabs.attendance.business.entity.AttendanceEntity;

/**
 * Controller for handling operations related to attendance entities.
 *
 */
public class AttendanceController {

	/**
	 * The Entity Manager.
	 */
	@Inject
	private EntityManager em;

	/**
	 * inserts the new entity in database using entityManager
	 * 
	 */
	public void insertUserAttendanceObject(AttendanceDO attendance) {
		em.persist(this.toInsertAttendanceDO(attendance));
	
	}

	/**
	 * 
	 * @param attendanceDO
	 * method that makes the mapping between AttendanceEntity and AttendanceDO
	 * @return AttendanceEntity
	 */	
	private AttendanceEntity toInsertAttendanceDO(AttendanceDO attendanceDO) {
		AttendanceEntity insertAttendanceEntity = new AttendanceEntity();
		insertAttendanceEntity.setAttendance_id((int)attendanceDO.getAttendance_id());
		insertAttendanceEntity.setFirstName(attendanceDO.getFirstName());
		insertAttendanceEntity.setLastName(attendanceDO.getLastName());
		insertAttendanceEntity.setCreatedTimestamp(attendanceDO.getCreatedTimestamp());
		insertAttendanceEntity.setDojo(attendanceDO.getDojo());
		insertAttendanceEntity.setLaboratory(attendanceDO.getLaboratory());
		return insertAttendanceEntity;
	}
}
