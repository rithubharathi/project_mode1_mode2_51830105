package com.bankapp.services;

import com.bankapp.model.entities.Account;

public interface AccountService {
	void blockAccount(Long accountNumber);
    void createAccount(Account account );
    void deposit(Long accountNumber, double amount);
    void withdraw(Long accountNumber, double amount);
    void transfer(Long fromAccNumber, Long toAccNumber, double amount);
    Account findByAccountNumber( Long accountNumber);
	Account findAccountByName(String name);
}
