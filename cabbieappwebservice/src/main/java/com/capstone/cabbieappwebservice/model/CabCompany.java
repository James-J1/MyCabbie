package com.capstone.cabbieappwebservice.model;

import java.util.ArrayList;

/*
 * Class envelope for cabs for specific companies
 */
public class CabCompany {
	String cabCompanyName; //displayed in front end
	double cabCompanyRate; //displayed in front end
	ArrayList<Cab> cab; //populated by front end
	Float total;
	public CabCompany() {
		// TODO Auto-generated constructor stub
	}
	public CabCompany(String cabCompanyName, double cabCompanyRate, ArrayList<Cab> cab, Float total) {
		super();
		this.cabCompanyName = cabCompanyName;
		this.cabCompanyRate = cabCompanyRate;
		this.cab = cab;
		this.total = total;
	}
	public String getCabCompanyName() {
		return cabCompanyName;
	}
	public void setCabCompanyName(String cabCompanyName) {
		this.cabCompanyName = cabCompanyName;
	}
	public double getCabCompanyRate() {
		return cabCompanyRate;
	}
	public void setCabCompanyRate(double cabCompanyRate) {
		this.cabCompanyRate = cabCompanyRate;
	}
	public ArrayList<Cab> getCabs() {
		return cab;
	}
	public void setCab(ArrayList<Cab> cab) {
		this.cab = cab;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "CabCompany [cabCompanyName=" + cabCompanyName + ", cabCompanyRate=" + cabCompanyRate + ", cabCompanies="
				+ cab + ", total=" + total + "]";
	}
}
