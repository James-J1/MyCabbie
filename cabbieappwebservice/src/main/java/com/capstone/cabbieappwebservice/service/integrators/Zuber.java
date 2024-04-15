package com.capstone.cabbieappwebservice.service.integrators;

import java.util.ArrayList;

import com.capstone.cabbieappwebservice.model.Cab;
import com.capstone.cabbieappwebservice.model.CabCompany;
import com.capstone.cabbieappwebservice.model.Payment;
import com.capstone.cabbieappwebservice.service.IntegrationService;

public class Zuber extends IntegrationService{
	CabCompany cabcompany;

	public Zuber() {
		// TODO Auto-generated constructor stub
		cabcompany = new CabCompany();
		cabcompany.setCabCompanyName("Zuber");
		cabcompany.setCabCompanyRate(10.99);
		
		Cab cab1 = new Cab("","Larry","01","",3,0,10.99f );
		Cab cab2 = new Cab("","Carrie","02","",5,0,15.99f);
		Cab cab3 = new Cab("","Thomas","02","",10,0,30.99f);
		
		ArrayList<Cab> cabs = new ArrayList<Cab>();
		cabs.add(cab1);
		cabs.add(cab2);
		cabs.add(cab3);
		cabcompany.setCab(cabs);
	}

	@Override
	public CabCompany getCabCompany() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float getTotal(CabCompany order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String submitOrder(CabCompany order, Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

}
