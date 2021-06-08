package com.openpay.app.common.exception.enumeration;

import org.springframework.http.HttpStatus;

public enum CustomErrorEnum {

	REGISTER_NOT_FOUND(-40002, "error.element.notFound", HttpStatus.NOT_FOUND);

	private Integer code;
	private String messageKey;
	private HttpStatus httpStatus;

	private CustomErrorEnum(Integer code, String messageKey, HttpStatus httpStatus)
	{
		this.code = code;
		this.messageKey = messageKey;
		this.httpStatus = httpStatus;

	}

	public Integer getCode()
	{
		return code;
	}

	public String getMessageKey()
	{
		return messageKey;
	}

	public HttpStatus getHttpStatus()
	{
		return httpStatus;
	}

}
