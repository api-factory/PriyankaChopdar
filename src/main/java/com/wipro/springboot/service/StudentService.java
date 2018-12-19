package com.wipro.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wipro.springboot.model.Student;
import com.wipro.springboot.repository.StudentRepository;


@Component
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        final List<Student> students = new ArrayList<Student>();
        studentRepository.findAll().forEach(student -> students.add(student));
        return students;
    }

    public String getStudentById(int id) {
        return studentRepository.findOne(id).getName();
    }

    public void saveOrUpdate(Student student) {
    	studentRepository.save(student);
    }

    public void delete(int id) {
    	studentRepository.delete(id);
    }
	
}
