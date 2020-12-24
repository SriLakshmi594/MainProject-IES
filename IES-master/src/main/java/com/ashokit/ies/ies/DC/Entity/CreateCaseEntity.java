package com.ashokit.ies.ies.DC.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;


@Entity
@Table(name = "DC_Case_Entity")
public class CreateCaseEntity {

	@Id
	@Column(name = "Case_Id")
	@GeneratedValue
	private Integer caseId;

	@Column(name = "Application_Number")
	private Integer appId;

	@Column(name = "First_Name")
	private String fname;

	@Column(name = "Last_Name")
	private String lname;

	@Column(name = "DateofBirth")
	private String dob;

	@Column(name = "SSN_No")
	private String ssn;

	@Column(name = "Gender")
	private String gender;

	@Column(name = "MobileNumber")
	private Long phno;

	@Column(name = "Email")
	private String email;

	@Column(name = "Updated_Date")
	@UpdateTimestamp
	private Date updateddate;

	@CreationTimestamp
	@Column(name = "Created_Date")
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
		return "CreateCaseEntity [caseId=" + caseId + ", appId=" + appId + ", fname=" + fname + ", lname=" + lname
				+ ", dob=" + dob + ", ssn=" + ssn + ", gender=" + gender + ", phno=" + phno + ", email=" + email
				+ ", updateddate=" + updateddate + ", createddate=" + createddate + "]";
	}
    
}
