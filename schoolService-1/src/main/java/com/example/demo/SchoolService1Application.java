package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.example.demo.model.SchoolEntity;
import com.example.demo.repo.SchoolRepository;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
@EnableEurekaClient
public class SchoolService1Application {

	private final SchoolRepository schoolRepository;
	public static void main(String[] args) {
		SpringApplication.run(SchoolService1Application.class, args);
		
	}
	
	public void init()
	{
		
		List<SchoolEntity> list = Stream.of(new SchoolEntity(101, "St. Luke's"),
				new SchoolEntity(108, "DAV"), 
				new SchoolEntity(144, "Gurukul"), 
				new SchoolEntity(168, "DPS"), 
				new SchoolEntity(202, "Boy's School"),
				new SchoolEntity(203, "Girl's School"))
				.collect(Collectors.toList());
		
		schoolRepository.saveAll(list);
	}

}
