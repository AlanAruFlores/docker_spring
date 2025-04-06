package com.example;

import com.example.entity.User;
import com.example.repository.IUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(IUserRepository userRepository){
		return (args -> {
			List<User> users = List.of(
					new User(1L,"Alan", "Aruquipa"),
					new User(2L,"Ale", "Flores"),
					new User(3L,"Marcos", "Bordon"),
					new User(4L,"Karl", "Montoya")
					);

            userRepository.saveAll(users);
		});
	}
}
