package com.wipro.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import com.wipro.springboot.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
