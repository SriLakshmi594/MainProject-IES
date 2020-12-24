package com.ashokit.ies.ies.admin.domain;

import java.util.Date;

public class AccountAdminDomain {

	private Integer accId;

	private String fname;

	private String lname;

	private String email;

	private String pwd;

	private String ssn;

	private Long phno;

	private String dob;

	private String gender;

	private String role;

	private Date updateddate;

	private Date createddate;

	private String accstatus;

	private Boolean deleted;

	public Integer getAccId() {
		return accId;
	}

	public void setAccId(Integer accId) {
		this.accId = accId;
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public String getAccstatus() {
		return accstatus;
	}

	public void setAccstatus(String accstatus) {
		this.accstatus = accstatus;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "AccountAdminDomain [accId=" + accId + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", pwd=" + pwd + ", ssn=" + ssn + ", phno=" + phno + ", dob=" + dob + ", gender=" + gender + ", role="
				+ role + ", updateddate=" + updateddate + ", createddate=" + createddate + ", accstatus=" + accstatus
				+ ", deleted=" + deleted + "]";
	}

}
