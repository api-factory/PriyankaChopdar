package com.wipro.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wipro.springboot.model.Employee;
import com.wipro.springboot.repository.EmployeeRepository;


@Component
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        final List<Employee> employees = new ArrayList<Employee>();
        employeeRepository.findAll().forEach(employee -> employees.add(employee));
        return employees;
    }

    public String getEmployeeByEmpId(int empId) {
        return employeeRepository.findOne(empId).getEmpName();
    }

    public void saveOrUpdate(Employee employee) {
    	employeeRepository.save(employee);
    }

    public void delete(int empId) {
    	employeeRepository.delete(empId);
    }
	
}
