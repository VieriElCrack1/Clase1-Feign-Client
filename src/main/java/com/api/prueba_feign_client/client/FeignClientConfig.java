package com.api.prueba_feign_client.client;

import feign.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class FeignClientConfig {

    //imprimir en la consola como va el feign
    @Bean
    Logger.Level feignClientLevel() {
        log.info("ENTRANDO A FEIGN CLIENT");
        return Logger.Level.FULL;
    }

}
