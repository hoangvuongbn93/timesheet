package com.example.demo.repository;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.checkinCheckoutEntity;
import com.example.demo.entity.checkinCheckoutId;

@Repository
public interface checkinRepository extends CrudRepository<checkinCheckoutEntity, checkinCheckoutId> {
	@Transactional
	@Modifying
	@Query(value = "insert into checkin_checkout (Id_staff, work_day,start_time)"
			+ "values(:idStaff,:workDay,:startTime)",nativeQuery = true)
	void savecheckin(@Param("idStaff") String idStaff,@Param("workDay") LocalDate workDay,@Param("startTime") LocalDateTime startTime);
	
//	@Transactional
//	@Modifying
//	@Query(value = "UPDATE checkin_checkout "
//			+ " SET   end_time = :endTime"
//			+ "  WHERE Id_staff = :idStaff and work_day = :workday ", nativeQuery = true)
//	void updatecheckout(@Param("idStaff") String idStaff,@Param("workDay") LocalDate workDay,@Param("endTime") LocalDateTime endTime);        
}
