package com.ashokit.ies.ies.admin.domain;

import java.util.Date;

public class PlanAdminDomain {

	private Integer pid;

	private String planName;

	private String planDesp;

	private String planStartDate;

	private String planEndDate;

	private Date updateddate;

	private Date createddate;

	private Boolean deleted;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanDesp() {
		return planDesp;
	}

	public void setPlanDesp(String planDesp) {
		this.planDesp = planDesp;
	}

	public String getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(String planStartDate) {
		this.planStartDate = planStartDate;
	}

	public String getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(String planEndDate) {
		this.planEndDate = planEndDate;
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
		return "PlanAdminDomain [pid=" + pid + ", planName=" + planName + ", planDesp=" + planDesp + ", planStartDate="
				+ planStartDate + ", planEndDate=" + planEndDate + ", updateddate=" + updateddate + ", createddate="
				+ createddate + ", deleted=" + deleted + "]";
	}

}
