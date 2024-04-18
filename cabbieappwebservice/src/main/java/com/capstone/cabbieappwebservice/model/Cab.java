package com.capstone.cabbieappwebservice.model;
/*
 * Class represents a cab common to all cab companies
 */
public class Cab {
	String cabCompanyId;
	String cabType;
	String description;
	String driver;
	String number;
	String destination;
	Integer distance;
	Integer maxNumPassenger;
	double rate;
	public Cab() {
		// TODO Auto-generated constructor stub
	}
	public Cab(String cabCompanyId, String cabType, String description, String driver, String number, String destination, Integer maxNumPassenger, Integer distance, double rate) {
		this.cabCompanyId = cabCompanyId;
		this.cabType = cabType;
		this.description = description;
		this.driver = driver;
		this.number = number;
		this.destination = destination;
		this.maxNumPassenger = maxNumPassenger;
		this.distance = distance;
		this.rate =rate;
	}
	public String getCabCompanyId() {
		return cabCompanyId;
	}
	public void setCabCompanyId(String cabCompanyId) {
		this.cabCompanyId = cabCompanyId;
	}
	public String getCabType() {
		return cabType;
	}
	public void setCabType(String cabType) {
		this.cabType = cabType;
	}
	public String getDescription() {
		return description;
	}
	public String description() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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

	public double getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Cab [cabCompanyId=" + cabCompanyId + ", cabType=" + cabType + ", description=" + description
				+ ", driver=" + driver + ", number=" + number + ", destination=" + destination + ", distance="
				+ distance + ", maxNumPassenger=" + maxNumPassenger + ", rate=" + rate + "]";
	}
	

}