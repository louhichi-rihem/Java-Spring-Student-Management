package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student rihem = new Student(
                    "Rihem",
                    "louhichirihem@gmail.com",
                    LocalDate.of(1999, Month.SEPTEMBER, 1)
            );

            Student sadok = new Student(
                    "Sadok",
                    "froujasadok@gmail.com",
                    LocalDate.of(1998, Month.SEPTEMBER, 17)
            );
            
            repository.save(
                rihem
            );

            repository.save(
                sadok
            );
            

        };
    }
}
