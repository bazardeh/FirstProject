package ir.ahmadi.springProject.service;

import ir.ahmadi.springProject.model.Student;
import ir.ahmadi.springProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Long countAllStudent() {
        return studentRepository.count();
    }

    @Override
    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }
}
