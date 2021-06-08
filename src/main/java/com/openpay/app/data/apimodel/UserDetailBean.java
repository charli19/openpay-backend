package com.openpay.app.data.apimodel;

import java.io.Serializable;

public class UserDetailBean implements Serializable {

	private static final long serialVersionUID = 2662018113008745099L;

	private Long id;
	private String name;
	private String surname;
	private DocumentTypeBean documentType;
	private String documentNumber;

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public DocumentTypeBean getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentTypeBean documentType) {
		this.documentType = documentType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
}
