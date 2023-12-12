package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
//@OpenAPIDefinition(info= @Info(title="Demographics Api",version = "2.0",description = "World Demographics"))
public class DemographicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemographicsApplication.class, args);
    }


}
