package com.api.prueba_feign_client.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String id;
    private String name;
    private String username;
    private String email;
    private String avatar;
}
