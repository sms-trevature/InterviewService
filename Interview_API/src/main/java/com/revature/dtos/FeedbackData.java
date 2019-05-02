package com.revature.dtos;

/**
 * DTO class for storing interview feedback data.
 */
public class FeedbackData{
	
	/** The interview id. */
	int interviewId;
    
    /** The feedback requested date. */
    long feedbackRequestedDate;
    
    /** The feedback text. */
    String feedbackText;
    
    /** The feedback received date. */
    long feedbackReceivedDate;
    
    /** The feedback delivered date. */
    long feedbackDeliveredDate;
    
    /** The interview format. */
    String interviewFormat;
    
	/**
	 * Instantiates a new feedback data.
	 */
	public FeedbackData() {
		super();
	}

	/**
	 * Instantiates a new feedback data.
	 *
	 * @param interviewId the interview id
	 * @param feedbackRequestedDate the feedback requested date
	 * @param feedbackText the feedback text
	 * @param feedbackReceivedDate the feedback received date
	 * @param feedbackDeliveredDate the feedback delivered date
	 * @param interviewFormat the interview format
	 */
	public FeedbackData(int interviewId, long feedbackRequestedDate, String feedbackText, long feedbackReceivedDate,
			long feedbackDeliveredDate, String interviewFormat) {
		super();
		this.interviewId = interviewId;
		this.feedbackRequestedDate = feedbackRequestedDate;
		this.feedbackText = feedbackText;
		this.feedbackReceivedDate = feedbackReceivedDate;
		this.feedbackDeliveredDate = feedbackDeliveredDate;
		this.interviewFormat = interviewFormat;
	}

	/**
	 * Gets the interview id.
	 *
	 * @return the interview id
	 */
	public int getInterviewId() {
		return interviewId;
	}

	/**
	 * Sets the interview id.
	 *
	 * @param interviewId the new interview id
	 */
	public void setInterviewId(int interviewId) {
		this.interviewId = interviewId;
	}

	/**
	 * Gets the feedback requested date.
	 *
	 * @return the feedback requested date
	 */
	public long getFeedbackRequestedDate() {
		return feedbackRequestedDate;
	}

	/**
	 * Sets the feedback requested date.
	 *
	 * @param feedbackRequestedDate the new feedback requested date
	 */
	public void setFeedbackRequestedDate(long feedbackRequestedDate) {
		this.feedbackRequestedDate = feedbackRequestedDate;
	}

	/**
	 * Gets the feedback text.
	 *
	 * @return the feedback text
	 */
	public String getFeedbackText() {
		return feedbackText;
	}

	/**
	 * Sets the feedback text.
	 *
	 * @param feedbackText the new feedback text
	 */
	public void setFeedbackText(String feedbackText) {
		this.feedbackText = feedbackText;
	}

	/**
	 * Gets the feedback received date.
	 *
	 * @return the feedback received date
	 */
	public long getFeedbackReceivedDate() {
		return feedbackReceivedDate;
	}

	/**
	 * Sets the feedback received date.
	 *
	 * @param feedbackReceivedDate the new feedback received date
	 */
	public void setFeedbackReceivedDate(long feedbackReceivedDate) {
		this.feedbackReceivedDate = feedbackReceivedDate;
	}

	/**
	 * Gets the feedback delivered date.
	 *
	 * @return the feedback delivered date
	 */
	public long getFeedbackDeliveredDate() {
		return feedbackDeliveredDate;
	}

	/**
	 * Sets the feedback delivered date.
	 *
	 * @param feedbackDeliveredDate the new feedback delivered date
	 */
	public void setFeedbackDeliveredDate(long feedbackDeliveredDate) {
		this.feedbackDeliveredDate = feedbackDeliveredDate;
	}

	/**
	 * Gets the interview format.
	 *
	 * @return the interview format
	 */
	public String getInterviewFormat() {
		return interviewFormat;
	}

	/**
	 * Sets the interview format.
	 *
	 * @param interviewFormat the new interview format
	 */
	public void setInterviewFormat(String interviewFormat) {
		this.interviewFormat = interviewFormat;
	}

	/**
	 * Generates object hash code.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (feedbackDeliveredDate ^ (feedbackDeliveredDate >>> 32));
		result = prime * result + (int) (feedbackReceivedDate ^ (feedbackReceivedDate >>> 32));
		result = prime * result + (int) (feedbackRequestedDate ^ (feedbackRequestedDate >>> 32));
		result = prime * result + ((feedbackText == null) ? 0 : feedbackText.hashCode());
		result = prime * result + ((interviewFormat == null) ? 0 : interviewFormat.hashCode());
		result = prime * result + interviewId;
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
		FeedbackData other = (FeedbackData) obj;
		if (feedbackDeliveredDate != other.feedbackDeliveredDate)
			return false;
		if (feedbackReceivedDate != other.feedbackReceivedDate)
			return false;
		if (feedbackRequestedDate != other.feedbackRequestedDate)
			return false;
		if (feedbackText == null) {
			if (other.feedbackText != null)
				return false;
		} else if (!feedbackText.equals(other.feedbackText))
			return false;
		if (interviewFormat == null) {
			if (other.interviewFormat != null)
				return false;
		} else if (!interviewFormat.equals(other.interviewFormat))
			return false;
		if (interviewId != other.interviewId)
			return false;
		return true;
	}

	/**
	 * Prints object in string format.
	 */
	@Override
	public String toString() {
		return "FeedbackData [interviewId=" + interviewId + ", feedbackRequestedDate=" + feedbackRequestedDate
				+ ", feedbackText=" + feedbackText + ", feedbackReceivedDate=" + feedbackReceivedDate
				+ ", feedbackDeliveredDate=" + feedbackDeliveredDate + ", interviewFormat=" + interviewFormat + "]";
	}
}
