package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student imasha = new Student(
                    1L,
                    "Imasha",
                    "@imasha@gmail.com",
                    LocalDate.of(2000, MARCH, 26)

            );

            Student kasun = new Student(
                    2L,
                    "Kasun",
                    "@kasun@gmail.com",
                    LocalDate.of(1993, AUGUST, 17)
            );

            repository.save(imasha);
            repository.save(kasun);
        };
    }
}
