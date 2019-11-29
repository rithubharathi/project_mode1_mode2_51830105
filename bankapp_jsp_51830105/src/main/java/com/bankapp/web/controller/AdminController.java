package com.bankapp.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.model.entities.EmployeeDetails;
import com.bankapp.services.EmployeeService;

@Controller
public class AdminController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping(value="/allemployee")
	public ModelAndView getAllEmployee(ModelAndView mv){
		mv.setViewName("allemployee");
		mv.addObject("employees",empService.getAllEmployees());
		return mv;
	}
	
	@GetMapping(value="/addemployee")
	public ModelAndView getEmployeeDetails(ModelAndView mv){
		mv.setViewName("addemployee");
		mv.addObject("empdetails", new EmpBean());
		return mv;
	}
	@PostMapping(value="/addemployee")
	public String addEmployeePostUpdate(@Valid EmployeeDetails employeeDetails ,BindingResult bindingresult){
		if(bindingresult.hasErrors()){
				return "addemployee";
			}else{
				if(employeeDetails.getId()==null)
					empService.addEmployee(employeeDetails);
				else{
					empService.updateEmployeeDetails(employeeDetails);
				}
				return "redirect:allemployee";
			}
	}
	
	@GetMapping(value="/update")
	public ModelAndView updateEmployee(HttpServletRequest req,ModelAndView mv){
		Long id=Long.parseLong(req.getParameter("id").trim());
		mv.setViewName( "addemployee");
		mv.addObject("empdetails",empService.getEmployeerById(id));
		return mv;
	}
	
	@GetMapping(value="/delete")
	public String deleteEmployee(HttpServletRequest req){
		Long id=Long.parseLong(req.getParameter("id").trim());
		empService.deleteEmployee(id);
		return "redirect:allemployee";
	}
	
	/*@RequestMapping(value="/getemployee",method=RequestMethod.GET)
	public ModelAndView getEmployee(ModelAndView mv){
		mv.setViewName("get");
		mv.addObject("empbean",new EmpBean());
		return mv;
	}
	@RequestMapping(value="/getemployee",method=RequestMethod.POST)
	public ModelAndView getEmployee(ModelAndView mv,EmpBean empBean){
		mv.setViewName("getemployee");
		mv.addObject("empbean",userservice.getEmployeerById(empBean.getEmployeeId()));
		return mv;
	}*/

}
