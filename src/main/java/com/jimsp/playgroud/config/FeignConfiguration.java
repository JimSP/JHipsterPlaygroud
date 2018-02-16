package com.jimsp.playgroud.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.jimsp.playgroud")
public class FeignConfiguration {

}
