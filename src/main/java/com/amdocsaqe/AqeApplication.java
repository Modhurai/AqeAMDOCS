package com.amdocsaqe;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;
import java.io.*;

@SpringBootApplication
@RestController
public class AqeApplication {
	@GetMapping("/msg")
	
	public String show()
	{
		int temp=21; float temperature;
	    temperature = ((temp - 32)*5)/9;

	    return temp+ " Fahrenheit in Celsius = " + temperature;
        }
	public static void main(String[] args) {
		SpringApplication.run(AqeApplication.class, args);
	}

}
