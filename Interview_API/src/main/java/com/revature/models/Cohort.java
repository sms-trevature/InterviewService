package com.revature.models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Model class for storing cohort data.
 */
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "cohorts")
public class Cohort {
	
	/** The cohort id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cohortId;

	/** The cohort name. */
	@NotNull
	private String cohortName;

	/** The cohort description. */
	private String cohortDescription;

	/** The cohort token. */
	private String cohortToken;

	/** The address. */
	@ManyToOne
	@JoinColumn(name = "address")
	private Address address;

	/** The start date. */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate startDate;

	/** The end date. */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate endDate;

	/** The users. */
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE }, mappedBy = "cohorts")
	private Set<User> users = new HashSet<>();

	/** The trainer. */
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "trainer_id", nullable = false)
	@NotNull
	private User trainer;

	/**
	 * Instantiates a new cohort.
	 */
	public Cohort() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new cohort.
	 *
	 * @param cohortId the cohort id
	 * @param cohortName the cohort name
	 * @param cohortDescription the cohort description
	 * @param cohortToken the cohort token
	 * @param address the address
	 * @param startDate the start date
	 * @param endDate the end date
	 * @param users the users
	 * @param trainer the trainer
	 */
	public Cohort(int cohortId, @NotNull String cohortName, @NotNull String cohortDescription, String cohortToken,
			Address address, LocalDate startDate, LocalDate endDate, Set<User> users, User trainer) {
		super();
		this.cohortId = cohortId;
		this.cohortName = cohortName;
		this.cohortDescription = cohortDescription;
		this.cohortToken = cohortToken;
		this.address = address;
		this.startDate = startDate;
		this.endDate = endDate;
		this.users = users;
		this.trainer = trainer;
	}

	/**
	 * Gets the cohort id.
	 *
	 * @return the cohort id
	 */
	public int getCohortId() {
		return cohortId;
	}

	/**
	 * Sets the cohort id.
	 *
	 * @param cohortId the new cohort id
	 */
	public void setCohortId(int cohortId) {
		this.cohortId = cohortId;
	}

	/**
	 * Gets the cohort name.
	 *
	 * @return the cohort name
	 */
	public String getCohortName() {
		return cohortName;
	}

	/**
	 * Sets the cohort name.
	 *
	 * @param cohortName the new cohort name
	 */
	public void setCohortName(String cohortName) {
		this.cohortName = cohortName;
	}

	/**
	 * Gets the cohort description.
	 *
	 * @return the cohort description
	 */
	public String getCohortDescription() {
		return cohortDescription;
	}

	/**
	 * Sets the cohort description.
	 *
	 * @param cohortDescription the new cohort description
	 */
	public void setCohortDescription(String cohortDescription) {
		this.cohortDescription = cohortDescription;
	}

	/**
	 * Gets the cohort token.
	 *
	 * @return the cohort token
	 */
	public String getCohortToken() {
		return cohortToken;
	}

	/**
	 * Sets the cohort token.
	 *
	 * @param cohortToken the new cohort token
	 */
	public void setCohortToken(String cohortToken) {
		this.cohortToken = cohortToken;
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
	 * Gets the start date.
	 *
	 * @return the start date
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * Sets the start date.
	 *
	 * @param startDate the new start date
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	/**
	 * Gets the end date.
	 *
	 * @return the end date
	 */
	public LocalDate getEndDate() {
		return endDate;
	}

	/**
	 * Sets the end date.
	 *
	 * @param endDate the new end date
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	/**
	 * Gets the users.
	 *
	 * @return the users
	 */
	public Set<User> getUsers() {
		return users;
	}

	/**
	 * Sets the users.
	 *
	 * @param users the new users
	 */
	public void setUsers(Set<User> users) {
		this.users = users;
	}

	/**
	 * Gets the trainer.
	 *
	 * @return the trainer
	 */
	public User getTrainer() {
		return trainer;
	}

	/**
	 * Sets the trainer.
	 *
	 * @param trainer the new trainer
	 */
	public void setTrainer(User trainer) {
		this.trainer = trainer;
	}

	/**
	 * Generates object hash code.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((cohortDescription == null) ? 0 : cohortDescription.hashCode());
		result = prime * result + cohortId;
		result = prime * result + ((cohortName == null) ? 0 : cohortName.hashCode());
		result = prime * result + ((cohortToken == null) ? 0 : cohortToken.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
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
		Cohort other = (Cohort) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (cohortDescription == null) {
			if (other.cohortDescription != null)
				return false;
		} else if (!cohortDescription.equals(other.cohortDescription))
			return false;
		if (cohortId != other.cohortId)
			return false;
		if (cohortName == null) {
			if (other.cohortName != null)
				return false;
		} else if (!cohortName.equals(other.cohortName))
			return false;
		if (cohortToken == null) {
			if (other.cohortToken != null)
				return false;
		} else if (!cohortToken.equals(other.cohortToken))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

	/**
	 * Prints object in string format.
	 */
	@Override
	public String toString() {
		return "Cohort [cohortId=" + cohortId + ", cohortName=" + cohortName + ", cohortDescription="
				+ cohortDescription + ", cohortToken=" + cohortToken + ", address=" + address + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}
}
