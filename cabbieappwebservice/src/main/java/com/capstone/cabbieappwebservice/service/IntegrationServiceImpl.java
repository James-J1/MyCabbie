package com.capstone.cabbieappwebservice.service;

import java.beans.JavaBean;

import com.capstone.cabbieappwebservice.model.CabCompany;
import com.capstone.cabbieappwebservice.model.Payment;

/*
 * Class manages the interaction between the cab company API and cabbieapp web service.
 */
@JavaBean
public class IntegrationServiceImpl implements IntegrationService{

	@Override
	public String getCabs() {
		// TODO Auto-generated method stub
		return "ok";
	}

	@Override
	public String getTotal(CabCompany order) {
		// TODO Auto-generated method stub
		return "ok";
	}

	@Override
	public String submitOrder(CabCompany order, Payment payment) {
		// TODO Auto-generated method stub
		return "ok";
	}

}
