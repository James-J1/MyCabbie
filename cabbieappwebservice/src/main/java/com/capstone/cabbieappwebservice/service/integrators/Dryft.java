package com.capstone.cabbieappwebservice.service.integrators;

import java.util.ArrayList;

import com.capstone.cabbieappwebservice.model.Cab;
import com.capstone.cabbieappwebservice.model.CabCompany;
import com.capstone.cabbieappwebservice.model.Payment;
import com.capstone.cabbieappwebservice.service.IntegrationService;

public class Dryft extends IntegrationService {
	CabCompany cabcompany;

	public Dryft() {
		// TODO Auto-generated constructor stub
		cabcompany = new CabCompany();
		cabcompany.setCabCompanyName("Dryft");
		cabcompany.setCabCompanyRate(7.99);
		
		Cab cab1 = new Cab("","Tom","01","",1,0,7.99f );
		Cab cab2 = new Cab("","Jerry","02","",3,0,10.99f);
		Cab cab3 = new Cab("","Terry","02","",6,0,20.99f);
		
		ArrayList<Cab> cabs = new ArrayList<Cab>();
		cabs.add(cab1);
		cabs.add(cab2);
		cabs.add(cab3);
		cabcompany.setCab(cabs);
	}
	
	@Override
	public CabCompany getCabCompany() {
		// TODO Auto-generated method stub
		return cabcompany;
	}

	@Override
	public Float getTotal(CabCompany order) {
		// TODO Auto-generated method stub
		//
		return 20.99f;
	}

	@Override
	public String submitOrder(CabCompany order, Payment payment) {
		// TODO Auto-generated method stub
		// call cab company API for submission
		return "success";
	}

	

}