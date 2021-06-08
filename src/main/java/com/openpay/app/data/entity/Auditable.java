package com.openpay.app.data.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class Auditable implements Serializable {

	private static final long serialVersionUID = 2966200175023523671L;

	@Column(name = "CREATED_DATE", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	@Column(name = "MODIFIED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDate;

	@Column(name = "CREATED_BY", updatable = false)
	private String createdBy;

	@Column(name = "MODIFIED_BY")
	private String lastModifiedBy;
	
	@Column(name = "IS_ACTIVE")
	private boolean active;

	public Auditable() {

	}

	public Auditable(Date createdDate, Date lastModifiedDate, String createdBy, String lastModifiedBy) {
		this.createdBy = createdBy;
		this.createdDate = createdDate != null ? new Date(createdDate.getTime()) : null;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedDate = lastModifiedDate != null ? new Date(lastModifiedDate.getTime()) : null;
	}

	public Date getCreatedDate() {
		return this.createdDate != null ? new Date(this.createdDate.getTime()) : null;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate != null ? new Date(createdDate.getTime()) : null;
	}

	public Date getLastModifiedDate() {
		return this.lastModifiedDate != null ? new Date(this.lastModifiedDate.getTime()) : null;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate != null ? new Date(lastModifiedDate.getTime()) : null;
	}

	public void initForUpdating(Auditable sourceEntity) {
		this.setCreatedBy(sourceEntity.getCreatedBy());
		this.setCreatedDate(sourceEntity.getCreatedDate());
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
}