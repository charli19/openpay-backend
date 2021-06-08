package com.openpay.app.common.exception;

import java.io.Serializable;

@SuppressWarnings("serial")
public class OpenPayException extends CustomException implements Serializable {

	private final String errorCode;
	private transient Object[] arguments; // NOSONAR

	public OpenPayException() {
		super();
		this.errorCode = null;
		this.arguments = null;
	}

	/**
	 * Get a custom error exception
	 * 
	 * @param errorCode
	 */
	public OpenPayException(String errorCode) {
		super(errorCode);
		this.errorCode = errorCode;
		this.arguments = null;
	}

	/**
	 * Get a custom error exception
	 * 
	 * @param errorCode
	 * @param e
	 */
	public OpenPayException(String errorCode, Exception e) {
		super(e);
		this.errorCode = errorCode;
		this.arguments = null;
	}

	/**
	 * Get a custom error exception
	 * 
	 * @param errorCode
	 * @param arguments
	 */
	public OpenPayException(String errorCode, Object... arguments) // NOPMD
	{
		super();
		this.errorCode = errorCode;
		this.arguments = arguments;
	}

	/**
	 * Get a custom error exception
	 * 
	 * @param errorCode
	 * @param arguments
	 * @param e
	 */
	public OpenPayException(String errorCode, Object[] arguments, Exception e) // NOPMD
	{
		super(e);
		this.errorCode = errorCode;
		this.arguments = arguments;
	}

	/**
	 * @return CustomError
	 */
	public String getErrorCode() {
		return this.errorCode;
	}

	/**
	 * @return Object[]
	 */
	public Object[] getArguments() {
		return this.arguments; // NOPMD
	}

}
