package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
