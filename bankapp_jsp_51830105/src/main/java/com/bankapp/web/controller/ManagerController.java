package com.bankapp.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.model.entities.Customer;
import com.bankapp.services.CustomerService;

@Controller
public class ManagerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(path="/allcustomer")
	public ModelAndView getCashTransaction(ModelAndView mv){
		mv.setViewName( "allcustomers");
		mv.addObject("customers",customerService.findAll() );
		return mv;
	}
	
	@GetMapping(path="/addcustomer")
	public ModelAndView getAddCustomer(ModelAndView mv){
		mv.setViewName( "addcustomer");
		mv.addObject("customerbean",new CustomerBean() );
		return mv;
	}
	
	@GetMapping(path="/updatecustomer")
	public ModelAndView postUpdate(ModelAndView mv,HttpServletRequest req){
		Long id=Long.parseLong(req.getParameter("id"));
		mv.setViewName( "addcustomer");
		mv.addObject("customerbean",customerService.findById(id));
		return mv;
	}
	
	@PostMapping(path="/addcustomer")
	public String postAddAndUpdateCustomer(@Valid Customer customer,HttpServletRequest req,BindingResult bindingResult){
		if(bindingResult==null){
			return "addcustomers";
		}else{
			if(customer.getId()==null){
				customerService.addCustomer(customer);
			}else{
				customerService.updateCustomer(customer);
			}
			return "redirect:allcustomer";
		}
	}
	
	@GetMapping(path="/deletecustomer")
	public String delete(ModelAndView mv,HttpServletRequest req){
		Long id=Long.parseLong(req.getParameter("id"));
		customerService.deleteCustomer(id);
		return "redirect:allcustomer";
	}
}
