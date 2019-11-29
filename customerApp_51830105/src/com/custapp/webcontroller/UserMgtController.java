package com.custapp.webcontroller;

import javax.annotation.PostConstruct;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.custapp.model.persistance.Customer;
import com.custapp.model.persistance.User;
import com.custapp.model.persistance.UserNotFoundException;
import com.custapp.model.service.UserService;
import com.custapp.webcontroller.UserFormBean;

@Controller
public class UserMgtController {

	@Autowired
	private UserService userService;
	
	
	@PostConstruct
	public void init(){
		userService.addUser(new User("rithu@gmail.com","rithu","user",true));
		userService.addUser(new User("rama@gmail.com","rama","admin",true));
		userService.addUser(new User("sudhar@gmail.com","sudhar","manager",true));
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home(){
		return "redirect:login";
	}
	
	@RequestMapping(value="login")
	public String loginGet(ModelMap map,HttpServletRequest req){
		map.addAttribute("userbean", new UserFormBean());
		map.addAttribute("error", req.getParameter("error"));
		return "login";
		
	}
	@RequestMapping(value = "logout")
	public String logout(ModelMap map) {
		map.addAttribute("userbean", new UserFormBean());
		map.addAttribute("message", "you are successfully logged out!");
		return "login";
	}

	@SuppressWarnings("null")
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String loginPost(HttpServletRequest req,@Valid @ModelAttribute(value = "userbean") UserFormBean userbean,BindingResult bindingResult){
		User user=null;
		Customer c=null;
		if(bindingResult.hasErrors()){
			return "login";
		}
		else{
			try{
				user=userService.getUser(userbean.getuserId(),userbean.getPassword());
			}catch(UserNotFoundException e){
				return "redirect:login?error=login failed";
			}
			HttpSession httpSession=req.getSession();
			httpSession.setAttribute("user", user);
		}
			return "redirect:allusers";
	}

}
