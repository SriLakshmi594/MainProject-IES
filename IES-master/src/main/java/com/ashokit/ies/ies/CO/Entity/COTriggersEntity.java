package com.ashokit.ies.ies.CO.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "CO_Triggers_Table")
public class COTriggersEntity {

	@Id
	@Column(name = "Trgid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer trgId;

	@Column(name = "Case_Number")
	private Integer caseId;

	@Column(name = "Trg_Status")
	private String trgStatus; // running or pending

	@Column(name = "Updated_Date")
	@UpdateTimestamp
	private Date updateddate;

	@CreationTimestamp
	@Column(name = "Created_Date")
	private Date createddate;

	public Integer getTrgId() {
		return trgId;
	}

	public void setTrgId(Integer trgId) {
		this.trgId = trgId;
	}

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public String getTrgStatus() {
		return trgStatus;
	}

	public void setTrgStatus(String trgStatus) {
		this.trgStatus = trgStatus;
	}

	public Date getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	@Override
	public String toString() {
		return "COTriggersEntity [trgId=" + trgId + ", caseId=" + caseId + ", trgStatus=" + trgStatus + ", updateddate="
				+ updateddate + ", createddate=" + createddate + "]";
	}

}
