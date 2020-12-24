package com.ashokit.ies.ies.CO.Entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CO_PDFS")
public class CoPdfsEntity {
	@Id
	@Column(name = "CO_PDF_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer coPdfId;

	@Column(name = "PLAN_STATUS")
	String planStatus;

	@Column(name = "CASE_Number")
	String caseNumber;

	@Column(name = "PDF_DOCUMENT")
	private Blob pdfDoc;

	@Column(name = "PLAN_NAME")
	String planName;

	public Integer getCoPdfId() {
		return coPdfId;
	}

	public void setCoPdfId(Integer coPdfId) {
		this.coPdfId = coPdfId;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public Blob getPdfDoc() {
		return pdfDoc;
	}

	public void setPdfDoc(Blob pdfDoc) {
		this.pdfDoc = pdfDoc;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	@Override
	public String toString() {
		return "CoPdfsEntity [coPdfId=" + coPdfId + ", planStatus=" + planStatus + ", caseNumber=" + caseNumber
				+ ", pdfDoc=" + pdfDoc + ", planName=" + planName + "]";
	}

}
