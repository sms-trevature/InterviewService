package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Model class for storing feedback status data.
 */
@Entity
@Table(name = "feedback_status")
public class FeedbackStatus {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "feedback_status_id")
	private int id;
	
	/** The status description. */
	@Column(name = "feedback_status_description")
	private String statusDesc;
	
	/**
	 * Instantiates a new feedback status.
	 */
	public FeedbackStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new feedback status.
	 *
	 * @param feedback_status_id the feedback status id
	 * @param feedback_status_desc the feedback status description
	 */
	public FeedbackStatus(int feedback_status_id, String feedback_status_desc) {
		super();
		this.id = feedback_status_id;
		this.statusDesc = feedback_status_desc;
	}

	/**
	 * Gets the feedback status id.
	 *
	 * @return the feedback status id
	 */
	public int getFeedback_status_id() {
		return id;
	}

	/**
	 * Sets the feedback status id.
	 *
	 * @param feedback_status_id the new feedback status id
	 */
	public void setFeedback_status_id(int feedback_status_id) {
		this.id = feedback_status_id;
	}

	/**
	 * Gets the feedback status description.
	 *
	 * @return the feedback status description
	 */
	public String getFeedback_status_desc() {
		return statusDesc;
	}

	/**
	 * Sets the feedback status description.
	 *
	 * @param feedback_status_desc the new feedback status description
	 */
	public void setFeedback_status_desc(String feedback_status_desc) {
		this.statusDesc = feedback_status_desc;
	}

	/**
	 * Generates object hash code.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((statusDesc == null) ? 0 : statusDesc.hashCode());
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
		FeedbackStatus other = (FeedbackStatus) obj;
		if (id != other.id)
			return false;
		if (statusDesc == null) {
			if (other.statusDesc != null)
				return false;
		} else if (!statusDesc.equals(other.statusDesc))
			return false;
		return true;
	}

	/**
	 * Prints object in string format.
	 */
	@Override
	public String toString() {
		return "FeedbackStatus [id=" + id + ", statusDesc=" + statusDesc + "]";
	}
}
