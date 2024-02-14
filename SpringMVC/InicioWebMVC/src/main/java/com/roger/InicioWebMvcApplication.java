package com.roger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InicioWebMvcApplication {
    /*
        Se debe respetar una estructura jerarqu[ica de paquetes , evita dificultades para encontrar los objetos
        src/
        ├── main/
        │   └── java/
        |       ├── com.example/
        |       |   └── Application.java
        |       ├── com.example.model/
        |       |   └── User.java
        |       ├── com.example.controller/
        |       |   ├── IndexController.java
        |       |   └── UsersController.java
        |       └── com.example.service/
        |           └── UserService.java
        └── resources/
            └── application.properties

    */
	public static void main(String[] args) {
		SpringApplication.run(InicioWebMvcApplication.class, args);
	}

}
