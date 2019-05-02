package com.revature.services;

import java.util.List;

import com.revature.models.Client;

/**
 * The Interface ClientService.
 */
public interface ClientService {

    /**
     * Save.
     *
     * @param c the c
     * @return the client
     */
    Client save(Client c);
    
    /**
     * Update.
     *
     * @param c the c
     * @return the client
     */
    Client update(Client c);
    
    /**
     * Delete.
     *
     * @param c the c
     * @return the client
     */
    Client delete(Client c);

    /**
     * Find all.
     *
     * @return the list
     */
    List<Client> findAll();
    
    /**
     * Find by id.
     *
     * @param i the i
     * @return the client
     */
    Client findById(int i);
    
    /**
     * Find by name.
     *
     * @param name the name
     * @return the client
     */
    Client findByName(String name);
}