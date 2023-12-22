package com.brodygaudel.customerthymeleaf;

import com.brodygaudel.customerthymeleaf.entity.Customer;
import com.brodygaudel.customerthymeleaf.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerThymeleafApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(Customer.builder().email("brody@gmail.com").name("brody").build());
			customerRepository.save(Customer.builder().email("gaudel@gmail.com").name("gaudel").build());
		};
	}

}
