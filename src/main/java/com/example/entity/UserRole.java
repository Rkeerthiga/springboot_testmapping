package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_role")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userRoleId;
    private String roleName;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="fk_user_id")
    private User user;
}
