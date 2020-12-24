package com.ashokit.ies.ies.ApplicationReg.domain;

import java.util.Date;

public class CitizenAccountDomain {

	private Integer appId;

	private String fname;

	private String lname;

	private String email;

	private String dob;

	private String gender;

	private String ssn;

	private Long phno;

	private Date updateddate;

	private Date createddate;

	private Boolean deleted;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
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

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "CitizenAccountDomain [appId=" + appId + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", dob=" + dob + ", gender=" + gender + ", ssn=" + ssn + ", phno=" + phno + ", updateddate="
				+ updateddate + ", createddate=" + createddate + ", deleted=" + deleted + "]";
	}

}
