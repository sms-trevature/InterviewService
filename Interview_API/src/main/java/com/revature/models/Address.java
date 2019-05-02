package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Model class for storing address data.
 */
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "addresses")
public class Address {

	/** The address id. */
	@Id
	@Column(name = "address_id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;

	/** The alias. */
	private String alias;
	
	/** The street. */
	private String street;
	
	/** The zip. */
	private String zip;
	
	/** The city. */
	private String city;
	
	/** The state. */
	private String state;
	
	/** The country. */
	private String country;
	
	/** The is training location. */
	private boolean isTrainingLocation;

	/**
	 * Instantiates a new address.
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new address.
	 *
	 * @param addressId the address id
	 * @param alias the alias
	 * @param street the street
	 * @param zip the zip
	 * @param city the city
	 * @param state the state
	 * @param country the country
	 * @param isTrainingLocation the is training location
	 */
	public Address(int addressId, String alias, String street, String zip, String city, String state, String country,
			boolean isTrainingLocation) {
		super();
		this.addressId = addressId;
		this.alias = alias;
		this.street = street;
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.country = country;
		this.isTrainingLocation = isTrainingLocation;
	}

	/**
	 * Gets the address id.
	 *
	 * @return the address id
	 */
	public int getAddressId() {
		return addressId;
	}

	/**
	 * Sets the address id.
	 *
	 * @param addressId the new address id
	 */
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	/**
	 * Gets the alias.
	 *
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * Sets the alias.
	 *
	 * @param alias the new alias
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * Gets the street.
	 *
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Sets the street.
	 *
	 * @param street the new street
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Gets the zip.
	 *
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Sets the zip.
	 *
	 * @param zip the new zip
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Gets the checks if is training location.
	 *
	 * @return the checks if is training location
	 */
	public boolean getIsTrainingLocation() {
		return isTrainingLocation;
	}

	/**
	 * Sets the checks if is training location.
	 *
	 * @param isTrainingLocation the new checks if is training location
	 */
	public void setIsTrainingLocation(boolean isTrainingLocation) {
		this.isTrainingLocation = isTrainingLocation;
	}

	/**
	 * Generates object hash code.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + addressId;
		result = prime * result + ((alias == null) ? 0 : alias.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + (isTrainingLocation ? 1231 : 1237);
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
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
		Address other = (Address) obj;
		if (addressId != other.addressId)
			return false;
		if (alias == null) {
			if (other.alias != null)
				return false;
		} else if (!alias.equals(other.alias))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (isTrainingLocation != other.isTrainingLocation)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}

	/**
	 * Prints object in string format.
	 */
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", alias=" + alias + ", street=" + street + ", zip=" + zip
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", isTrainingLocation="
				+ isTrainingLocation + "]";
	}
}