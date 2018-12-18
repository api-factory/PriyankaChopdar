package com.assignment.dayone;

import java.util.HashMap;
import java.util.Map;

/*
 * Write a program to store employee data in hash map and print
 * */
public class EighthAssignment {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Akshara","Senior Project Engineer");
		Employee e2 = new Employee(2,"Rahul","Project Lead");
		Employee e3 = new Employee(3,"Sneha","Senior Software Engineer");
		
		HashMap<Integer,Employee> empmap = new HashMap<Integer,Employee>();
		empmap.put(e1.getEmpid(), e1);
		empmap.put(e2.getEmpid(), e2);
		empmap.put(e3.getEmpid(), e3);
		
		for (Map.Entry<Integer, Employee> entry : empmap.entrySet()){
			System.out.println("Key = "+ entry.getKey()+", Value : "+entry.getValue());
		}
		
	}

}

class Employee{
	
	int empid;
	
	String name;
	
	String designation;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + empid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (empid != other.empid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Employee(int empid, String name, String designation) {
		super();
		this.empid = empid;
		this.name = name;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", designation=" + designation + "]";
	}
	
}
