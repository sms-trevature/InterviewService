package com.revature.dtos;

import java.util.Calendar;
import java.util.Date;

import com.revature.models.Interview;

/**
 * DTO class for storing interview 24 hour notice data.
 */
public class Interview24Hour {
	
	/** The Interview date. */
	private Date InterviewDate;
	
	/** The associate email. */
	private String assocEmail;
	
	/** The associate name. */
	private String assocName;
	
	/** The twenty four associate. */
	private boolean twentyFourAssoc;
	
	/** The twenty four manager. */
	private boolean twentyFourManager;
	
	/**
	 * Instantiates a new interview 24 hour.
	 *
	 * @param I the interview
	 */
	public Interview24Hour(Interview I) {
		this.InterviewDate = I.getScheduled();
		this.assocEmail = I.getAssociateEmail();
		this.assocName = "";
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(I.getScheduled());
		Date curDate = cal.getTime();
		cal.add(Calendar.DATE, -1);
		Date oneDayBefore = cal.getTime();
		
		if(I.getNotified()==null) {
			this.twentyFourManager = false;
		} else {
			this.twentyFourManager =  (I.getNotified().before(oneDayBefore) || !(I.getNotified().after(oneDayBefore)));
		}
		if(I.getAssociateInput()==null) {
			this.twentyFourAssoc = false;
		} else {
			this.twentyFourAssoc = (I.getAssociateInput().getReceivedNotifications().before(oneDayBefore) || !(I.getAssociateInput().getReceivedNotifications().after(oneDayBefore)));
		}
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
	 * Gets the associate name.
	 *
	 * @return the associate name
	 */
	public String getAssocName() {
		return assocName;
	}
	

	/**
	 * Checks if associate received twenty four hour notice.
	 *
	 * @return true, if associate received twenty four hour notice
	 */
	public boolean isTwentyFourAssoc() {
		return twentyFourAssoc;
	}
	

	/**
	 * Checks if manager received twenty four hour notice.
	 *
	 * @return true, if manager received twenty four hour notice
	 */
	public boolean isTwentyFourManager() {
		return twentyFourManager;
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
	 * Generates object hash code.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((InterviewDate == null) ? 0 : InterviewDate.hashCode());
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
		Interview24Hour other = (Interview24Hour) obj;
		if (InterviewDate == null) {
			if (other.InterviewDate != null)
				return false;
		} else if (!InterviewDate.equals(other.InterviewDate))
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
		return "Interview24Hour [InterviewDate=" + InterviewDate + ", assocEmail=" + assocEmail + ", assocName="
				+ assocName + ", twentyFourAssoc=" + twentyFourAssoc + ", twentyFourManager=" + twentyFourManager + "]";
	}	
}
