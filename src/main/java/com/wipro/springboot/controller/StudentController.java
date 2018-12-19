package com.wipro.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springboot.model.Student;
import com.wipro.springboot.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

    @GetMapping("/students")
    private List<Student> getAllPersons() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    private String getStudent(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/students/{id}")
    private void deletePerson(@PathVariable("id") int id) {
    	studentService.delete(id);
    }

    @PostMapping("/students")
    private int savePerson(@RequestBody Student student) {
    	studentService.saveOrUpdate(student);
        return student.getId();
    }
}