package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Client;
import com.example.model.ClientRegisterRequest;
import com.example.service.ClientService;

@RestController
@RequestMapping("api/client")
public class ClientController {
	
	@Autowired
	ClientService clientService;
	
	@PostMapping("/addClient")
	public Client saveClient(@RequestBody ClientRegisterRequest clientRegisterRequest) {
		return clientService.saveClient(clientRegisterRequest);
	}

}
