package com.ashokit.ies.ies.DC.Domain;

public class SnapDtlsDomain {

	private Integer snapPlanId;

	private Integer caseId;

	private String name;

	private String workingEmp;

	private String planName;

	private String otherIncome;

	public Integer getSnapPlanId() {
		return snapPlanId;
	}

	public void setSnapPlanId(Integer snapPlanId) {
		this.snapPlanId = snapPlanId;
	}

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWorkingEmp() {
		return workingEmp;
	}

	public void setWorkingEmp(String workingEmp) {
		this.workingEmp = workingEmp;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(String otherIncome) {
		this.otherIncome = otherIncome;
	}

	@Override
	public String toString() {
		return "SnapDtlsDomain [snapPlanId=" + snapPlanId + ", caseId=" + caseId + ", name=" + name + ", workingEmp="
				+ workingEmp + ", planName=" + planName + ", otherIncome=" + otherIncome + "]";
	}

}
