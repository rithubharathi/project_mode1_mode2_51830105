package com.bankapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.AccountTransaction;
import com.bankapp.model.entities.TransactionLog;
import com.bankapp.model.repositories.AccountRepository;
import com.bankapp.model.repositories.CustomerRepository;
import com.bankapp.model.repositories.TransactionLogRepository;
import com.bankapp.services.exceptions.NotSufficientFundException;
import com.bankapp.services.exceptions.AccountNotFoundException;
import com.bankapp.services.exceptions.ExceedsLimitException;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private TransactionLogRepository transactionLogRepository;

	@Override
	public void blockAccount(Long accountNumber) {

	}

	@Override
	public void createAccount(Account account) {
		accountRepository.save(account);
		customerRepository.save(account.getCustomer());
	}

	@Override
	public void deposit(Long accountNumber, double amount) {
		Account account = accountRepository.findById(accountNumber).orElseThrow(AccountNotFoundException::new);
		account.setBalance(account.getBalance() + amount);
		AccountTransaction accountTransaction=new AccountTransaction("deposit", amount);
		account.addAccountTransaction(accountTransaction);
		accountRepository.save(account);
		TransactionLog log=new TransactionLog
				(accountNumber, null, "depoist", amount, "gunika", "done");
		transactionLogRepository.save(log);
		//accountTransactionRepository.save(accountTransaction);
	}

	@Override
	public void withdraw(Long accountNumber, double amount) {
		Account account = accountRepository.findById(accountNumber).orElseThrow(AccountNotFoundException::new);
		// min bal should be 1000 in any case
		if (account.getBalance() - amount < 1000)
			throw new NotSufficientFundException("Minimum balance should be maintained");
		else if(account.getBalance()<amount){
			throw new NotSufficientFundException("InSufficient amount");
		}
		else{
			account.setBalance(account.getBalance() - amount);
			accountRepository.save(account);
		}
	}

	
	@Override
	public void transfer(Long fromAccNumber, Long toAccNumber, double amount) {
		Account fromAccount = accountRepository.findByAccountNumber(fromAccNumber);
		Account toAccount = accountRepository.findByAccountNumber(toAccNumber);
		if(fromAccount.getBalance()<amount)
			throw new NotSufficientFundException("Insufficient amount in transfer");
		else if(amount>100000){
			throw new ExceedsLimitException("Amount transfered should be less than 100000");
		}
		else{
			fromAccount.setBalance(fromAccount.getBalance()-amount);
			toAccount.setBalance(toAccount.getBalance()+amount);
		}
		
	}

	@Override
	public Account findByAccountNumber(Long accountNumber) {
		return accountRepository.findByAccountNumber(accountNumber);
	}

	@Override
	public Account findAccountByName(String name) {
		return accountRepository.findAccountByName(name);
	}

}




