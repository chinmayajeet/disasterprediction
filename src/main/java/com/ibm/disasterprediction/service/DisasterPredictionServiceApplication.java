package com.ibm.disasterprediction.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ibm.disasterprediction.controller.DisasterPredictionController;

@SpringBootApplication
@ComponentScan(basePackageClasses = DisasterPredictionController.class)
public class DisasterPredictionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisasterPredictionServiceApplication.class, args);
	}
}
