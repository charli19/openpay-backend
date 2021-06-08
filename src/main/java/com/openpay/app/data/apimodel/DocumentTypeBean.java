package com.openpay.app.data.apimodel;

import java.io.Serializable;

public class DocumentTypeBean implements Serializable {

	private static final long serialVersionUID = -1879304694000155433L;

	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
