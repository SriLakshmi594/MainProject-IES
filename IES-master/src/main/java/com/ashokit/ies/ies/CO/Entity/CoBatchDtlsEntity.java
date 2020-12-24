package com.ashokit.ies.ies.CO.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BATCH_RUN_DTLS")
public class CoBatchDtlsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CO_BATCH_RUN_SEQ")
	private Integer coBatchseq;

	@Column(name = "BATCH_NAME")
	private String batchName;

	@Column(name = "BATCH_RUN_STATUS")
	private String batchRunStatus;

	@Column(name = "INSTANCE_NUM")
	private Integer instance;

	@Column(name = "END_DATE")
	private Date endDate;

	@Column(name = "START_DATE")
	private Date startDate;

	public Integer getCoBatchseq() {
		return coBatchseq;
	}

	public void setCoBatchseq(Integer coBatchseq) {
		this.coBatchseq = coBatchseq;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getBatchRunStatus() {
		return batchRunStatus;
	}

	public void setBatchRunStatus(String batchRunStatus) {
		this.batchRunStatus = batchRunStatus;
	}

	public Integer getInstance() {
		return instance;
	}

	public void setInstance(Integer instance) {
		this.instance = instance;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "CoBatchDtlsEntity [coBatchseq=" + coBatchseq + ", batchName=" + batchName + ", batchRunStatus="
				+ batchRunStatus + ", instance=" + instance + ", endDate=" + endDate + ", startDate=" + startDate + "]";
	}

}
