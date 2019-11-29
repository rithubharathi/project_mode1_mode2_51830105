package com.bankapp.services.exceptions;

public class ExceedsLimitException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ExceedsLimitException(String message) {
		super(message);
	}
	

}
