package com.capstone.cabbieappwebservice.service;

import com.capstone.cabbieappwebservice.model.CabCompany;
import com.capstone.cabbieappwebservice.model.Payment;
import com.capstone.cabbieappwebservice.model.Response;


/*
 * Interface defines interaction between frontend and backend
 */
public interface OrderService {

	public Response addToShoppingCart(CabCompany order);
	public Float getTotal(CabCompany order);
	public Response submitOrder(CabCompany order, Payment payment);
	public CabCompany getCabCompanies();
	
}
