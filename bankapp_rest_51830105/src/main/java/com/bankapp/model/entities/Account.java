package com.bankapp.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="account_table")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long accountNumber;

	@Column(name = "balance")
	private Double balance;
	private String name;

	@OneToOne(mappedBy="account", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Customer customer;

	public boolean blocked;
	
	@OneToMany(mappedBy="account", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<AccountTransaction> transactionList = new ArrayList<>();
	
	public Account(Long accountNumber, String name,Double balance, boolean blocked) {
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance = balance;
		//this.customer = customer;
		this.blocked = blocked;
	}

	public Account() {}

	public void addAccountTransaction(AccountTransaction tx){
		transactionList.add(tx);
		tx.setAccount(this);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public List<AccountTransaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<AccountTransaction> transactionList) {
		this.transactionList = transactionList;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance="
				+ balance + ", customer=" + customer + ", blocked=" + blocked
				+ "]";
	}
	
	
	
	
}






