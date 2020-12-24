package com.ashokit.ies.ies.admin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "Account_Entity")

@SQLDelete(sql = "UPDATE Account_Entity SET Soft_Delete=true WHERE Account_Id=?")

//override delete command with update
//@Where(clause = "Soft_Delete = false") // remove if you want to show all records

//to show the records for both soft-deleted and not-deleted entries we can use following

@FilterDef(name = "deletedAccount_EntityFilter", parameters = @ParamDef(name = "isDeleted", type = "boolean"))
@Filter(name = "deletedAccount_EntityFilter", condition = "deleted = :isDeleted")
public class AccountAdminEntity {

	@Id
	@Column(name = "Account_Id")
	@GeneratedValue
	private Integer accId;

	@Column(name = "First_Name")
	private String fname;

	@Column(name = "Last_Name")
	private String lname;

	@Column(name = "Email")
	private String email;

	@Column(name = "Password")
	private String pwd;

	@Column(name = "SSN_No")
	private String ssn;

	@Column(name = "MobileNumber")
	private Long phno;

	@Column(name = "DateofBirth")
	private String dob;

	@Column(name = "Gender")
	private String gender;

	@Column(name = "Role")
	private String role;

	@Column(name = "Updated_Date")
	@UpdateTimestamp
	private Date updateddate;

	@CreationTimestamp
	@Column(name = "Created_Date")
	private Date createddate;

	@Column(name = "Account_Status")
	private String accstatus;

	@Column(name = "Soft_Delete")
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
		return "AccountAdminEntity [accId=" + accId + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", pwd=" + pwd + ", ssn=" + ssn + ", phno=" + phno + ", dob=" + dob + ", gender=" + gender + ", role="
				+ role + ", updateddate=" + updateddate + ", createddate=" + createddate + ", accstatus=" + accstatus
				+ ", deleted=" + deleted + "]";
	}

}
