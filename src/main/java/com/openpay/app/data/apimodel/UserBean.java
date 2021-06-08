package com.openpay.app.data.apimodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserBean implements Serializable {

	private static final long serialVersionUID = -8005339844019499367L;

	private Long id;
	private String name;
	private String surname;
	private DocumentTypeBean documentType;
	private String documentNumber;
	private List<WalletBean> wallets = new ArrayList<WalletBean>();

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

	public List<WalletBean> getWallets() {
		return wallets;
	}

	public void setWallets(List<WalletBean> wallets) {
		this.wallets = wallets;
	}
}
