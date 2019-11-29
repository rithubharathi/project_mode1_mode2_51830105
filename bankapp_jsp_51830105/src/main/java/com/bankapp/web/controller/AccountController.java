package com.bankapp.web.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.MyUser;
import com.bankapp.services.AccountService;
import com.bankapp.services.UserService;

@Controller
public class AccountController {
	
	@Autowired
	private AccountService accService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping(path="/checkbalance")
	public ModelAndView getCheckbalance(Principal principal,ModelAndView mv){
		Account account=null;
		MyUser user=null;
		if(principal!=null){
			user=userService.findByEmail(principal.getName());
			if(principal.getName().equals(user.getEmail()))
				account=accService.findAccountByName(user.getName());
		}
		mv.setViewName( "viewbalance");
		mv.addObject("account",accService.findByAccountNumber(account.getAccountNumber()));
		return mv;
	}
	
	
	@GetMapping(path="/cashtransaction")
	public ModelAndView getCashTransaction(ModelAndView mv){
		mv.setViewName( "cashtransaction");
		mv.addObject("TransactionBean", new TransactionBean());
		return mv;
	}
	
	@PostMapping(path="/deposit")
	public String postDeposit(HttpServletRequest req){
		Long accNumber=Long.parseLong(req.getParameter("accountNumber"));
		Double amount=Double.parseDouble(req.getParameter("amount"));
		accService.deposit(accNumber, amount);
		return "redirect:checkbalance";
	}
	@PostMapping(path="/withdraw")
	public String postWithdraw(HttpServletRequest req){
		Long accNumber=Long.parseLong(req.getParameter("accountNumber"));
		Double amount=Double.parseDouble(req.getParameter("amount"));
		accService.withdraw(accNumber, amount);
		return "redirect:checkbalance";
	}
	
	@GetMapping(path="/transfer")
	public ModelAndView getFundtreansfer(ModelAndView mv){
		mv.setViewName( "fundTransfer");
		mv.addObject("fundtransferbean", new FundTransferBean());
		return mv;
	}
	
	@PostMapping(path="/transfer")
	public String postFundtreansfer(HttpServletRequest req,Principal principal){
		Account account=null;
		MyUser user=null;
		if(principal!=null){
			user=userService.findByEmail(principal.getName());
			if(principal.getName().equals(user.getEmail()))
				account=accService.findAccountByName(user.getName());
		}
		Long fromAcc=account.getAccountNumber();
		Long toAcc=Long.parseLong(req.getParameter("toAccount"));
		Double amount=Double.parseDouble(req.getParameter("amount"));
		accService.transfer(fromAcc, toAcc, amount);
		return "redirect:checkbalance";
	}
	
	@GetMapping(path="/back")
	public String back(){
		return "redirect:customer";
	}
}
