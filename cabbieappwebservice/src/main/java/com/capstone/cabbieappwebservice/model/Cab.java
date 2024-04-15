package com.capstone.cabbieappwebservice.model;
/*
 * Class represents a cab common to all cab companies
 */
public class Cab {
	String cabCompanyId;
	String driver;
	String number;
	String destination;
	Integer maxNumPassenger;
	int minutesETA;
	float rate;
	public Cab() {
		// TODO Auto-generated constructor stub
	}
	public Cab(String cabCompanyId, String driver, String number, String destination, Integer maxNumPassenger,
			int minutesETA, float rate) {
		this.cabCompanyId = cabCompanyId;
		this.driver = driver;
		this.number = number;
		this.destination = destination;
		this.maxNumPassenger = maxNumPassenger;
		this.minutesETA = minutesETA;
		this.rate =rate;
	}
	public String getCabCompanyId() {
		return cabCompanyId;
	}
	public void setCabCompanyId(String cabCompanyId) {
		this.cabCompanyId = cabCompanyId;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Integer getMaxNumPassenger() {
		return maxNumPassenger;
	}
	public void setMaxNumPassenger(Integer maxNumPassenger) {
		this.maxNumPassenger = maxNumPassenger;
	}
	public int getMinutesETA() {
		return minutesETA;
	}
	public void setMinutesETA(int minutesETA) {
		this.minutesETA = minutesETA;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Cab [cabCompanyId=" + cabCompanyId + ", driver=" + driver + ", number=" + number + ", destination="
				+ destination + ", maxNumPassenger=" + maxNumPassenger + ", minutesETA=" + minutesETA + ", rate=" + rate
				+ "]";
	}

}