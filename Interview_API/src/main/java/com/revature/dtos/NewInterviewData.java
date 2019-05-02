package com.revature.dtos;

import java.sql.Date;
import java.util.Objects;

/**
 * DTO class for new interview data.
 */
public class NewInterviewData {
  	
	/** The associate email. */
	private String associateEmail;
	
	/** The date. */
	private Date date;
	
	/** The location. */
	private String location;
	
	/** The client. */
	private String client; 

	/**
	 * Instantiates a new new interview data.
	 */
	public NewInterviewData() {
		super();
	}

	/**
	 * Instantiates a new new interview data.
	 *
	 * @param associateEmail the associate email
	 * @param date the date
	 * @param location the location
	 * @param client the client
	 */
	public NewInterviewData(String associateEmail, Date date, String location, String client) {
		super();
		this.associateEmail = associateEmail;
		this.date = date;
		this.location = location;
		this.client = client;
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
	 * Gets the date.
	 *
	 * @return the date
	 */
	public Date getDate() {
		return this.date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public String getLocation() {
		return this.location;
	}

	/**
	 * Sets the location.
	 *
	 * @param location the new location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Gets the client.
	 *
	 * @return the client
	 */
	public String getClient() {
		return this.client;
	}

	/**
	 * Sets the client.
	 *
	 * @param client the new client
	 */
	public void setClient(String client) {
		this.client = client;
	}

	/**
	 * Associate email.
	 *
	 * @param associateEmail the associate email
	 * @return the new interview data
	 */
	public NewInterviewData associateEmail(String associateEmail) {
		this.associateEmail = associateEmail;
		return this;
	}

	/**
	 * Date.
	 *
	 * @param date the date
	 * @return the new interview data
	 */
	public NewInterviewData date(Date date) {
		this.date = date;
		return this;
	}

	/**
	 * Location.
	 *
	 * @param location the location
	 * @return the new interview data
	 */
	public NewInterviewData location(String location) {
		this.location = location;
		return this;
	}

	/**
	 * Client.
	 *
	 * @param client the client
	 * @return the new interview data
	 */
	public NewInterviewData client(String client) {
		this.client = client;
		return this;
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
		if (!(o instanceof NewInterviewData)) {
			return false;
		}
		NewInterviewData newInterviewData = (NewInterviewData) o;
		return Objects.equals(associateEmail, newInterviewData.associateEmail) && date == newInterviewData.date && Objects.equals(location, newInterviewData.location) && Objects.equals(client, newInterviewData.client);
	}

	/**
	 * Generates object hash code.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(associateEmail, date, location, client);
	}

	/**
	 * Prints object in string format.
	 */
	@Override
	public String toString() {
		return "{" +
			" associateEmail='" + getAssociateEmail() + "'" +
			", date='" + getDate() + "'" +
			", location='" + getLocation() + "'" +
			", client='" + getClient() + "'" +
			"}";
	}
}
