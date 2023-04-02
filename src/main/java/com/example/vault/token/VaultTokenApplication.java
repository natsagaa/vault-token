package com.example.vault.token;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class VaultTokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaultTokenApplication.class, args);
	}

	@Value("${username}")
	private String username;

	@Value("${password}")
	private String password;

	@PostConstruct
	public void print(){
		log.info("Username is: " + username);
		log.info("Password is: " + password);
	}

}
