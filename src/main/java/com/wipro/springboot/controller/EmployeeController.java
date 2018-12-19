package com.wipro.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springboot.model.Employee;
import com.wipro.springboot.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

    @GetMapping("/employees")
    private List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{empid}")
    private String getEmployee(@PathVariable("empid") int empid) {
        return employeeService.getEmployeeByEmpId(empid);
    }

    @DeleteMapping("/employees/{empid}")
    private void deleteEmployee(@PathVariable("empid") int empid) {
    	employeeService.delete(empid);
    }

    @PostMapping("/employees")
    private int saveEmployee(@RequestBody Employee employee) {
    	employeeService.saveOrUpdate(employee);
        return employee.getEmpId();
    }
}