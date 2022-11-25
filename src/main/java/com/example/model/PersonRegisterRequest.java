package com.example.model;

import lombok.Data;

@Data
public class PersonRegisterRequest {
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	
}
