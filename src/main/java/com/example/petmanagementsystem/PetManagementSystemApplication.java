package com.example.petmanagementsystem;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.petmanagementsystem.repository")
@EntityScan(basePackages = "com.example.petmanagementsystem.model")
public class PetManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetManagementSystemApplication.class, args);
    }
}

