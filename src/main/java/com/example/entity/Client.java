package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clientId;
	private String clientName;
	private String companyName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "fk_user_id")
	private User user;
	
	
//	hjkhgjkghjbhjghjghj
}
