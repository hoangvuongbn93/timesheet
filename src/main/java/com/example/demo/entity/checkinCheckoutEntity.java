package com.example.demo.entity;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.EmbeddedId;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="checkin_checkout")

public class checkinCheckoutEntity {
	
	@EmbeddedId
	private checkinCheckoutId checkinCheckoutId;
	
	
	@Column(name ="start_time")
	private Time startTime;
	
	@Column(name ="break_time")
	private Time breakTime;
	
	@Column(name ="end_time")
	private Time endTime;
	
	
//	public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        checkinCheckoutEntity accountId = (checkinCheckoutEntity) o;
//        return idStaff.equals(accountId.idStaff) &&
//                workDay.equals(accountId.workDay);
//    }
//	 public int hashCode() {
//	        return Objects.hash(idStaff, workDay);
//	    }
	
	public checkinCheckoutEntity() {
		
	}


	public checkinCheckoutEntity(checkinCheckoutId chekinCheckoutId, Time startTime, Time breakTime, Time endTime) {
		
		this.checkinCheckoutId = checkinCheckoutId;
		this.startTime = startTime;
		this.breakTime = breakTime;
		this.endTime = endTime;
	}


	public checkinCheckoutId getCheckincheckoutId() {
		return checkinCheckoutId;
	}


	public void setCheckincheckoutId(checkinCheckoutId checkincheckoutId) {
		this.checkinCheckoutId = checkincheckoutId;
	}


	public Time getStartTime() {
		return startTime;
	}


	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}


	public Time getBreakTime() {
		return breakTime;
	}


	public void setBreakTime(Time breakTime) {
		this.breakTime = breakTime;
	}


	public Time getEndTime() {
		return endTime;
	}


	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}



}
