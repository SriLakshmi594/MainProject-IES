package com.ashokit.ies.ies.DC.Domain;

import java.util.Date;

public class CreateCaseDomain {

	private Integer caseId;

	private Integer appId;

	private String fname;

	private String lname;

	private String dob;

	private String ssn;

	private String gender;

	private Long phno;

	private String email;

	private Date updateddate;

	private Date createddate;

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	@Override
	public String toString() {
		return "CreateCaseDomain [caseId=" + caseId + ", appId=" + appId + ", fname=" + fname + ", lname=" + lname
				+ ", dob=" + dob + ", ssn=" + ssn + ", gender=" + gender + ", phno=" + phno + ", email=" + email
				+ ", updateddate=" + updateddate + ", createddate=" + createddate + "]";
	}

}
