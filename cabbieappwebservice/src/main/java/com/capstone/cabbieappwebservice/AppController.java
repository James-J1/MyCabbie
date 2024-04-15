package com.capstone.cabbieappwebservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.cabbieappwebservice.model.CabCompany;
import com.capstone.cabbieappwebservice.model.Payment;
import com.capstone.cabbieappwebservice.model.Response;
import com.capstone.cabbieappwebservice.service.IntegrationServiceImpl;

@RestController
@RequestMapping("/api")
public class AppController {
	
	@Autowired
	IntegrationServiceImpl intergrationSrv;

	@PostMapping("/addtoshoppingcart")
	public CabCompany addToShoppingCart(CabCompany cabcompany) {
	
		float total = Float.parseFloat(intergrationSrv.getTotal(cabcompany));
		cabcompany.setTotal(total);
		
		return cabcompany ;
	}
	
	@GetMapping("/getcabcompany")
	public CabCompany getCabCompnay() {
		CabCompany cabcompany = new CabCompany();
		
		
		
		return cabcompany;
	}
	
	@PostMapping("/submitorder")
	public Response submitOrder(CabCompany cabcompany, Payment payment) {
		Response response = new Response();
		
		return response;
	}
}
