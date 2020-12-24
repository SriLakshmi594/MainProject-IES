package com.ashokit.ies.ies.ED.Bindings;

import java.time.LocalDate;

//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class EDPlanInfoBinding {

	private String planName;
	private String planStatus; // granted or denied
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private String benefitAmt;
	private Integer caseId;
	private String denialReason;

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

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public String getDenialReason() {
		return denialReason;
	}

	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}

	@Override
	public String toString() {
		return "EDPlanInfoBinding [planName=" + planName + ", planStatus=" + planStatus + ", planStartDate="
				+ planStartDate + ", planEndDate=" + planEndDate + ", benefitAmt=" + benefitAmt + ", caseId=" + caseId
				+ ", denialReason=" + denialReason + "]";
	}

}
