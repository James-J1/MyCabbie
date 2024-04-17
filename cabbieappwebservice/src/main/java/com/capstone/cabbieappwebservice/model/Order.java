package com.capstone.cabbieappwebservice.model;


public class Order {
	
	CabCompany cabCompany;
	Payment payment;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(CabCompany cabCompany, Payment payment) {
		this.cabCompany = cabCompany;
		this.payment = payment;
	}
	public CabCompany getCabcompany() {
		return cabCompany; 
	}
	public void setCabcompany(CabCompany cabcompany) {
		this.cabCompany = cabcompany;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "Order [cabcompany=" + cabCompany + ", payment=" + payment + "]";
	}
}
