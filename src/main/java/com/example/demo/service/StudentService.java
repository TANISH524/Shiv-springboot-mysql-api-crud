package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.exception.StudentNotFoundException;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student saveStudent(Student s) {
        return repo.save(s);
    }

    public void deleteStudent(int id) {
        repo.deleteById(id);
    }

    public Student updateStudent(int id, Student s) {
        s.setId(id);
        return repo.save(s);
    }

    public Student getStudentById(int id) {
        return repo.findById(id)
                   .orElseThrow(() -> 
                   new StudentNotFoundException(id));
    }
}
