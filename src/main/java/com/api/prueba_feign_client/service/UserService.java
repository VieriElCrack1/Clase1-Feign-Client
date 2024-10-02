package com.api.prueba_feign_client.service;

import com.api.prueba_feign_client.client.UserFeignClient;
import com.api.prueba_feign_client.dto.UserDTO;
import com.api.prueba_feign_client.serviceInterface.UserServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService implements UserServiceInterface {

    private final UserFeignClient feignClient;


    @Override
    public List<UserDTO> getUsers() {
        List<UserDTO> response = feignClient.getUsers();
        return response;
    }

    @Override
    public void saveUser(UserDTO user) {

    }

    @Override
    public void updateUser(String id, UserDTO user) {

    }

    @Override
    public void deleteUser(String id) {

    }
}
