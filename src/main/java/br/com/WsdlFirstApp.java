package br.com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WsdlFirstApp {

    public static void main(String[] args) {
        System.setProperty("server.port", "8080");
        SpringApplication.run(WsdlFirstApp.class, args);
    }
}
