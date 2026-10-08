package com.kiet.student;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner {
	static final Logger loger = LoggerFactory.getLogger(StudentApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		loger.info("KIET Student Management System Started");
		loger.info("Loding Student Data...");
		loger.info("Student Management Rest API is Ready");
	}

}
