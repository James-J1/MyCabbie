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
		
		Cab cab1 = new Cab("", "Sports Vehicle","A two-door sports vehicle for traveling in style", "Barry", "01", "", 0, 1, 10.99);
		Cab cab2 = new Cab("", "Full-Size","A luxury full-size sedan complete with amenities", "Carrie", "02", "", 0, 6, 15.99);
		Cab cab3 = new Cab("", "The Limousine","Take your party wherever they want in extreme comfor and luxury with this 15 person capacity limo", "Thomas", "03", "", 0, 15,30.99);
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
		cabcompany.setTotal(30.99f);
	}

	@Override
	public String submitOrder(CabCompany order, Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

}
