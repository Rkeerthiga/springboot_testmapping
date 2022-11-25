package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Client;
import com.example.entity.User;
import com.example.model.ClientRegisterRequest;
import com.example.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository clientRepository;
	
	public Client saveClient(ClientRegisterRequest clientRegisterRequest) {
		Client client = new Client();
		client.setClientName(clientRegisterRequest.getClientName());
		client.setCompanyName(clientRegisterRequest.getCompanyName());
		
		User user  = new User();
		user.setUserName(clientRegisterRequest.getUserName());
		user.setPassword(clientRegisterRequest.getPassword());
		
		client.setUser(user);
		
		return clientRepository.save(client);
	}

}
