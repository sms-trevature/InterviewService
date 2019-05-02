package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Model class for storing interview format data.
 */
@Entity
@Table(name = "interview_format")
public class InterviewFormat {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "interview_format_id")
	private int id;

	/** The format description. */
	@Column(name = "interview_format_description")
	private String formatDesc;

	/**
	 * Instantiates a new interview format.
	 *
	 * @param id the id
	 * @param formatDesc the format description
	 */
	public InterviewFormat(int id, String formatDesc) {
		super();
		this.id = id;
		this.formatDesc = formatDesc;
	}

	/**
	 * Instantiates a new interview format.
	 */
	public InterviewFormat() {
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
	 * Gets the format description.
	 *
	 * @return the format description
	 */
	public String getFormatDesc() {
		return formatDesc;
	}

	/**
	 * Sets the format description.
	 *
	 * @param formatDesc the new format description
	 */
	public void setFormatDesc(String formatDesc) {
		this.formatDesc = formatDesc;
	}

	/**
	 * Generates object hash code.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((formatDesc == null) ? 0 : formatDesc.hashCode());
		result = prime * result + id;
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
		InterviewFormat other = (InterviewFormat) obj;
		if (formatDesc == null) {
			if (other.formatDesc != null)
				return false;
		} else if (!formatDesc.equals(other.formatDesc))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	/**
	 * Prints object in string format.
	 */
	@Override
	public String toString() {
		return "InterviewFormat [id=" + id + ", formatDesc=" + formatDesc + "]";
	}
}
