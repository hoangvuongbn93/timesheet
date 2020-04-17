package com.example.demo.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class checkinCheckoutId {
	@Column(name="Id_staff")
	private String idStaff;
	
	@Column(name="work_day")
	private Date 	workDay;
	
	public checkinCheckoutId() {
		
	}
	public checkinCheckoutId(String idStaff, Date workDay) {
		
		this.idStaff = idStaff;
		this.workDay = workDay;
	}
	
	public String getIdStaff() {
		return idStaff;
	}
	public void setIdStaff(String idStaff) {
		this.idStaff = idStaff;
	}
	public Date getWorkDay() {
		return workDay;
	}
	public void setWorkDay(Date workDay) {
		this.workDay = workDay;
	}
	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        checkinCheckoutId accountId = (checkinCheckoutId) o;
        return idStaff.equals(accountId.idStaff) &&
                workDay.equals(accountId.workDay);
    }
	 public int hashCode() {
	        return Objects.hash(idStaff, workDay);
	    }

}
