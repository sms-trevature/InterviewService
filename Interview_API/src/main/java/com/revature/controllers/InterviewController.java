package com.revature.controllers;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.revature.dtos.AssociateInterview;
import com.revature.dtos.FeedbackData;
import com.revature.dtos.Interview24Hour;
import com.revature.dtos.InterviewAssociateJobData;
import com.revature.models.Interview;
import com.revature.models.InterviewFeedback;
import com.revature.models.InterviewFormat;
import com.revature.models.FeedbackStatus;
import com.revature.models.AssociateInput;
import com.revature.services.AssociateInputService;
import com.netflix.ribbon.proxy.annotation.Var;
import com.revature.dtos.NewInterviewData;
import com.revature.feign.IUserClient;
import com.revature.models.User;
import com.revature.dtos.AssociateInterview;
import com.revature.dtos.NewAssociateInput;
import com.revature.models.Interview;
import com.revature.services.AssociateInputService;
import com.revature.services.InterviewService;

/**
 * Controller class for exposing service methods related to interviews 
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("interview")
public class InterviewController {

	/** The interview service. */
	@Autowired
	private InterviewService interviewService;
	
	/** The associate input service. */
	@Autowired
	private AssociateInputService associateInputService;
	
	/**
	 * Controller method for retrieving all interviews.
	 *
	 * @return List of interviews
	 */
	@GetMapping
	public List<Interview> findAll() {
		return interviewService.findAll();
	}
	
	/**
	 * Controller method for retrieving specified associate interviews in paginated format.
	 *
	 * @param orderBy Parameter to order list by
	 * @param direction Direction to order list (ascending/descending)
	 * @param pageNumber Number of page in list to retrieve
	 * @param pageSize Number of entries in page to retrieve
	 * @param email Email of associate associated with interviews to retrieve
	 * @return Page of interviews
	 */
	@GetMapping("/pages")
	public Page<Interview> getInterviewPageByAssociateEmail(
            @RequestParam(name="orderBy", defaultValue="id") String orderBy,
            @RequestParam(name="direction", defaultValue="ASC") String direction,
            @RequestParam(name="pageNumber", defaultValue="0") Integer pageNumber,
            @RequestParam(name="pageSize", defaultValue="5") Integer pageSize,
            @RequestParam(name="email") String email) {
		// Example url call: ~:8091/interview/page?pageNumber=0&pageSize=3
		// The above url will return the 0th page of size 3.
		Sort sorter = new Sort(Sort.Direction.valueOf(direction), orderBy);
        Pageable pageParameters = PageRequest.of(pageNumber, pageSize, sorter);
        
        return interviewService.findAllByAssociateEmail(email, pageParameters);
    }
	
	/**
	 * Controller method for retrieving all interviews in paginated format.
	 *
	 * @param orderBy Parameter to order list by
	 * @param direction Direction to order list (ascending/descending)
	 * @param pageNumber Number of page in list to retrieve
	 * @param pageSize Number of entries in page to retrieve
	 * @return Page of interviews
	 */
	@GetMapping("/page")
	public Page<Interview> getInterviewPage(
            @RequestParam(name="orderBy", defaultValue="id") String orderBy,
            @RequestParam(name="direction", defaultValue="ASC") String direction,
            @RequestParam(name="pageNumber", defaultValue="0") Integer pageNumber,
            @RequestParam(name="pageSize", defaultValue="5") Integer pageSize) {
		// Example url call: ~:8091/interview/page?pageNumber=0&pageSize=3
		// The above url will return the 0th page of size 3.
		Sort sorter = new Sort(Sort.Direction.valueOf(direction), orderBy);
        Pageable pageParameters = PageRequest.of(pageNumber, pageSize, sorter);
        
        return interviewService.findAll(pageParameters);
    }
	
	/**
	 * Controller method for retrieving number of associates who reported receiving 24 hour notice.
	 *
	 * @return List of integers containing the total number of associates and the number who reported receiving 24 hour notice
	 */
	@GetMapping("reports/request24/associate")
	public List<Integer> getInterviewsWithin24HourNoticeAssociate() {
		//returns 2 numbers in a list
		//the first is the number of users
		//the second is the number of users who received 24 hour notice (according to the associate)
		return interviewService.getInterviewsWithin24HourNoticeAssociate();
    }
	
	/**
	 * Controller method for retrieving a specific interview by its id.
	 *
	 * @param InterviewId the interview id
	 * @return Specified interview
	 */
	@GetMapping("{InterviewId}")
	public Interview getInterviewById(@PathVariable int InterviewId){
		return interviewService.findById(InterviewId);
	}

	/**
	 * Controller method for marking specified interview as reviewed.
	 *
	 * @param InterviewId the interview id
	 * @return Specified interview
	 */
	@GetMapping("markReviewed/{InterviewId}")
	public Interview markReviewed(@PathVariable int InterviewId){
		return interviewService.markReviewed(InterviewId);
	}
	
	/**
	 * Gets the interviews within 24 hour notice manager.
	 *
	 * @return the interviews within 24 hour notice manager
	 */
	@GetMapping("reports/request24/manager")
	public List<Integer> getInterviewsWithin24HourNoticeManager() {
		//returns 2 numbers in a list
		//the first is the number of users
		//the second is the number of users who received 24 hour notice (according to the manager)
		return interviewService.getInterviewsWithin24HourNoticeManager();
    }

	/**
	 * Controller method to create new interview.
	 *
	 * @param i The new interview
	 * @return The new interview
	 */
	@PostMapping("/saveinterview")
	public Interview newInterview(@Valid @RequestBody Interview i) {
		return interviewService.save(i);
	}
	
	/**
	 * Controller method to create new interview.
	 *
	 * @param i The new interview
	 * @return the new interview
	 */
	@PostMapping("/new")
	public ResponseEntity<Interview> addNewInterview( @RequestBody NewInterviewData i) {
		System.out.println("endpoint");
		
		System.out.println(i);
		Interview returnedInterview = interviewService.addNewInterview(i);
		System.out.println(returnedInterview);
		if(returnedInterview != null) {
			return ResponseEntity.ok(returnedInterview);
		}
		else {
			return new ResponseEntity<Interview>(HttpStatus.BAD_REQUEST);
		}
	}
  
	/** The user client. */
	@Autowired
    private IUserClient userClient;

	/**
	 * Test method.
	 *
	 * @return the response entity
	 */
	@GetMapping("/test")
	public ResponseEntity<String> test() {
		String o = "failed";
		try {
			System.out.println("userClient");
			System.out.println(userClient);
			o = userClient.findAll().toString();
			System.out.println("userClient.findAll()");
			System.out.println(o);
		} catch (Exception e)
		{
			System.out.println("exception occurred");
			System.out.println(e);
		}		
		return ResponseEntity.ok(o);		
	}

	/**
	 * Controller method to retrieve interview by id.
	 *
	 * @param interviewId Interview id
	 * @return Specified interview
	 */
	@GetMapping("/findInterview")
	public Interview findInterviewById(
		@RequestParam(name="interviewId", defaultValue="id") int interviewId) {

		return interviewService.findById(interviewId);
	}

	/**
	 * Controller method for submitting new associate input for specified interview.
	 *
	 * @param a New associate input
	 * @return Specified interview
	 */
	@PostMapping("/associateInput")
	public ResponseEntity<Interview> newAssociateInput(@Valid @RequestBody NewAssociateInput a) {
		System.out.println(a);
		return ResponseEntity.ok(interviewService.addAssociateInput(a));
	}
	
	/**
	 * Controller method for updating interview feedback for specified interview.
	 *
	 * @param f Interview feedback
	 * @return Specified interview
	 */
	@PostMapping("/feedback")
	public ResponseEntity<Interview> updateInterviewFeedback(@Valid @RequestBody FeedbackData f) {
		Interview result = interviewService.setFeedback(f);
		if(result != null) {
			return ResponseEntity.ok(interviewService.setFeedback(f));
		}
		return new ResponseEntity<Interview>(HttpStatus.BAD_REQUEST);
	}
	
	/**
	 * Controller method for retrieving interview feedback for a specified interview.
	 *
	 * @param InterviewId Interview id
	 * @return Interview feedback associated with specified interview
	 */
	@GetMapping("Feedback/InterviewId/{InterviewId}")
	public InterviewFeedback getInterviewFeedbackByInterviewID(@PathVariable int InterviewId) {
		return interviewService.getInterviewFeedbackByInterviewID(InterviewId);
	}
  
	/**
	 * Controller method for retrieving interview counts for each associate.
	 *
	 * @return List of associate identification data with interview counts
	 */
	@GetMapping("reports/InterviewsPerAssociate")
	public List<AssociateInterview> getInterviewsPerAssociate() {
        return interviewService.findInterviewsPerAssociate();
    }
	
	/**
	 * Controller method for retrieving interview counts for each associate in paginated format.
	 *
	 * @param pageNumber the page number
	 * @param pageSize the page size
	 * @return Paginated list of associate identification data with interview counts
	 */
	@GetMapping("reports/InterviewsPerAssociate/page")
	public Page<AssociateInterview> getInterviewsPerAssociatePaged(
            @RequestParam(name="pageNumber", defaultValue="0") Integer pageNumber,
            @RequestParam(name="pageSize", defaultValue="5") Integer pageSize) {
		// Example url call: ~:8091/reports/InterviewsPerAssociate/page?pageNumber=0&pageSize=3
		// The above url will return the 0th page of size 3.
        Pageable pageParameters = PageRequest.of(pageNumber, pageSize);
        
        return interviewService.findInterviewsPerAssociate(pageParameters);
    }

	/**
	 * Controller method for retrieving all associates who need feedback.
	 *
	 * @return List of associates
	 */
	@GetMapping("reports/AssociateNeedFeedback") //////////////////////////////////////////////////////////////
	public List<User> getAssociateNeedFeedback() {
        return interviewService.getAssociateNeedFeedback();
    }
	
	/**
	 * Controller method for retrieving all associates who need feedback in paginated format.
	 *
	 * @param pageNumber the page number
	 * @param pageSize the page size
	 * @return Paginated list of associates
	 */
	@GetMapping("reports/AssociateNeedFeedback/page")
	public Page<User> getAssociateNeedFeedbackPaged(
            @RequestParam(name="pageNumber", defaultValue="0") Integer pageNumber,
            @RequestParam(name="pageSize", defaultValue="5") Integer pageSize) {
		// Example url call: ~:8091/reports/InterviewsPerAssociate/page?pageNumber=0&pageSize=3
		// The above url will return the 0th page of size 3.
        Pageable pageParameters = PageRequest.of(pageNumber, pageSize);
        
        return interviewService.getAssociateNeedFeedback(pageParameters);
    }
	
	/**
	 * Controller method for retrieving all associates who received 24 hour notice.
	 *
	 * @return List of associate identification data and 24 hour notice details
	 */
	@GetMapping("reports/interview24")
	public List<Interview24Hour> getAll24HourNotice() {
        return interviewService.getAll24HourNotice();
    }
	
	/**
	 * Controller method for retrieving all associates who received 24 hour notice in paginated format.
	 *
	 * @param pageNumber the page number
	 * @param pageSize the page size
	 * @return Paginated list of associate identification data and 24 hour notice details
	 */
	@GetMapping("reports/interview24/page")
	public Page<Interview24Hour> getAll24HourNotice(
            @RequestParam(name="pageNumber", defaultValue="0") Integer pageNumber,
            @RequestParam(name="pageSize", defaultValue="5") Integer pageSize) {
		// Example url call: ~:8091/reports/getAll24HourNotice/page?pageNumber=0&pageSize=3
		// The above url will return the 0th page of size 3.
        Pageable pageParameters = PageRequest.of(pageNumber, pageSize);
        
        return interviewService.getAll24HourNotice(pageParameters);
    }
	
	/**
	 * Controller method for retrieving all associates who were provided job description.
	 *
	 * @return List of associate identification data and job description details
	 */
	@GetMapping("reports/interviewJD")
	public List<InterviewAssociateJobData> getAllJD() {
        return interviewService.getAllJD();
    }
	
	/**
	 * Controller method for retrieving all associates who were provided job description in paginated format.
	 *
	 * @param pageNumber the page number
	 * @param pageSize the page size
	 * @return Paginated list of associate identification data and job description details
	 */
	@GetMapping("reports/interviewJD/page")
	public Page<InterviewAssociateJobData> getAllJD(
            @RequestParam(name="pageNumber", defaultValue="0") Integer pageNumber,
            @RequestParam(name="pageSize", defaultValue="5") Integer pageSize) {
		// Example url call: ~:8091/reports/getAll24HourNotice/page?pageNumber=0&pageSize=3
		// The above url will return the 0th page of size 3.
        Pageable pageParameters = PageRequest.of(pageNumber, pageSize);
        
        return interviewService.getAllJD(pageParameters);
    }
	
	/**
	 * Controller method for retrieving chart showing associates that need feedback.
	 *
	 * @return Integer array containing chart data
	 */
	@GetMapping("reports/AssociateNeedFeedback/chart")
	public Integer[] getAssociateNeedFeedbackChart() {
		// [0] is the total number of interviews
		// [1] is the number of interviews with no feedback requested
		// [2] is the number of interviews with feedback requested
		// [3] is the number of interviews that received feedback that hasn't been delivered to associate
		// [4] is the number of interviews that received feedback that has been delivered to associate
		return interviewService.getAssociateNeedFeedbackChart();
	}
  }

