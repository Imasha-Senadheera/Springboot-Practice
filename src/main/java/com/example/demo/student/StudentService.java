package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(
                1L,
                "Imashaaaa",
                "@imasha@gmail.com",
                LocalDate.of(2000, Month.MARCH, 26),
                21
        ));
        return students;
    }
}
