package com.ashokit.ies.ies.ED.Entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;


@Entity
@Table(name = "ELIGIBILITY_DETAILS")
public class EDPlanInfoEntity {

	@Id
	@Column(name = "ed_trace__ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer edId;

	@Column(name = "Plan_Name")
	private String planName;

	@Column(name = "Plan_Status")
	private String planStatus; // granted or denied

	@Column(name = "Plan_Start_Date")
	private LocalDate planStartDate;  
	

	@Column(name = "Plan_End_Date")
	private LocalDate planEndDate;

	@Column(name = "Benifit_Amount")
	private String benefitAmt;

	@Column(name = "Denial_Reason")
	private String denialReason;

	@Column(name = "Case_Id")
	private Integer caseId;
	
	@Column(name = "Updated_Date")
	@UpdateTimestamp
	private Date updateddate;

	@CreationTimestamp
	@Column(name = "Created_Date")
	private Date createddate;

	public Integer getEdId() {
		return edId;
	}

	public void setEdId(Integer edId) {
		this.edId = edId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public LocalDate getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(LocalDate planStartDate) {
		this.planStartDate = planStartDate;
	}

	public LocalDate getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}

	public String getBenefitAmt() {
		return benefitAmt;
	}

	public void setBenefitAmt(String benefitAmt) {
		this.benefitAmt = benefitAmt;
	}

	public String getDenialReason() {
		return denialReason;
	}

	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
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
		return "EDPlanInfoEntity [edId=" + edId + ", planName=" + planName + ", planStatus=" + planStatus
				+ ", planStartDate=" + planStartDate + ", planEndDate=" + planEndDate + ", benefitAmt=" + benefitAmt
				+ ", denialReason=" + denialReason + ", caseId=" + caseId + ", updateddate=" + updateddate
				+ ", createddate=" + createddate + "]";
	}
    
}
