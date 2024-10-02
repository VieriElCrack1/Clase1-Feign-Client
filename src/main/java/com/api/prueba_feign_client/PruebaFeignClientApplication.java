package com.api.prueba_feign_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients //habilitar el feign client en nuestro proyecto.
@SpringBootApplication
public class PruebaFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaFeignClientApplication.class, args);
	}

}
