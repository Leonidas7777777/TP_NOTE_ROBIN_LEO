package com.example.service_eureka;  // 📌 Remplace par le package de ton projet

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 📌 Active l'enregistrement du service auprès d'Eureka
class PatientServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(PatientServiceApplication.class, args);
	}
}
