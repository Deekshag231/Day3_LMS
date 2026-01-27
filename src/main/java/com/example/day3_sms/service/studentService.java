package com.example.day3_sms.service;

import com.example.day3_sms.model.studentmodel;
import com.example.day3_sms.repository.studentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {
    private static studentRepository repository;

    public studentService(studentRepository repository) {
        this.repository = repository;
    }

    //create
    public studentmodel addStudent(studentmodel student){
        return repository.save(student);
    }


    public List<studentmodel> getStudents() {
        return repository.findAll();
    }
    public studentmodel updateStudents(String id,studentmodel student){
        studentmodel existingStudent=repository.findById(id).orElseThrow(()-> new RuntimeException("No student found"));
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setEmail(student.getEmail());
        return repository.save(existingStudent);
    }
    public static void deleteStudent(String id) {
        repository.deleteById(id);
    }
}
