package com.example.ibgeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class IbgeapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbgeapiApplication.class, args);
	}

}
