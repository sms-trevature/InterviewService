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
 * Model class for storing interview feedback data.
 */
@Entity
@Table(name = "interview_feedback")
public class InterviewFeedback {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "interview_feedback_id")
	private int id;
	
	/**
	 * Gets the feedback delivered.
	 *
	 * @return the feedback delivered
	 */
	public Date getFeedbackDelivered() {
		return feedbackDelivered;
	}

	/**
	 * Sets the feedback delivered.
	 *
	 * @param feedbackDelivered the new feedback delivered
	 */
	public void setFeedbackDelivered(Date feedbackDelivered) {
		this.feedbackDelivered = feedbackDelivered;
	}

	/** The feedback requested. */
	@Column(name = "feedback_requested")
	private Date feedbackRequested;
	
	/** The feedback. */
	private String feedback;
	
	/** The feedback received. */
	@Column(name = "feedback_received")
	private Date feedbackReceived;
	
	/** The feedback delivered. */
	@Column(name = "feedback_delivered")
	private Date feedbackDelivered;
	
	/** The status. */
	@OneToOne
	@JoinColumn(name = "feedback_status")
	private FeedbackStatus status;
	
	/** The interview. */
	@OneToOne(mappedBy="feedback")
	@JsonIgnore
	private Interview interview;
	
	/**
	 * Instantiates a new interview feedback.
	 *
	 * @param id the id
	 * @param feedbackRequested the feedback requested
	 * @param feedback the feedback
	 * @param feedbackReceived the feedback received
	 * @param status the status
	 */
	public InterviewFeedback(int id, Date feedbackRequested, String feedback, Date feedbackReceived,
			FeedbackStatus status) {
		super();
		this.id = id;
		this.feedbackRequested = feedbackRequested;
		this.feedback = feedback;
		this.feedbackReceived = feedbackReceived;
		this.status = status;
	}

	/**
	 * Instantiates a new interview feedback.
	 */
	public InterviewFeedback() {
		super();
		// TODO Auto-generated constructor stub
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
	 * Gets the feedback requested.
	 *
	 * @return the feedback requested
	 */
	public Date getFeedbackRequested() {
		return feedbackRequested;
	}

	/**
	 * Sets the feedback requested.
	 *
	 * @param feedbackRequested the new feedback requested
	 */
	public void setFeedbackRequested(Date feedbackRequested) {
		this.feedbackRequested = feedbackRequested;
	}

	/**
	 * Gets the feedback.
	 *
	 * @return the feedback
	 */
	public String getFeedback() {
		return feedback;
	}

	/**
	 * Sets the feedback.
	 *
	 * @param feedback the new feedback
	 */
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	/**
	 * Gets the feedback received.
	 *
	 * @return the feedback received
	 */
	public Date getFeedbackReceived() {
		return feedbackReceived;
	}

	/**
	 * Sets the feedback received.
	 *
	 * @param feedbackReceived the new feedback received
	 */
	public void setFeedbackReceived(Date feedbackReceived) {
		this.feedbackReceived = feedbackReceived;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public FeedbackStatus getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(FeedbackStatus status) {
		this.status = status;
	}

	/**
	 * Generates object hash code.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((feedback == null) ? 0 : feedback.hashCode());
		result = prime * result + ((feedbackDelivered == null) ? 0 : feedbackDelivered.hashCode());
		result = prime * result + ((feedbackReceived == null) ? 0 : feedbackReceived.hashCode());
		result = prime * result + ((feedbackRequested == null) ? 0 : feedbackRequested.hashCode());
		result = prime * result + id;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		InterviewFeedback other = (InterviewFeedback) obj;
		if (feedback == null) {
			if (other.feedback != null)
				return false;
		} else if (!feedback.equals(other.feedback))
			return false;
		if (feedbackDelivered == null) {
			if (other.feedbackDelivered != null)
				return false;
		} else if (!feedbackDelivered.equals(other.feedbackDelivered))
			return false;
		if (feedbackReceived == null) {
			if (other.feedbackReceived != null)
				return false;
		} else if (!feedbackReceived.equals(other.feedbackReceived))
			return false;
		if (feedbackRequested == null) {
			if (other.feedbackRequested != null)
				return false;
		} else if (!feedbackRequested.equals(other.feedbackRequested))
			return false;
		if (id != other.id)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
}
