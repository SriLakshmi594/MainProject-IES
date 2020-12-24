package com.ashokit.ies.ies.DC.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "DC_Snap_Plan_Dtls")
public class SnapPlanEntity {

	@Id
	@Column(name = "Snap_Plan_Id")
	@GeneratedValue
	private Integer snapPlanId;

	@Column(name = "Case_Number",unique = true)
	private Integer caseId;

	@Column(name = "Name")
	private String name;
	
	@Column(name = "Plan_Name")
	private String planName;
   
	@Column(name = "Is_Working_Employee")
	private String workingEmp;

	@Column(name = "Other_Income")
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

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getWorkingEmp() {
		return workingEmp;
	}

	public void setWorkingEmp(String workingEmp) {
		this.workingEmp = workingEmp;
	}

	public String getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(String otherIncome) {
		this.otherIncome = otherIncome;
	}

	@Override
	public String toString() {
		return "SnapPlanEntity [snapPlanId=" + snapPlanId + ", caseId=" + caseId + ", name=" + name + ", planName="
				+ planName + ", workingEmp=" + workingEmp + ", otherIncome=" + otherIncome + "]";
	}

	

}
