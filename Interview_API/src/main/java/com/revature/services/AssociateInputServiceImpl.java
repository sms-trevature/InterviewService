package com.revature.services;

import java.util.List;

import com.revature.dtos.NewAssociateInput;
import com.revature.models.AssociateInput;
import com.revature.models.Interview;
import com.revature.repos.AssociateInputRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class AssociateInputServiceImpl.
 */
@Service
public class AssociateInputServiceImpl implements AssociateInputService {

    /** The associate repository. */
    @Autowired
    private AssociateInputRepo associateRepo;
    
    /** The interview service. */
    @Autowired
    private InterviewService interviewService;

    /* (non-Javadoc)
     * @see com.revature.services.AssociateInputService#save(com.revature.models.AssociateInput)
     */
    public AssociateInput save(AssociateInput a) {
        return associateRepo.save(a);
    }

    /* (non-Javadoc)
     * @see com.revature.services.AssociateInputService#update(com.revature.models.AssociateInput)
     */
    @Override
    public AssociateInput update(AssociateInput a) {
        return null;
    }

    /* (non-Javadoc)
     * @see com.revature.services.AssociateInputService#delete(com.revature.models.AssociateInput)
     */
    @Override
    public AssociateInput delete(AssociateInput a) {
        return null;
    }

    /* (non-Javadoc)
     * @see com.revature.services.AssociateInputService#findAll()
     */
    @Override
    public List<AssociateInput> findAll() {
        return null;
    }

    /* (non-Javadoc)
     * @see com.revature.services.AssociateInputService#addAssociateInput(com.revature.dtos.NewAssociateInput)
     */
    @Override
    public Interview addAssociateInput(NewAssociateInput a) {
        System.out.println("INSIDE INTERVIEW SERVICE TO GET INTERVIEW");
         int interviewNumber = a.getInterviewId();
         Interview temp = interviewService.findById(interviewNumber);

         AssociateInput ai = new AssociateInput(0, a.getReceivedNotifications(), a.isDescriptionProvided(), temp, a.getInterviewFormat(), 
         a.getProposedFormat());

         temp.setAssociateInput(ai);
         System.out.println(temp.toString());

         interviewService.save(temp);
         return temp;
    }
}