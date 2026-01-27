package com.example.day3_sms.controller;

import com.example.day3_sms.model.studentmodel;
import com.example.day3_sms.service.studentService;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class studentcontroller{
    private final studentService service;

    public studentcontroller(studentService service) {
        this.service = service;
    }
    //create API
    @PostMapping("add-student/")
    public studentmodel addStudent(@RequestBody studentmodel student){
        return service.addStudent(student);
    }

    //get request
    @GetMapping("students/")
    public List<studentmodel> getStudents(){
        return service.getStudents();
    }

    //update
    @PutMapping("/update/{id}")
    public studentmodel updateStudent(@PathVariable String id, @RequestBody studentmodel student){
        return service.updateStudents(id, student);
    }

    //delete
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
        return "Student deleted successfully";
    }

}
