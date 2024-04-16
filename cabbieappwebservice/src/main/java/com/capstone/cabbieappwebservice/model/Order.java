package com.capstone.cabbieappwebservice.model;

import java.util.ArrayList;

public class Order {
	
	ArrayList<CabCompany> cabcompanies;
	Payment payment;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(ArrayList<CabCompany> cabcompanies, Payment payment) {
		super();
		this.cabcompanies = cabcompanies;
		this.payment = payment;
	}
	public ArrayList<CabCompany> getCabcompany() {
		return cabcompanies;
	}
	public void setCabcompany(ArrayList<CabCompany> cabcompanies) {
		this.cabcompanies = cabcompanies;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "Order [cabcompany=" + cabcompanies + ", payment=" + payment + "]";
	}
}
