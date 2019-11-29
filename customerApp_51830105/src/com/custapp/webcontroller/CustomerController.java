package com.custapp.webcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.custapp.model.persistance.Customer;
import com.custapp.model.persistance.User;
import com.custapp.model.service.CustomerService;
import com.custapp.model.service.UserService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@RequestMapping(value="allusers",method=RequestMethod.GET)
	public String getCustomers(ModelMap map){
		map.addAttribute("customers",service.getAllCustomer());
		return "allusers";
	}
	
	/*@RequestMapping(value="viewdetails",method=RequestMethod.GET)
	public String viewDetails(ModelMap map,HttpServletRequest req){
		String email=req.getParameter("email").trim();
		Customer c=service.getCustomerByMailId(email);
		map.addAttribute("customer",c );
		return "viewdetails";
	}*/
	
	@RequestMapping(value="addcustomer",method=RequestMethod.GET)
	public String addCustomer(ModelMap map){
		map.addAttribute("customer", new Customer());
		return "addcustomer";
	}
		
	
	@RequestMapping(value="addcustomer",method=RequestMethod.POST)
	public String addCustomerPostUpdate(@Valid Customer customer,BindingResult bindingresult){
		if(bindingresult.hasErrors()){
				return "addcustomer";
			}else{
				if(customer.getId()==0)
					service.addCustomer(customer);
				else
					service.updateCustomer(customer);
				return "redirect:allusers";
			}
	}
	
	@RequestMapping(value="update",method=RequestMethod.GET)
	public String updateCustomer(HttpServletRequest req,ModelMap map){
		int id=Integer.parseInt(req.getParameter("id").trim());
		Customer customertobeupdated=service.getCustomerById(id);
		map.addAttribute("customer",customertobeupdated);
		return "addcustomer";
	}
	
	@RequestMapping(value="delete",method=RequestMethod.GET)
	public String deleteCustomer(HttpServletRequest req){
		int id=Integer.parseInt(req.getParameter("id").trim());
		service.deleteCustomer(id);
		return "redirect:allusers";
	}
	
}
