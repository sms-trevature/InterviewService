package com.revature.dtos;

import java.util.Date;

import com.revature.models.Interview;

/**
 * DTO class for storing associate interview job description data.
 */
public class InterviewAssociateJobData {
	
	/** The Interview date. */
	private Date InterviewDate;
	
	/** The associate email. */
	private String assocEmail;
	
	/** The associate name. */
	private String assocName;
	
	/** The job description. */
	private boolean JD;
	
	/**
	 * Instantiates a new interview associate job data.
	 *
	 * @param I the interview
	 */
	public InterviewAssociateJobData(Interview I){
		this.InterviewDate = I.getScheduled();
		this.assocEmail = I.getAssociateEmail();
		this.assocName = "";
		if(I.getAssociateInput() == null) {
			JD=false;
		} else {
			JD=I.getAssociateInput().isDescriptionProvided();
		}
	}

	/**
	 * Gets the associate name.
	 *
	 * @return the associate name
	 */
	public String getAssocName() {
		return assocName;
	}

	/**
	 * Sets the associate name.
	 *
	 * @param assocName the new associate name
	 */
	public void setAssocName(String assocName) {
		this.assocName = assocName;
	}

	/**
	 * Gets the interview date.
	 *
	 * @return the interview date
	 */
	public Date getInterviewDate() {
		return InterviewDate;
	}

	/**
	 * Gets the associate email.
	 *
	 * @return the associate email
	 */
	public String getAssocEmail() {
		return assocEmail;
	}

	/**
	 * Checks if job description was provided.
	 *
	 * @return true, if job description was provided
	 */
	public boolean isJD() {
		return JD;
	}

	/**
	 * Generates object hash code.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((InterviewDate == null) ? 0 : InterviewDate.hashCode());
		result = prime * result + (JD ? 1231 : 1237);
		result = prime * result + ((assocEmail == null) ? 0 : assocEmail.hashCode());
		return result;
	}

	/**
	 * Checks equivalence of two objects.
	 * 
	 * @param obj The object to test equivalence against
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InterviewAssociateJobData other = (InterviewAssociateJobData) obj;
		if (InterviewDate == null) {
			if (other.InterviewDate != null)
				return false;
		} else if (!InterviewDate.equals(other.InterviewDate))
			return false;
		if (JD != other.JD)
			return false;
		if (assocEmail == null) {
			if (other.assocEmail != null)
				return false;
		} else if (!assocEmail.equals(other.assocEmail))
			return false;
		return true;
	}

	/**
	 * Prints object in string format.
	 */
	@Override
	public String toString() {
		return "InterviewAssociateJobData [InterviewDate=" + InterviewDate + ", assocEmail=" + assocEmail
				+ ", assocName=" + assocName + ", JD=" + JD + "]";
	}
	
	
}
