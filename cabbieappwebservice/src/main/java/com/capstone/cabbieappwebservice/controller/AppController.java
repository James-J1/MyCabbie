package com.capstone.cabbieappwebservice.controller;

import java.util.ArrayList;	
import java.util.HashMap;
import java.util.Iterator;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.cabbieappwebservice.model.CabCompany;
import com.capstone.cabbieappwebservice.model.Order;
import com.capstone.cabbieappwebservice.model.Payment;
import com.capstone.cabbieappwebservice.model.Response;
import com.capstone.cabbieappwebservice.service.IntegrationService;
import com.capstone.cabbieappwebservice.service.integrators.Dryft;
import com.capstone.cabbieappwebservice.service.integrators.Zuber;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AppController {
	

	HashMap<String, IntegrationService> integrators;
	HashMap<String, CabCompany> shoppingCart;
	
	
	public AppController() {
		System.out.println("[AppController] constructor called.");
		shoppingCart = new HashMap<String, CabCompany>();
		integrators = new HashMap<String, IntegrationService>();
		Dryft integrator1 = new Dryft();
		Zuber integrator2 = new Zuber();
		
		integrators.put(integrator1.getCabCompany().getCabCompanyName(), integrator1);
		integrators.put(integrator2.getCabCompany().getCabCompanyName(), integrator2);
	}

	@PostMapping("/addtoshoppingcart")
	public ArrayList<CabCompany> addToShoppingCart(@RequestBody CabCompany cabCompany) {
		System.out.println("[AppController] addToShoppingCart called.");
		shoppingCart.put(cabCompany.getCabCompanyName(), cabCompany);
		Iterator<String> itr = shoppingCart.keySet().iterator();
		while(itr.hasNext()) {
			String key = (String) itr.next();
			IntegrationService integrator  = integrators.get(key);
			CabCompany scCabCompany = shoppingCart.get(key);
			integrator.setTotal(scCabCompany);
		}
		
		return new ArrayList<CabCompany>(shoppingCart.values()) ;
	}

	@PostMapping("/removefromshoppingcart")
	public ArrayList<CabCompany> removeFromShoppingCart(CabCompany cabcompany) {
		shoppingCart.remove(cabcompany.getCabCompanyName(), cabcompany);
		while(shoppingCart.keySet().iterator().hasNext()) {
			String key = shoppingCart.keySet().iterator().next();
			IntegrationService integrator  = integrators.get(key);
			CabCompany scCabCompany = shoppingCart.get(key);
			integrator.setTotal(scCabCompany);
		}
		
		return new ArrayList<CabCompany>(shoppingCart.values()) ;
		
	}

	@GetMapping("/getshoppingcart")
	public ArrayList<CabCompany> getShoppingCart(){
		return new ArrayList<CabCompany>(shoppingCart.values());
	}

	@GetMapping("/getcabcompanies")
	public ArrayList<CabCompany> getCabCompanies(){
		System.out.println("[AppController] getCabCompanies called.");
		ArrayList<CabCompany> cabCompanies = new ArrayList<CabCompany>();
		Iterator<String> itr = integrators.keySet().iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			cabCompanies.add(integrators.get(key).getCabCompany());
		}
		return cabCompanies;
	}

	@GetMapping("/getcabcompany")
	public CabCompany getCabCompany(@RequestParam String inegratorName) {
		System.out.println("[AppController] getCabCompany called.");
		IntegrationService integrator = integrators.get(inegratorName);
		
		
		
		return integrator.getCabCompany();
	}
	
	@PostMapping("/submitorder")
	public Response submitOrder(@RequestBody Order order) {
		System.out.println("[AppController] submitOrder called.");

		IntegrationService integrator = integrators.get(order.getCabcompany().getCabCompanyName());
		integrator.submitOrder(order.getCabcompany(), order.getPayment());
		
		Response response = new Response();
		response.setMessage("Successful");
		
		return response;
	}
}
