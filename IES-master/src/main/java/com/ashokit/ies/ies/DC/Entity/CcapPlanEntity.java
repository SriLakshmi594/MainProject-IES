package com.ashokit.ies.ies.DC.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DC_CCAP_Plan_Dtls")
public class CcapPlanEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CCAP_Plan_Id")
	private Integer ccapPlanId;

	@Column(name = "Case_Number")
	private Integer caseId;

	@Column(name = "Applicant_Name")
	private String name;
	
	@Column(name = "Plan_Name")
	private String planName;
	
	@Column(name = "No_Of_Childrens")
	private Integer Childrens;

	/*
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy = "assessment", cascade =
	 * CascadeType.ALL, orphanRemoval = true) private List<ChildDetailsforCcap>
	 * childDetails;
	 */

	@Column(name = "Child_Gender")
	private String childGender;

	@Column(name = "Child_Name")
	private String childName;

	@Column(name = "Child_DOB")
	private String childDob;

	@Column(name = "Child_SSN")
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
		return "CcapPlanEntity [ccapPlanId=" + ccapPlanId + ", caseId=" + caseId + ", name=" + name + ", planName="
				+ planName + ", Childrens=" + Childrens + ", childGender=" + childGender + ", childName=" + childName
				+ ", childDob=" + childDob + ", childSsn=" + childSsn + "]";
	}
	
	
	

}
