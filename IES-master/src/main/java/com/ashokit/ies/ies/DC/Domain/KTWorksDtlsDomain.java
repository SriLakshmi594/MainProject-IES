package com.ashokit.ies.ies.DC.Domain;

public class KTWorksDtlsDomain {

	private Integer ktPlanId;

	private Integer caseId;

	private String name;

	private String planName;

	private String qual;

	private String year;

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
		return "KTWorksDtlsDomain [ktPlanId=" + ktPlanId + ", caseId=" + caseId + ", name=" + name + ", planName="
				+ planName + ", qual=" + qual + ", year=" + year + ", grade=" + grade + "]";
	}

}
