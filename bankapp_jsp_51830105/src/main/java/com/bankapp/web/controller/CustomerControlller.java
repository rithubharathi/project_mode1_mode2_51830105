package com.bankapp.web.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.model.entities.Customer;
import com.bankapp.services.CustomerService;

public class CustomerControlller {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(value="/add")
	public String addProfile(ModelMap map){
		map.addAttribute("userdetail",new CustomerBean());
		return "profile";
	}
	
	@GetMapping(value="/profile")
	public ModelAndView getProfile(ModelAndView mv,Principal principal){
		mv.setViewName("profile");
		mv.addObject("userdetail",customerService.findByEmail(principal.getName()));
		return mv;
	}
	@PostMapping(value="/add")
	public String addProfilePostUpdate(@Valid Customer customer,BindingResult bindingresult){
		if(bindingresult.hasErrors()){
				return "addcustomer";
			}
		else{
				if(customer.getId()==0)
					customerService.addCustomer(customer);
				else{
					customerService.updateCustomer(customer);
				}
				return "redirect:profile";
			}
	}
}
