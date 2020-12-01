package com.example.Reto5;

import com.example.Reto5.vistas.UsuarioVista;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto5Application {

	public static void main(String[] args) {
            new UsuarioVista().setVisible(true);
        }
        public static void IniciarSpring(){
		SpringApplication.run(Reto5Application.class);
	}

}
