package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Client;
import com.revature.services.ClientService;

/**
 * Controller class for exposing service method related to clients.
 */
@RestController
@RequestMapping("interview/client")
public class ClientController {
	
	/** The client service. */
	@Autowired
	private ClientService clientService;
	
	/**
	 * Controller method for retrieving all clients.
	 *
	 * @return List of clients
	 */
	@GetMapping
	public List<Client> findAll() {
		return clientService.findAll();
	}
}
