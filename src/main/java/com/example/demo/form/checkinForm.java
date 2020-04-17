package com.example.demo.form;

import java.sql.Time;
import java.util.Date;

public class checkinForm {
	private Date workDay;
	private Time startTime;
	private Time breakTime;
	private Time endTime;
	
	public checkinForm() {
		
	}
	public Date getWorkDay() {
		return workDay;
	}
	public void setWorkDay(Date wodkDay) {
		this.workDay = wodkDay;
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
