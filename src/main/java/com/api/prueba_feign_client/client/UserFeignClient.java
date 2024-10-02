package com.api.prueba_feign_client.client;

import com.api.prueba_feign_client.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "USER-MOCK-API", url = "${example.mock.api.url}",
        configuration = FeignClientConfig.class)
public interface UserFeignClient {

    @GetMapping(value = "/users")
    List<UserDTO> getUsers();

}
