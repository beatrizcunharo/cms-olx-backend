package com.developer.cmsolxbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.developer.controller.ConnectionFactory;

@SpringBootApplication
public class CmsOlxBackendApplication {

	public static void main(String[] args) throws ClassNotFoundException {
		SpringApplication.run(CmsOlxBackendApplication.class, args);
		ConnectionFactory connect_db = new ConnectionFactory();
		connect_db.connection();
	}

}
