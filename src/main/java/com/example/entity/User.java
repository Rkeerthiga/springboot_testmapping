package com.example.entity;

import javax.persistence.*;

import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String userName;
	private String password;
	private Boolean isActive;
	private Boolean isVerified;

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Person person;

	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<UserRole> userRoles;

}
