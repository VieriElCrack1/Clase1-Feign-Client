package com.api.prueba_feign_client.controller;

import com.api.prueba_feign_client.dto.UserDTO;
import com.api.prueba_feign_client.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<UserDTO> lista = userService.getUsers();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }
}
