package com.revature.services;

import java.util.List;

import com.revature.dtos.AssociateInterview;
import com.revature.dtos.NewAssociateInput;
import com.revature.dtos.NewInterviewData;
import com.revature.models.Interview;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.revature.dtos.AssociateInterview;
import com.revature.dtos.FeedbackData;
import com.revature.dtos.Interview24Hour;
import com.revature.dtos.InterviewAssociateJobData;
import com.revature.models.Interview;
import com.revature.models.InterviewFeedback;
import com.revature.models.User;

/**
 * The Interface InterviewService.
 */
public interface InterviewService {

	/**
	 * Save.
	 *
	 * @param i the i
	 * @return the interview
	 */
	Interview save(Interview i);
	
	/**
	 * Update.
	 *
	 * @param i the i
	 * @return the interview
	 */
	Interview update(Interview i);
	
	/**
	 * Delete.
	 *
	 * @param i the i
	 * @return the interview
	 */
	Interview delete(Interview i);
	
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
	 * @param s the s
	 * @return the interview
	 */
	Interview findByAssociateEmail(String s);
	
	/**
	 * Find by manager email.
	 *
	 * @param s the s
	 * @return the interview
	 */
	Interview findByManagerEmail(String s);
	
	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<Interview> findAll();
	
	/**
	 * Adds the new interview.
	 *
	 * @param i the i
	 * @return the interview
	 */
	Interview addNewInterview(NewInterviewData i);
	
	/**
	 * Adds the associate input.
	 *
	 * @param a the a
	 * @return the interview
	 */
	Interview addAssociateInput(NewAssociateInput a);
	
	/**
	 * Find all.
	 *
	 * @param page the page
	 * @return the page
	 */
	Page<Interview> findAll(Pageable page);
	
	/**
	 * Find all by associate email.
	 *
	 * @param email the email
	 * @param page the page
	 * @return the page
	 */
	Page<Interview> findAllByAssociateEmail(String email, Pageable page);
	
	/**
	 * Find interviews per associate.
	 *
	 * @return the list
	 */
	List<AssociateInterview> findInterviewsPerAssociate();
	
	/**
	 * Find interviews per associate.
	 *
	 * @param page the page
	 * @return the page
	 */
	Page<AssociateInterview> findInterviewsPerAssociate(Pageable page);
	
	/**
	 * Gets the interviews within 24 hour notice associate.
	 *
	 * @return the interviews within 24 hour notice associate
	 */
	List<Integer> getInterviewsWithin24HourNoticeAssociate();
	
	/**
	 * Gets the interviews within 24 hour notice manager.
	 *
	 * @return the interviews within 24 hour notice manager
	 */
	List<Integer> getInterviewsWithin24HourNoticeManager();
	
	/**
	 * Sets the feedback.
	 *
	 * @param f the f
	 * @return the interview
	 */
	Interview setFeedback(FeedbackData f);
	
	/**
	 * Gets the associate need feedback.
	 *
	 * @return the associate need feedback
	 */
	List<User> getAssociateNeedFeedback();
	
	/**
	 * Gets the associate need feedback.
	 *
	 * @param page the page
	 * @return the associate need feedback
	 */
	Page<User> getAssociateNeedFeedback(Pageable page);
	
	/**
	 * Gets the all 24 hour notice.
	 *
	 * @return the all 24 hour notice
	 */
	List<Interview24Hour> getAll24HourNotice();
	
	/**
	 * Gets the all 24 hour notice.
	 *
	 * @param page the page
	 * @return the all 24 hour notice
	 */
	Page<Interview24Hour> getAll24HourNotice(Pageable page);
	
	/**
	 * Gets the all JD.
	 *
	 * @return the all JD
	 */
	List<InterviewAssociateJobData> getAllJD();
	
	/**
	 * Gets the all JD.
	 *
	 * @param page the page
	 * @return the all JD
	 */
	Page<InterviewAssociateJobData> getAllJD(Pageable page);
	
	/**
	 * Gets the associate need feedback chart.
	 *
	 * @return the associate need feedback chart
	 */
	Integer[] getAssociateNeedFeedbackChart();
	
	/**
	 * Gets the interview feedback by interview ID.
	 *
	 * @param interviewId the interview id
	 * @return the interview feedback by interview ID
	 */
	InterviewFeedback getInterviewFeedbackByInterviewID(int interviewId);
	
	/**
	 * Mark reviewed.
	 *
	 * @param interviewId the interview id
	 * @return the interview
	 */
	Interview markReviewed(int interviewId);
}
