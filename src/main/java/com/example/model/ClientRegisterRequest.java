package com.example.model;

import lombok.Data;

@Data
public class ClientRegisterRequest {
	private String clientName;
	private String companyName;
	private String userName;
	private String password;
}
