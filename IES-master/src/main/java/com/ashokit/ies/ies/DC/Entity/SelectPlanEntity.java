package com.ashokit.ies.ies.DC.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "DC_Case_Plans")
public class SelectPlanEntity {

	@Id
	@Column(name = "Selected_Plan_Id")
	@GeneratedValue
	private Integer selectedPlanId;

	
	@Column(name = "Case_Number",unique = true)//unique have effect on table creation
	private Integer caseId;

	@Column(name = "First_Name")
	private String fname;

	@Column(name = "Last_Name")
	private String lname;

	@Column(name = "Plan")
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
		return "SelectPlanEntity [selectedPlanId=" + selectedPlanId + ", caseId=" + caseId + ", fname=" + fname
				+ ", lname=" + lname + ", plan=" + plan + "]";
	}
	

}
