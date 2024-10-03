package com.api.prueba_feign_client.client;

import com.api.prueba_feign_client.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "USER-MOCK-API", url = "${example.mock.api.url}",
        configuration = FeignClientConfig.class)
public interface UserFeignClient {

    @GetMapping(value = "/users")
    List<UserDTO> getUsers();

    @PostMapping(value = "/users")
    void saveUser(@RequestBody UserDTO user);

    @PutMapping(value = "/users/{id}")
    void updateUser(@PathVariable String id, @RequestBody UserDTO user);

    @DeleteMapping(value = "/users/{id}")
    void deleteUser(@PathVariable String id);
}
