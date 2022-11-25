package com.example.service;

import com.example.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Client;
import com.example.entity.User;
import com.example.model.ClientRegisterRequest;
import com.example.repository.ClientRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public Client saveClient(ClientRegisterRequest clientRegisterRequest) {
        Client client = new Client();
        client.setClientName(clientRegisterRequest.getClientName());
        client.setCompanyName(clientRegisterRequest.getCompanyName());

        User user = new User();
        user.setUserName(clientRegisterRequest.getUserName());
        user.setPassword(clientRegisterRequest.getPassword());

        UserRole userRole = new UserRole();
        userRole.setRoleName("CLIENT");
        userRole.setUser(user);

        List<UserRole> userRoleList = new ArrayList<>();
        userRoleList.add(userRole);
        user.setUserRoles(userRoleList);

        client.setUser(user);

        return clientRepository.save(client);
    }

}
