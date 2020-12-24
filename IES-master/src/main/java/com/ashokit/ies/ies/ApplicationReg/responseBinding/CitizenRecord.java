package com.ashokit.ies.ies.ApplicationReg.responseBinding;

import java.util.Date;

public class CitizenRecord {

	private Long ssn;

	private String fname;

	private String lname;

	private String gender;

	private Date dob;

	private String state;

	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
		this.ssn = ssn;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "CitizenRecord [ssn=" + ssn + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", dob="
				+ dob + ", state=" + state + "]";
	}

}
