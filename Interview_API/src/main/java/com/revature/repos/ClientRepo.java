package com.revature.repos;

import com.revature.models.Client;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The Interface ClientRepo.
 */
public interface ClientRepo extends JpaRepository<Client, Integer> {
	
	/**
	 * Gets the by client name.
	 *
	 * @param name the name
	 * @return the by client name
	 */
	Client getByClientName(String name);
}