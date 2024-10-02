package com.api.prueba_feign_client.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "USER-MOCK-API", url = "${example.mock-api.url}")
public interface UserFeignClient {

}
