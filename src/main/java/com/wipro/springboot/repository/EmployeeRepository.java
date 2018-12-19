package com.wipro.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.wipro.springboot.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
