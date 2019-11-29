package com.bankapp.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bankapp.model.entities.MyUser;
import com.bankapp.services.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping(path="/register")
	public String register(ModelMap map){
		map.addAttribute("registerbean", new RegisterBean());
		return "register";
	}
	@PostMapping(path="/register")
	public String registerPost(HttpServletRequest req){
		String name=req.getParameter("name").trim();
		String email=req.getParameter("email").trim();
		String pass=req.getParameter("password").trim();
		String cpass=req.getParameter("cPassword").trim();
		Boolean active=false;
		MyUser user=new MyUser(name,cpass,email,new String[]{"ROLE_CUSTOMER"},active);
		if(pass.equals(cpass)){
			userService.addUser(user);
			return "redirect:mylogin";
		}
		else{
			return "register";
		}
	}
	@GetMapping(path="/")
	public String homepage(){
		return "redirect:/home";
	}
	
	@GetMapping(path="/home")
	public String home(){
		return "home";
	}
	
	@GetMapping(path="/mylogin")
	public String login(){
		return "loginpage";
	}
	
	@GetMapping(path="/logout")
	public String logout(HttpServletResponse response,HttpServletRequest request,HttpSession session) throws IOException{
		response.setHeader("Cache-Control","no-cache");
		response.setHeader("Cache-Control","no-store");
		response.setHeader("Pragma","no-cache");
		response.setDateHeader ("Expires", 0);
		    if(session.getAttribute("token")==null){
		    response.sendRedirect(request.getContextPath() + "/loginpage.jsp");

		}

		return "loginpage";
	}
	
	@GetMapping(path="/accessdenied")
	public String accessDenied(){
		return "403";
	}
	
	@GetMapping(path="/admin")
	public String adminHome(){
		return "home_admin";
	}
	
	@GetMapping(path="/manager")
	public String managerHome(){
		return "home_manager";
	}
	@GetMapping(path="/customer")
	public String customerHome(){
		return "home_customer";
	}
}
