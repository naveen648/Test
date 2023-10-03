package com.example.FirstSpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Dao> user=new ArrayList<>();
//
//		Dao m1=new Dao(1,"Hemanth",23);
//		Dao m2=new Dao(2,"Naveen",56);
//
//		user.add(m1);
//		user.add(m2);
//
//	}
}
