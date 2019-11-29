package com.bankapp.web.controller;

import org.hibernate.validator.constraints.NotEmpty;

public class FundTransferBean {
	@NotEmpty(message="from account can't be left blank!")
	private Long fromAccount;
	@NotEmpty(message="toAccount can't be left blank!")
	private Long toAccount;
	private Double amount;
	
	public Long getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(Long fromAccount) {
		this.fromAccount = fromAccount;
	}
	public long getToAccount() {
		return toAccount;
	}
	public void setToAccount(Long toAccount) {
		this.toAccount = toAccount;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
}
