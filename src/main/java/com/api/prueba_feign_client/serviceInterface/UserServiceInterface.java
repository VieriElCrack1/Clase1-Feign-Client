package com.api.prueba_feign_client.serviceInterface;

import com.api.prueba_feign_client.dto.UserDTO;

import java.util.List;

public interface UserServiceInterface {
    List<UserDTO> getUsers();
    void saveUser(UserDTO user);
    void updateUser(String id, UserDTO user);
    void deleteUser(String id);
}
