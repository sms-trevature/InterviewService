package com.revature.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * Model class for storing user data.
 */
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "sms_users")
public class User {

	/** The user id. */
	@Id
	@Column(name = "sms_user_id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	/** The first name. */
	@NotNull
	private String firstName;

	/** The last name. */
	@NotNull
	private String lastName;

	/** The email. */
	@NotNull
	private String email;

	/** The phone number. */
	private String phoneNumber;

	/** The address. */
	@ManyToOne
	@JoinColumn(name = "address")
	private Address address;

	/** The cohorts. */
	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "usersCohorts", joinColumns = { @JoinColumn(name = "smsUserId") }, inverseJoinColumns = {
			@JoinColumn(name = "cohortId") })
	private Set<Cohort> cohorts = new HashSet<>();

	/**
	 * Instantiates a new user.
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new user.
	 *
	 * @param userId the user id
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param email the email
	 * @param phoneNumber the phone number
	 * @param address the address
	 * @param cohorts the cohorts
	 */
	public User(int userId, String firstName, String lastName, @NotNull String email, String phoneNumber,
			Address address, Set<Cohort> cohorts) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.cohorts = cohorts;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the phone number.
	 *
	 * @return the phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the phone number.
	 *
	 * @param phoneNumber the new phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * Gets the cohorts.
	 *
	 * @return the cohorts
	 */
	public Set<Cohort> getCohorts() {
		return cohorts;
	}

	/**
	 * Sets the cohorts.
	 *
	 * @param cohorts the new cohorts
	 */
	public void setCohorts(Set<Cohort> cohorts) {
		this.cohorts = cohorts;
	}

	/**
	 * Generates object hash code.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + userId;
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
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	/**
	 * Prints object in string format.
	 */
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + "]";
	}
}
