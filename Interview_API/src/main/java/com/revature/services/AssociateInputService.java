package com.revature.services;

import java.util.List;

import com.revature.dtos.NewAssociateInput;
import com.revature.models.AssociateInput;
import com.revature.models.Interview;

/**
 * The Interface AssociateInputService.
 */
public interface AssociateInputService {

    /**
     * Save.
     *
     * @param a the a
     * @return the associate input
     */
    AssociateInput save(AssociateInput a);
    
    /**
     * Update.
     *
     * @param a the a
     * @return the associate input
     */
    AssociateInput update(AssociateInput a);
    
    /**
     * Delete.
     *
     * @param a the a
     * @return the associate input
     */
    AssociateInput delete(AssociateInput a);

    /**
     * Find all.
     *
     * @return the list
     */
    List<AssociateInput> findAll();
    
    /**
     * Adds the associate input.
     *
     * @param a the a
     * @return the interview
     */
    Interview addAssociateInput(NewAssociateInput a);

}