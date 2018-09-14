package ir.ahmadi.springProject.service;

import ir.ahmadi.springProject.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudent();

    Long countAllStudent();
}
