package com.crud.contaclistapi;

import com.crud.contaclistapi.entity.Contact;
import com.crud.contaclistapi.repositoty.ContactRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ContaclistapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContaclistapiApplication.class, args);
	}

	@Bean
	ModelMapper modelMaper() {
		return new ModelMapper();
	}
}
