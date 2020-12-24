package com.ashokit.ies.ies.DC.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "DC_KT_Works_Plan_Dtls")
public class KTWorksEntity {

	@Id
	@Column(name = "KT_Works_Plan_Id")
	@GeneratedValue
	private Integer ktPlanId;

	@Column(name = "Case_Number",unique = true)
	private Integer caseId;

	@Column(name = "Name")
	private String name;
	
	@Column(name = "Plan_Name")
	private String planName;
   
	@Column(name = "Qualification")
	private String qual;
	
	@Column(name = "Year_Of_Passing")
	private String year;

	@Column(name = "Grades_Secured")
	private String grade;

	public Integer getKtPlanId() {
		return ktPlanId;
	}

	public void setKtPlanId(Integer ktPlanId) {
		this.ktPlanId = ktPlanId;
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

	public String getQual() {
		return qual;
	}

	public void setQual(String qual) {
		this.qual = qual;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "KTWorksEntity [ktPlanId=" + ktPlanId + ", caseId=" + caseId + ", name=" + name + ", planName="
				+ planName + ", qual=" + qual + ", year=" + year + ", grade=" + grade + "]";
	}
	

}
