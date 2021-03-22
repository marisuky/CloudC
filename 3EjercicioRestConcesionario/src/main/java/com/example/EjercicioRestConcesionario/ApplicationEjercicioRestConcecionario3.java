package com.example.EjercicioRestConcesionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

import modelo.entidad.Coche;
import modelo.persistencia.DaoCoche;

@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationEjercicioRestConcecionario3 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationEjercicioRestConcecionario3.class, args);
		

	}

}
