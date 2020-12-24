package com.ashokit.ies.ies.DC.Domain;

public class CcapDtlsDomain {

	private Integer ccapPlanId;

	private Integer caseId;

	private String name;

	private String planName;

	private Integer Childrens;

	private String childGender;

	private String childName;

	private String childDob;

	private String childSsn;

	public Integer getCcapPlanId() {
		return ccapPlanId;
	}

	public void setCcapPlanId(Integer ccapPlanId) {
		this.ccapPlanId = ccapPlanId;
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

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Integer getChildrens() {
		return Childrens;
	}

	public void setChildrens(Integer childrens) {
		Childrens = childrens;
	}

	public String getChildGender() {
		return childGender;
	}

	public void setChildGender(String childGender) {
		this.childGender = childGender;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public String getChildDob() {
		return childDob;
	}

	public void setChildDob(String childDob) {
		this.childDob = childDob;
	}

	public String getChildSsn() {
		return childSsn;
	}

	public void setChildSsn(String childSsn) {
		this.childSsn = childSsn;
	}

	@Override
	public String toString() {
		return "CcapDtlsDomain [ccapPlanId=" + ccapPlanId + ", caseId=" + caseId + ", name=" + name + ", planName="
				+ planName + ", Childrens=" + Childrens + ", childGender=" + childGender + ", childName=" + childName
				+ ", childDob=" + childDob + ", childSsn=" + childSsn + "]";
	}

}
