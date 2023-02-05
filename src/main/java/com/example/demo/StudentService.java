package com.example.demo;

import Student.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Haja",
                        "Haja@yahoo.com",
                        LocalDate.of(1988, Month.APRIL, 5), 21
                )
        );
    }

}