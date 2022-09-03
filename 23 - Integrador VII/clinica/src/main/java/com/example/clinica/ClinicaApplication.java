package com.example.clinica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClinicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicaApplication.class, args);
	}

	// URL modelo para acessar no navegador
	// http://localhost:8080/usuario?id=2&nome=Narayana&email=narayana@email.com&senha=123&nivelAcesso=Vip
	// http://localhost:8080/dentista?id=1&nome=Narayana&email=narayana@email.com&numMatricula=010456&atendeConvenio=True

}
