package com.ashokit.ies.ies.ApplicationReg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "Citizen_Account_Entity")
/*
 * @SQLDelete(sql =
 * "UPDATE Citizen_Account_Entity SET Soft_Delete=true WHERE Citizen_Id=?")
 * 
 * // override delete command with update //@Where(clause =
 * "Soft_Delete = false") // remove if you want to show all records
 * 
 * //to show the records for both soft-deleted and not-deleted entries we can
 * use following
 * 
 * @FilterDef(name = "deletedCitizen_AccountFilter", parameters = @ParamDef(name
 * = "isDeleted", type = "boolean"))
 * 
 * @Filter(name = "deletedCitizen_AccountFilter", condition =
 * "deleted = :isDeleted")
 */
public class CitizenAccountEntity {
	@Id
	@Column(name = "Citizen_Application_Id")
	@GeneratedValue
	private Integer appId;

	@Column(name = "First_Name")
	private String fname;

	@Column(name = "Last_Name")
	private String lname;

	@Column(name = "Email")
	private String email;

	@Column(name = "DateofBirth")
	private String dob;

	@Column(name = "Gender")
	private String gender;

	@Column(name = "SSN_No")
	private String ssn;

	@Column(name = "MobileNumber")
	private Long phno;

	@Column(name = "Updated_Date")
	@UpdateTimestamp
	private Date updateddate;

	@CreationTimestamp
	@Column(name = "Created_Date")
	private Date createddate;

	@Column(name = "Soft_Delete")
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
		return "CitizenAccountEntity [appId=" + appId + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", dob=" + dob + ", gender=" + gender + ", ssn=" + ssn + ", phno=" + phno + ", updateddate="
				+ updateddate + ", createddate=" + createddate + ", deleted=" + deleted + "]";
	}

}
