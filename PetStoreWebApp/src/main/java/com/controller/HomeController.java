package com.controller;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.*;
import com.model.*;

@Controller
public class HomeController {
	@RequestMapping("/")
	public ModelAndView getIndex() {
		ModelAndView mymv = new ModelAndView("/index");
		return mymv;
	}


			@ModelAttribute("pets")
			public Pets getPet()
			{
			Pets pets=new Pets();
			pets.setPetName("No Name");
			pets.setType("no type");
			pets.setAge(1);
			return pets;
			}

			@RequestMapping(value="/addpetdetails",method=RequestMethod.POST)
			public ModelAndView addPetDetails(@ModelAttribute("pets")Pets pets)
			{
			ModelAndView view=new ModelAndView("/success");
			view.addObject("newpet",pets);
			return view;
			}



	@RequestMapping("/petstore")
	public ModelAndView MyStore() {
		List<PetStore> petstore = new ArrayList<PetStore>();
		petstore.add(new PetStore("James Pet Store", "Aurangabad"));
		petstore.add(new PetStore("Tom Pet Store", "Nagpur"));
		petstore.add(new PetStore("Jerry Pet Store", "Jalna"));

		ModelAndView mymav1 = new ModelAndView("/PetStore");
		mymav1.addObject("petstore",petstore);
		return mymav1;
	}
	
	@RequestMapping("/addpet")
	public ModelAndView addPetModel() {
	ModelAndView addpetmodel = new ModelAndView("/AddPet");
		return addpetmodel;
	}
	
	
	@RequestMapping("/addcustomer")
	public ModelAndView addCustomerModel() {
		ModelAndView addcustomermodel = new ModelAndView("/AddCustomer");
		return addcustomermodel;
	}
	
	@RequestMapping(value="/addcustomerdetails", method=RequestMethod.POST)
	public ModelAndView addCustomerDetails(@RequestParam("customername") String customerName, @RequestParam("address") String address) {
		Customer c = new Customer(customerName,address);
		ModelAndView mycustomer = new ModelAndView("/Customer");
		mycustomer.addObject("newcustomer",c);
		return mycustomer;
	}
	
	
}
