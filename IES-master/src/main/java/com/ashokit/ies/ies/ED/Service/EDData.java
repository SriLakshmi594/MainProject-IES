package com.ashokit.ies.ies.ED.Service;

public class EDData {

	private Integer Childrens;
	private Integer ccapPlanId;
	private Integer ktPlanId;
	private Integer snapPlanId;
	private Integer caseId;
	private String name;
	private String workingEmp;
	private String qual;
	private String planName;

	public Integer getChildrens() {
		return Childrens;
	}

	public void setChildrens(Integer childrens) {
		Childrens = childrens;
	}

	public Integer getCcapPlanId() {
		return ccapPlanId;
	}

	public void setCcapPlanId(Integer ccapPlanId) {
		this.ccapPlanId = ccapPlanId;
	}

	public Integer getKtPlanId() {
		return ktPlanId;
	}

	public void setKtPlanId(Integer ktPlanId) {
		this.ktPlanId = ktPlanId;
	}

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

	public String getQual() {
		return qual;
	}

	public void setQual(String qual) {
		this.qual = qual;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	@Override
	public String toString() {
		return "EDData [Childrens=" + Childrens + ", ccapPlanId=" + ccapPlanId + ", ktPlanId=" + ktPlanId
				+ ", snapPlanId=" + snapPlanId + ", caseId=" + caseId + ", name=" + name + ", workingEmp=" + workingEmp
				+ ", qual=" + qual + ", planName=" + planName + "]";
	}

}
