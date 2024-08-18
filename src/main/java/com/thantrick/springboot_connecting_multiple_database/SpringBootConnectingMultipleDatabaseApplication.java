package com.thantrick.springboot_connecting_multiple_database;

import com.thantrick.springboot_connecting_multiple_database.bookEntity.BookEntity;
import com.thantrick.springboot_connecting_multiple_database.userEntity.UserEntity;
import com.thantrick.springboot_connecting_multiple_database.bookRepository.BookRepository;
import com.thantrick.springboot_connecting_multiple_database.userRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConnectingMultipleDatabaseApplication implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConnectingMultipleDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookRepository.save(new BookEntity(1, "Autobiography of a yogi"));

		userRepository.save(new UserEntity(1, "Rithesh"));
	}
}
