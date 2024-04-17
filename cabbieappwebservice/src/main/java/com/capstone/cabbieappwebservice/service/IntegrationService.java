package com.capstone.cabbieappwebservice.service;

import com.capstone.cabbieappwebservice.model.CabCompany;
import com.capstone.cabbieappwebservice.model.Payment;

/*
 * Interface defines integration between the cab company API and web service
 */
public abstract class IntegrationService {
	// Call cab company API for cabs
	public abstract CabCompany getCabCompany();
	// Call cab company to get total for display
	public abstract void setTotal(CabCompany order);
	// Send order to cab company
	public abstract String submitOrder(CabCompany cabCompany, Payment payment);
	
}
