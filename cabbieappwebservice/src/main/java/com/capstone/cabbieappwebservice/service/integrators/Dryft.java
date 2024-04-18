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
		
		Cab cab1 = new Cab("", "Economy","A small two-door vehicle for short distances", "Larry", "01", "", 0, 1,7.99);
		Cab cab2 = new Cab("", "Sedan","A full-size sedan for family/friend group travel", "Jerry", "02", "", 0, 3,7.99);
		Cab cab3 = new Cab("","Suburban","A roomy suburban or equivalent for multiple group travel","Terry","03","",0,6,20.99);
		
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
	public void setTotal(CabCompany cabcompany) {
		// TODO Auto-generated method stub
		//
		cabcompany.setTotal(20.99f);
	}

/*	@Override
	public String submitOrder(ArrayList<CabCompany> , Payment payment) {
		// TODO Auto-generated method stub
		// call cab company API for submission
		return "success";
	}
*/
	public String submitOrder(CabCompany order, Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
