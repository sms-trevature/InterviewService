package com.revature.dtos;

import java.util.Date;
import java.util.Objects;

import com.revature.models.InterviewFormat;

/**
 * DTO class for storing new associate input.
 */
public class NewAssociateInput {
    
    /** The interview id. */
    private int interviewId;
    
    /** The associate input id. */
    private int associateInputId;
    
    /** The received notifications. */
    private Date receivedNotifications;
    
    /** The description provided. */
    private boolean descriptionProvided;
    
    /** The interview format. */
    private InterviewFormat interviewFormat;
    
    /** The proposed format. */
    private InterviewFormat proposedFormat;
    
    /** The day notice. */
    private boolean dayNotice; 

    /**
     * Instantiates a new new associate input.
     */
    public NewAssociateInput() {
        super();
    }
    
    /**
     * Instantiates a new new associate input.
     *
     * @param interviewId the interview id
     * @param associateInputId the associate input id
     * @param receivedNotifications the received notifications
     * @param descriptionProvided the description provided
     * @param interviewFormat the interview format
     * @param proposedFormat the proposed format
     * @param dayNotice the day notice
     */
    public NewAssociateInput(int interviewId, int associateInputId, Date receivedNotifications,
			boolean descriptionProvided, InterviewFormat interviewFormat, InterviewFormat proposedFormat,
			boolean dayNotice) {
		super();
		this.interviewId = interviewId;
		this.associateInputId = associateInputId;
		this.receivedNotifications = receivedNotifications;
		this.descriptionProvided = descriptionProvided;
		this.interviewFormat = interviewFormat;
		this.proposedFormat = proposedFormat;
		this.dayNotice = dayNotice;
	}

	/**
	 * Instantiates a new new associate input.
	 *
	 * @param interviewId the interview id
	 * @param associateInputId the associate input id
	 * @param receivedNotifications the received notifications
	 * @param descriptionProvided the description provided
	 * @param interviewFormat the interview format
	 * @param proposedFormat the proposed format
	 */
	public NewAssociateInput(int interviewId, int associateInputId, Date receivedNotifications,
            boolean descriptionProvided, InterviewFormat interviewFormat, InterviewFormat proposedFormat) {
        this.interviewId = interviewId;
        this.associateInputId = associateInputId;
        this.receivedNotifications = receivedNotifications;
        this.descriptionProvided = descriptionProvided;
        this.interviewFormat = interviewFormat;
        this.proposedFormat = proposedFormat;
    }

    /**
     * Gets the interview id.
     *
     * @return the interview id
     */
    public int getInterviewId() {
        return this.interviewId;
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
     * Gets the associate input id.
     *
     * @return the associate input id
     */
    public int getAssociateInputId() {
        return this.associateInputId;
    }

    /**
     * Sets the associate input id.
     *
     * @param associateInputId the new associate input id
     */
    public void setAssociateInputId(int associateInputId) {
        this.associateInputId = associateInputId;
    }

    /**
     * Gets the received notifications.
     *
     * @return the received notifications
     */
    public Date getReceivedNotifications() {
        return this.receivedNotifications;
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
        return this.descriptionProvided;
    }

    /**
     * Gets the description provided.
     *
     * @return the description provided
     */
    public boolean getDescriptionProvided() {
        return this.descriptionProvided;
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
     * Gets the interview format.
     *
     * @return the interview format
     */
    public InterviewFormat getInterviewFormat() {
        return this.interviewFormat;
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
        return this.proposedFormat;
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
     * Interview id.
     *
     * @param interviewId the interview id
     * @return the new associate input
     */
    public NewAssociateInput interviewId(int interviewId) {
        this.interviewId = interviewId;
        return this;
    }

    /**
     * Associate input id.
     *
     * @param associateInputId the associate input id
     * @return the new associate input
     */
    public NewAssociateInput associateInputId(int associateInputId) {
        this.associateInputId = associateInputId;
        return this;
    }

    /**
     * Received notifications.
     *
     * @param receivedNotifications the received notifications
     * @return the new associate input
     */
    public NewAssociateInput receivedNotifications(Date receivedNotifications) {
        this.receivedNotifications = receivedNotifications;
        return this;
    }

    /**
     * Description provided.
     *
     * @param descriptionProvided the description provided
     * @return the new associate input
     */
    public NewAssociateInput descriptionProvided(boolean descriptionProvided) {
        this.descriptionProvided = descriptionProvided;
        return this;
    }

    /**
     * Interview format.
     *
     * @param interviewFormat the interview format
     * @return the new associate input
     */
    public NewAssociateInput interviewFormat(InterviewFormat interviewFormat) {
        this.interviewFormat = interviewFormat;
        return this;
    }

    /**
     * Proposed format.
     *
     * @param proposedFormat the proposed format
     * @return the new associate input
     */
    public NewAssociateInput proposedFormat(InterviewFormat proposedFormat) {
        this.proposedFormat = proposedFormat;
        return this;
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
	 * Checks equivalence of two objects.
	 * 
	 * @param obj The object to test equivalence against
	 */
	@Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof NewAssociateInput)) {
            return false;
        }
        NewAssociateInput newAssociateInput = (NewAssociateInput) o;
        return interviewId == newAssociateInput.interviewId && associateInputId == newAssociateInput.associateInputId
                && Objects.equals(receivedNotifications, newAssociateInput.receivedNotifications)
                && descriptionProvided == newAssociateInput.descriptionProvided
                && Objects.equals(interviewFormat, newAssociateInput.interviewFormat)
                && Objects.equals(proposedFormat, newAssociateInput.proposedFormat);
    }

	/**
	 * Generates object hash code.
	 */
    @Override
    public int hashCode() {
        return Objects.hash(interviewId, associateInputId, receivedNotifications, descriptionProvided, interviewFormat,
                proposedFormat);
    }

    /**
	 * Prints object in string format.
	 */
	@Override
	public String toString() {
		return "NewAssociateInput [interviewId=" + interviewId + ", associateInputId=" + associateInputId
				+ ", receivedNotifications=" + receivedNotifications + ", descriptionProvided=" + descriptionProvided
				+ ", interviewFormat=" + interviewFormat + ", proposedFormat=" + proposedFormat + ", dayNotice="
				+ dayNotice + "]";
	}
}