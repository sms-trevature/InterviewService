package com.revature.feign;

/**
 * The Class FeignException.
 */
public class FeignException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1765337484494392212L;
	
	/** The status. */
	private int status;
	
	/** The reason. */
	private String reason;

	/**
	 * Instantiates a new feign exception.
	 *
	 * @param status the status
	 * @param reason the reason
	 */
	public FeignException(int status, String reason) {
		super();
		this.status = status;
		this.reason = reason;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * Gets the reason.
	 *
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * Sets the reason.
	 *
	 * @param reason the new reason
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * Prints object in string format.
	 */
	@Override
	public String toString() {
		return "StashClientException [status=" + status + ", reason=" + reason + "]";
	}
}
