package com.revature.models;

import java.util.Date;
import java.util.Objects;

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

/**
 * Model class for storing interview data.
 */
@Entity
@Table(name = "interview")
public class Interview {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "interview_id")
	private int id;
	
	/** The manager email. */
	@Column(name = "manager_email")
	private String managerEmail;
	
	/** The associate email. */
	@Column(name = "associate_email")
	private String associateEmail;
	
	
	/** The scheduled. */
	private Date scheduled;
	
	/** The notified. */
	private Date notified;
	
	/** The reviewed. */
	private Date reviewed;
	
	/** The place. */
	private String place;
	

	/** The feedback. */
	@OneToOne
	@JoinColumn(name = "interview_feedback")
	private InterviewFeedback feedback;
	
	/** The associate input. */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "associate_input")
	private AssociateInput associateInput;

	/** The client. */
	@OneToOne
	@JoinColumn(name = "client")
	private Client client;
		

	/**
	 * Instantiates a new interview.
	 */
	public Interview() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * Instantiates a new interview.
	 *
	 * @param managerEmail the manager email
	 * @param associateEmail the associate email
	 * @param scheduled the scheduled
	 * @param place the place
	 * @param client the client
	 */
	public Interview(String managerEmail, String associateEmail, Date scheduled, String place, Client client) {
		super();
		this.managerEmail = managerEmail;
		this.associateEmail = associateEmail;
		this.scheduled = scheduled;
		this.place = place;
		this.client = client;
	}


	/**
	 * Instantiates a new interview.
	 *
	 * @param id the id
	 * @param managerEmail the manager email
	 * @param associateEmail the associate email
	 * @param scheduled the scheduled
	 * @param notified the notified
	 * @param reviewed the reviewed
	 * @param place the place
	 * @param feedback the feedback
	 * @param associateInput the associate input
	 * @param client the client
	 */
	public Interview(int id, String managerEmail, String associateEmail, Date scheduled, Date notified, Date reviewed, String place, InterviewFeedback feedback, AssociateInput associateInput, Client client) {
		this.id = id;
		this.managerEmail = managerEmail;
		this.associateEmail = associateEmail;
		this.scheduled = scheduled;
		this.notified = notified;
		this.reviewed = reviewed;
		this.place = place;
		this.feedback = feedback;
		this.associateInput = associateInput;
		this.client = client;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return this.id;
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
	 * Gets the manager email.
	 *
	 * @return the manager email
	 */
	public String getManagerEmail() {
		return this.managerEmail;
	}

	/**
	 * Sets the manager email.
	 *
	 * @param managerEmail the new manager email
	 */
	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}

	/**
	 * Gets the associate email.
	 *
	 * @return the associate email
	 */
	public String getAssociateEmail() {
		return this.associateEmail;
	}

	/**
	 * Sets the associate email.
	 *
	 * @param associateEmail the new associate email
	 */
	public void setAssociateEmail(String associateEmail) {
		this.associateEmail = associateEmail;
	}

	/**
	 * Gets the scheduled.
	 *
	 * @return the scheduled
	 */
	public Date getScheduled() {
		return this.scheduled;
	}

	/**
	 * Sets the scheduled.
	 *
	 * @param scheduled the new scheduled
	 */
	public void setScheduled(Date scheduled) {
		this.scheduled = scheduled;
	}

	/**
	 * Gets the notified.
	 *
	 * @return the notified
	 */
	public Date getNotified() {
		return this.notified;
	}

	/**
	 * Sets the notified.
	 *
	 * @param notified the new notified
	 */
	public void setNotified(Date notified) {
		this.notified = notified;
	}

	/**
	 * Gets the reviewed.
	 *
	 * @return the reviewed
	 */
	public Date getReviewed() {
		return this.reviewed;
	}

	/**
	 * Sets the reviewed.
	 *
	 * @param reviewed the new reviewed
	 */
	public void setReviewed(Date reviewed) {
		this.reviewed = reviewed;
	}

	/**
	 * Gets the place.
	 *
	 * @return the place
	 */
	public String getPlace() {
		return this.place;
	}

	/**
	 * Sets the place.
	 *
	 * @param place the new place
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * Gets the feedback.
	 *
	 * @return the feedback
	 */
	public InterviewFeedback getFeedback() {
		return this.feedback;
	}

	/**
	 * Sets the feedback.
	 *
	 * @param feedback the new feedback
	 */
	public void setFeedback(InterviewFeedback feedback) {
		this.feedback = feedback;
	}

	/**
	 * Gets the associate input.
	 *
	 * @return the associate input
	 */
	public AssociateInput getAssociateInput() {
		return this.associateInput;
	}

	/**
	 * Sets the associate input.
	 *
	 * @param associateInput the new associate input
	 */
	public void setAssociateInput(AssociateInput associateInput) {
		this.associateInput = associateInput;
	}

	/**
	 * Gets the client.
	 *
	 * @return the client
	 */
	public Client getClient() {
		return this.client;
	}

	/**
	 * Sets the client.
	 *
	 * @param c the new client
	 */
	public void setClient(Client c) {
		this.client = c;
	}


	/**
	 * Generates object hash code.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((associateInput == null) ? 0 : associateInput.hashCode());
		result = prime * result + ((feedback == null) ? 0 : feedback.hashCode());
		result = prime * result + id;
		result = prime * result + ((notified == null) ? 0 : notified.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + ((reviewed == null) ? 0 : reviewed.hashCode());
		result = prime * result + ((scheduled == null) ? 0 : scheduled.hashCode());
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
		Interview other = (Interview) obj;
		if (associateEmail != other.associateEmail)
			return false;
		if (associateInput == null) {
			if (other.associateInput != null)
				return false;
		} else if (!associateInput.equals(other.associateInput))
			return false;
		if (feedback == null) {
			if (other.feedback != null)
				return false;
		} else if (!feedback.equals(other.feedback))
			return false;
		if (id != other.id)
			return false;
		if (managerEmail != other.managerEmail)
			return false;
		if (notified == null) {
			if (other.notified != null)
				return false;
		} else if (!notified.equals(other.notified))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		if (reviewed == null) {
			if (other.reviewed != null)
				return false;
		} else if (!reviewed.equals(other.reviewed))
			return false;
		if (scheduled == null) {
			if (other.scheduled != null)
				return false;
		} else if (!scheduled.equals(other.scheduled))
			return false;
		return true;
	}

	/**
	 * Prints object in string format.
	 */
	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", managerEmail='" + getManagerEmail() + "'" +
			", associateEmail='" + getAssociateEmail() + "'" +
			", scheduled='" + getScheduled() + "'" +
			", notified='" + getNotified() + "'" +
			", reviewed='" + getReviewed() + "'" +
			", place='" + getPlace() + "'" +
			", feedback='" + getFeedback() + "'" +
			", associateInput='" + getAssociateInput() + "'" +
			", client='" + getClient() + "'" +
			"}";
	}
}
