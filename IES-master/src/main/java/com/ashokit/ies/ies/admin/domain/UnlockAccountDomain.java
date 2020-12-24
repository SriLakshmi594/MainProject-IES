package com.ashokit.ies.ies.admin.domain;

public class UnlockAccountDomain {

	private String email;
	private String tempPwd;
	private String newPwd;
	private String cnfrmPwd;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTempPwd() {
		return tempPwd;
	}

	public void setTempPwd(String tempPwd) {
		this.tempPwd = tempPwd;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}

	public String getCnfrmPwd() {
		return cnfrmPwd;
	}

	public void setCnfrmPwd(String cnfrmPwd) {
		this.cnfrmPwd = cnfrmPwd;
	}

	@Override
	public String toString() {
		return "UnlockAccountDomain [email=" + email + ", tempPwd=" + tempPwd + ", newPwd=" + newPwd + ", cnfrmPwd="
				+ cnfrmPwd + "]";
	}

}
