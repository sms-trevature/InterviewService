package com.revature.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Model class for storing associate input data.
 */
@Entity
@Table(name = "associate_input")
public class AssociateInput {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "associate_input_id")
	private int id;
	
	/** The received notifications. */
	@Column(name = "received_notifications")
	private Date receivedNotifications;
	
	/** The description provided. */
	@Column(name = "description_provided")
	private boolean descriptionProvided;
	
	/** The interview. */
	@OneToOne(mappedBy="associateInput")
	@JsonIgnore
	private Interview interview;
	
	/** The interview format. */
	@OneToOne
	@JoinColumn(name = "interview_format")
	private InterviewFormat interviewFormat;

	/** The proposed format. */
	@OneToOne
	@JoinColumn(name = "proposed_format")
	private InterviewFormat proposedFormat;
	
	/** The day notice. */
	@Column(name = "day_notice")
	private boolean dayNotice;

	/**
	 * Instantiates a new associate input.
	 */
	public AssociateInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new associate input.
	 *
	 * @param id the id
	 * @param receivedNotifications the received notifications
	 * @param descriptionProvided the description provided
	 * @param interview the interview
	 * @param interviewFormat the interview format
	 * @param proposedFormat the proposed format
	 */
	public AssociateInput(int id, Date receivedNotifications, boolean descriptionProvided, Interview interview,
			InterviewFormat interviewFormat, InterviewFormat proposedFormat) {
		super();
		this.id = id;
		this.receivedNotifications = receivedNotifications;
		this.descriptionProvided = descriptionProvided;
		this.interview = interview;
		this.interviewFormat = interviewFormat;
		this.proposedFormat = proposedFormat;
	}
	
	/**
	 * Instantiates a new associate input.
	 *
	 * @param id the id
	 * @param receivedNotifications the received notifications
	 * @param descriptionProvided the description provided
	 * @param interview the interview
	 * @param interviewFormat the interview format
	 * @param proposedFormat the proposed format
	 * @param dayNotice the day notice
	 */
	public AssociateInput(int id, Date receivedNotifications, boolean descriptionProvided, Interview interview,
			InterviewFormat interviewFormat, InterviewFormat proposedFormat, boolean dayNotice) {
		super();
		this.id = id;
		this.receivedNotifications = receivedNotifications;
		this.descriptionProvided = descriptionProvided;
		this.interview = interview;
		this.interviewFormat = interviewFormat;
		this.proposedFormat = proposedFormat;
		this.dayNotice = dayNotice;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the received notifications.
	 *
	 * @return the received notifications
	 */
	public Date getReceivedNotifications() {
		return receivedNotifications;
	}

	/**
	 * Sets the received notifications.
	 *
	 * @param receivedNotifications the new received notifications
	 */
	public void setReceivedNotifications(Date receivedNotifications) {
		this.receivedNotifications = receivedNotifications;
	}

	/**
	 * Checks if is description provided.
	 *
	 * @return true, if is description provided
	 */
	public boolean isDescriptionProvided() {
		return descriptionProvided;
	}

	/**
	 * Sets the description provided.
	 *
	 * @param descriptionProvided the new description provided
	 */
	public void setDescriptionProvided(boolean descriptionProvided) {
		this.descriptionProvided = descriptionProvided;
	}

	/**
	 * Gets the interview.
	 *
	 * @return the interview
	 */
	public Interview getInterview() {
		return interview;
	}

	/**
	 * Sets the interview.
	 *
	 * @param interview the new interview
	 */
	public void setInterview(Interview interview) {
		this.interview = interview;
	}

	/**
	 * Gets the interview format.
	 *
	 * @return the interview format
	 */
	public InterviewFormat getInterviewFormat() {
		return interviewFormat;
	}

	/**
	 * Sets the interview format.
	 *
	 * @param interviewFormat the new interview format
	 */
	public void setInterviewFormat(InterviewFormat interviewFormat) {
		this.interviewFormat = interviewFormat;
	}

	/**
	 * Gets the proposed format.
	 *
	 * @return the proposed format
	 */
	public InterviewFormat getProposedFormat() {
		return proposedFormat;
	}

	/**
	 * Sets the proposed format.
	 *
	 * @param proposedFormat the new proposed format
	 */
	public void setProposedFormat(InterviewFormat proposedFormat) {
		this.proposedFormat = proposedFormat;
	}

	/**
	 * Checks if is day notice.
	 *
	 * @return true, if is day notice
	 */
	public boolean isDayNotice() {
		return dayNotice;
	}

	/**
	 * Sets the day notice.
	 *
	 * @param dayNotice the new day notice
	 */
	public void setDayNotice(boolean dayNotice) {
		this.dayNotice = dayNotice;
	}

	/**
	 * Generates object hash code.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (descriptionProvided ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((interviewFormat == null) ? 0 : interviewFormat.hashCode());
		result = prime * result + ((proposedFormat == null) ? 0 : proposedFormat.hashCode());
		result = prime * result + ((receivedNotifications == null) ? 0 : receivedNotifications.hashCode());
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
		AssociateInput other = (AssociateInput) obj;
		if (descriptionProvided != other.descriptionProvided)
			return false;
		if (id != other.id)
			return false;
		if (interviewFormat == null) {
			if (other.interviewFormat != null)
				return false;
		} else if (!interviewFormat.equals(other.interviewFormat))
			return false;
		if (proposedFormat == null) {
			if (other.proposedFormat != null)
				return false;
		} else if (!proposedFormat.equals(other.proposedFormat))
			return false;
		if (receivedNotifications == null) {
			if (other.receivedNotifications != null)
				return false;
		} else if (!receivedNotifications.equals(other.receivedNotifications))
			return false;
		return true;
	}

	/**
	 * Prints object in string format.
	 */
	@Override
	public String toString() {
		return "AssociateInput [id=" + id + ", receivedNotifications=" + receivedNotifications
				+ ", descriptionProvided=" + descriptionProvided + ", interviewFormat="
				+ interviewFormat + ", proposedFormat=" + proposedFormat + ", dayNotice=" + dayNotice + "]";
	}		
}
