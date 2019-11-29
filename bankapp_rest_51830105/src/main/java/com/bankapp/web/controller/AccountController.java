package com.bankapp.web.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.MyUser;
import com.bankapp.services.AccountService;
import com.bankapp.services.UserService;

@RestController
@RequestMapping("acc")
public class AccountController {
	
	@Autowired
	private AccountService accService;
	
	@Autowired
	private UserService userService;
	
	@PutMapping(path="/deposit")
	public ResponseEntity<Account> deposit(@RequestBody TransactionBean bean){
		accService.deposit(bean.getAccountNumber(), bean.getAmount());
		return new ResponseEntity<Account>(HttpStatus.OK);
	}
	@PutMapping(path="/withdraw")
	public ResponseEntity<Account> withdraw(@RequestBody TransactionBean bean){
		accService.withdraw(bean.getAccountNumber(), bean.getAmount());
		return new ResponseEntity<Account>(HttpStatus.OK);
	}
	
	@PutMapping(path="/transfer/")
	public ResponseEntity<Account> fundtreansfer(@RequestBody FundTransferBean fundTransferBean,Principal principal){
		Account account=null;
		MyUser user=null;
		if(principal!=null){
			user=userService.findByEmail(principal.getName());
			if(principal.getName().equals(user.getEmail()))
				account=accService.findAccountByName(user.getName());
		}
		Long fromAcc=account.getAccountNumber();
		accService.transfer(fromAcc, fundTransferBean.getToAccount(),fundTransferBean.getAmount());
		return new ResponseEntity<Account>(HttpStatus.OK);
	}
	
	/*@GetMapping(path="/checkbalance")
	public ResponseEntity<Account> checkbalance(Principal principal){
		Account account=null;
		MyUser user=null;
		if(principal!=null){
			user=userService.findByEmail(principal.getName());
			if(principal.getName().equals(user.getEmail()))
				account=accService.findAccountByName(user.getName());
		}
		return new ResponseEntity<Account>(accService.findByAccountNumber(account.getAccountNumber()),HttpStatus.OK);
	}*/
	
}
