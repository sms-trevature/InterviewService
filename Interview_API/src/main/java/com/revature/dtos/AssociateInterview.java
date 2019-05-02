package com.revature.dtos;

import com.revature.models.Interview;

/**
 * DTO class for storing associate interview count data.
 */
public class AssociateInterview implements Comparable<AssociateInterview>{
	
	/** The associate email. */
	private String associateEmail;
	
	/** The interview count. */
	private int interviewCount;
	
	/** The associate name. */
	private String AssociateName;
	
	/**
	 * Instantiates a new associate interview.
	 */
	public AssociateInterview() {
		associateEmail = "";
		interviewCount = 1;
		AssociateName = "";
	}

	/**
	 * Instantiates a new associate interview.
	 *
	 * @param associateEmail the associate email
	 */
	public AssociateInterview(String associateEmail) {
		interviewCount = 1;
		this.associateEmail = associateEmail;
		AssociateName = "";
	}

	/**
	 * Instantiates a new associate interview.
	 *
	 * @param I the interview
	 */
	public AssociateInterview(Interview I) {
		interviewCount = 1;
		associateEmail = I.getAssociateEmail();
		AssociateName = "";
	}

	/**
	 * Gets the associate email.
	 *
	 * @return the associate email
	 */
	public String getAssociateEmail() {
		return associateEmail;
	}

	/**
	 * Gets the interview count.
	 *
	 * @return the interview count
	 */
	public int getInterviewCount() {
		return interviewCount;
	}

	/**
	 * Increment interview count.
	 */
	public void incrementInterviewCount() {
		interviewCount++;
	}

	/**
	 * Gets the associate name.
	 *
	 * @return the associate name
	 */
	public String getAssociateName() {
		return AssociateName;
	}
	
	/**
	 * Sets the associate name.
	 *
	 * @param AssociateName the new associate name
	 */
	public void setAssociateName(String AssociateName) {
		this.AssociateName=AssociateName;
	}

	/**
	 * Compares to another associate interview.
	 * 
	 * @param o The associate interview to compare against
	 */
	@Override
	public int compareTo(AssociateInterview o) {
		return this.associateEmail.compareTo(o.getAssociateEmail());
	}

	/**
	 * Generates object hash code.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((associateEmail == null) ? 0 : associateEmail.hashCode());
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
		AssociateInterview other = (AssociateInterview) obj;
		if (associateEmail == null) {
			if (other.associateEmail != null)
				return false;
		} else if (!associateEmail.equals(other.associateEmail))
			return false;
		return true;
	}

	/**
	 * Prints object in string format.
	 */
	@Override
	public String toString() {
		return "AssociateInterview [associateEmail=" + associateEmail + ", interviewCount=" + interviewCount
				+ ", AssociateName=" + AssociateName + "]";
	}
}