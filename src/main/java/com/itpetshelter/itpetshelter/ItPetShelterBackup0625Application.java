package com.itpetshelter.itpetshelter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ItPetShelterBackup0625Application {

    public static void main(String[] args) {
        SpringApplication.run(ItPetShelterBackup0625Application.class, args);
    }

}
