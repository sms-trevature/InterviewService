package com.revature.services;

import java.util.List;

import com.revature.models.Client;
import com.revature.repos.ClientRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class ClientServiceImpl.
 */
@Service
public class ClientServiceImpl implements ClientService {

    /** The client repo. */
    @Autowired
    private ClientRepo clientRepo;

    /* (non-Javadoc)
     * @see com.revature.services.ClientService#save(com.revature.models.Client)
     */
    @Override
    public Client save(Client c) {
        return clientRepo.save(c);
    }

    /* (non-Javadoc)
     * @see com.revature.services.ClientService#update(com.revature.models.Client)
     */
    @Override
    public Client update(Client c) {
        return clientRepo.save(c);
    }

    /* (non-Javadoc)
     * @see com.revature.services.ClientService#delete(com.revature.models.Client)
     */
    @Override
    public Client delete(Client c) {
        return null;
    }

    /* (non-Javadoc)
     * @see com.revature.services.ClientService#findAll()
     */
    @Override
    public List<Client> findAll() {
        return clientRepo.findAll();
    }

    /* (non-Javadoc)
     * @see com.revature.services.ClientService#findById(int)
     */
    @Override
    public Client findById(int i) {
        return clientRepo.getOne(i);
    }

    /* (non-Javadoc)
     * @see com.revature.services.ClientService#findByName(java.lang.String)
     */
    @Override
    public Client findByName(String name) {
        return clientRepo.getByClientName(name);
    }

    
}