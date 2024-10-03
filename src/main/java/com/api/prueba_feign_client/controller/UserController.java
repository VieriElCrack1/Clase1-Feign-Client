package com.api.prueba_feign_client.controller;

import com.api.prueba_feign_client.dto.UserDTO;
import com.api.prueba_feign_client.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody UserDTO user) {
        Map<String, Object> res = new HashMap<>();
        try{
            userService.saveUser(user);
            res.put("message", "user register");
        }catch (Exception e) {
            e.printStackTrace();
            res.put("message", "user register failed");
        }
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable String id, @RequestBody UserDTO user) {
        Map<String, Object> res = new HashMap<>();
        try{
            userService.updateUser(id, user);
            res.put("message", "user modify");
        }catch (Exception e) {
            e.printStackTrace();
            res.put("message", "user modify failed");
        }
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable String id) {
        Map<String, Object> res = new HashMap<>();
        try{
            userService.deleteUser(id);
            res.put("message", "user delete");
        }catch (Exception e) {
            e.printStackTrace();
            res.put("message", "user delete failed");
        }
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
