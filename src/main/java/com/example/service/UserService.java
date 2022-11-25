package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Person;
import com.example.entity.User;
import com.example.model.PersonRegisterRequest;
import com.example.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired 
	UserRepository userRepository;
	
	public User savePerson(PersonRegisterRequest personRegisterRequest) {
		User user = new User();
		user.setUserName(personRegisterRequest.getUserName());
		user.setPassword(personRegisterRequest.getPassword());
		
		Person person = new Person();
		person.setFirstName(personRegisterRequest.getFirstName());
		person.setLastName(personRegisterRequest.getLastName());
		
		user.setPerson(person);
		return userRepository.save(user);
		
	}

}
