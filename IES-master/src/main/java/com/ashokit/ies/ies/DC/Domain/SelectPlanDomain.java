package com.ashokit.ies.ies.DC.Domain;


public class SelectPlanDomain {

	private Integer selectedPlanId;

	private Integer caseId;

	private String fname;

	private String lname;

	private String plan;

	public Integer getSelectedPlanId() {
		return selectedPlanId;
	}

	public void setSelectedPlanId(Integer selectedPlanId) {
		this.selectedPlanId = selectedPlanId;
	}

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "SelectPlanDomain [selectedPlanId=" + selectedPlanId + ", caseId=" + caseId + ", fname=" + fname
				+ ", lname=" + lname + ", plan=" + plan + "]";
	}

}
