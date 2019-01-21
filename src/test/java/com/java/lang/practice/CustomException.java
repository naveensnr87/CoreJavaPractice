package com.java.lang.practice;

public class CustomException extends Exception {

	private static final long serialVersionUID = 2373186207227495043L;
	private String errorDescription;

	public CustomException() {

	}

	public CustomException(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	@Override
	public String toString() {
		if (null != errorDescription) {
			return errorDescription;
		}
		return "CustomCheckedException - Exception thrown";
	}
}
