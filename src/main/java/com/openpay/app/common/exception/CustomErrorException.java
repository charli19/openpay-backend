package com.openpay.app.common.exception;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import com.openpay.app.common.exception.enumeration.CustomErrorEnum;
import com.openpay.app.common.spring.ApplicationContextProvider;

public class CustomErrorException extends RuntimeException implements Serializable {
	private static final long serialVersionUID = 186235860319036784L;
	private final CustomErrorEnum businessError;
	private transient Object[] arguments;

	/**
	 * Get a custom error exception
	 * 
	 * @param businessError
	 */
	public CustomErrorException(CustomErrorEnum businessError) {
		super();
		this.businessError = businessError;
		arguments = null;
	}

	/**
	 * Get a custom error exception
	 * 
	 * @param businessError
	 * @param e
	 */
	public CustomErrorException(CustomErrorEnum businessError, Exception e) {
		super(e);
		this.businessError = businessError;
		arguments = null;
	}

	/**
	 * Get a custom error exception
	 * 
	 * @param businessError
	 * @param arguments
	 */
	public CustomErrorException(CustomErrorEnum businessError, Object... arguments) {
		super();
		this.businessError = businessError;
		this.arguments = arguments;
	}

	/**
	 * @return CustomError
	 */
	public CustomErrorEnum getCustomError() {
		return businessError;
	}

	public String getTranslatedErrorMessage() {
		String response = "";
		if (arguments != null && arguments.length > 0 && StringUtils.isNotBlank(businessError.getMessageKey())) {
			response = ApplicationContextProvider.getMessage(businessError.getMessageKey(), arguments);
		} else if (StringUtils.isNotBlank(businessError.getMessageKey())) {
			response = ApplicationContextProvider.getMessage(businessError.getMessageKey());
		}
		return response;

	}

}
