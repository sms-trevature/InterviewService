package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.models.*;

/**
 * The Interface InterviewRepo.
 */
public interface InterviewRepo extends JpaRepository<Interview, Integer> {
	
	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the interview
	 */
	Interview findById(int id);
	
	/**
	 * Find by associate email.
	 *
	 * @param email the email
	 * @return the list
	 */
	List<Interview> findByAssociateEmail(String email);

}
