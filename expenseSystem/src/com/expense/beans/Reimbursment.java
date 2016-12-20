package com.expense.beans;

import java.io.Serializable;

public class Reimbursment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6265055918629659183L;
	private int submissionId;
	private double amount;
	private String submittedTime;
	private String resolvedTime;
	private String description;
	private String user;
	private int submitterId;
	private int resolverId;
	private String status;
	private String type;
	
	
	public Reimbursment() {
		super();
	}
	
	public Reimbursment(int submissionId, double amount, String submittedTime, String resolvedTime, String description, int submitid, int rsvlid, String status, String type){
		this.submissionId = submissionId;
		this.amount = amount;
		this.submittedTime = submittedTime;
		this.resolvedTime = resolvedTime;
		this.description = description;
		this.submitterId =submitid;
		this.resolverId = rsvlid;
		this.status = status;
		this.type = type;
	}

	public Reimbursment(int submissionId, double amount, String description, int submitterId, String type) {
		this.submissionId = submissionId;
		this.amount = amount;
		this.description = description;
		this.submitterId = submitterId;
		this.type = type;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getSubmissionId() {
		return submissionId;
	}

	public void setSubmissionId(int submissionId) {
		this.submissionId = submissionId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getSubmittedTime() {
		return submittedTime;
	}

	public void setSubmittedTime(String submittedTime) {
		this.submittedTime = submittedTime;
	}

	public String getResolvedTime() {
		return resolvedTime;
	}

	public void setResolvedTime(String resolvedTime) {
		this.resolvedTime = resolvedTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getSubmitterId() {
		return submitterId;
	}

	public void setSubmitterId(int submitterId) {
		this.submitterId = submitterId;
	}

	public int getResolverId() {
		return resolverId;
	}

	public void setResolverId(int resolverId) {
		this.resolverId = resolverId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Reimbursment [submissionId=" + submissionId + ", amount=" + amount + ", submittedTime=" + submittedTime
				+ ", resolvedTime=" + resolvedTime + ", description=" + description + ", user=" + user
				+ ", submitterId=" + submitterId + ", resolverId=" + resolverId + ", status=" + status + ", type="
				+ type + "]";
	}
}
