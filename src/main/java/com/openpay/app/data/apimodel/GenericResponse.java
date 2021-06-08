package com.openpay.app.data.apimodel;

import javax.ws.rs.core.Response.Status;

public class GenericResponse {

	private Status status = Status.OK;
	private String message;
	private Object data;
	
	public GenericResponse(String message, Object data) {
		this.message = message;
		this.data = data;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
}
