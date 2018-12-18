package com.assignment.dayone;

import java.util.Collections;
import java.util.LinkedList;

/*
 * Write a program to Reverse a singly linked list in java.
 * */
public class FirstAssignment {

	public static void main(String[] args) {
		
		LinkedList<String> cities = new LinkedList<String>();
		LinkedList<String> reverseCities = new LinkedList<String>();
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Nashik");
		cities.add("Banglore");
		cities.add("Kolhapur");
		
		System.out.println("Original LinkedList :");
		System.out.println(cities);
		
		for(int i=cities.size()-1; i>=0 ; i--){
			
			reverseCities.add(cities.get(i));
		}
		
		
		System.out.println("Reverse LinkedList :");
		System.out.println(reverseCities);
		
	}

}
