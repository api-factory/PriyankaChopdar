package com.assignment.dayone;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * Write a program in java to find the length of a singly linked list in just one iteration
 * */
public class SecondAssignment {

	public static void main(String[] args) {
		
		int size=0;
		
		LinkedList<String> cities = new LinkedList<String>();
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Nashik");
		cities.add("Banglore");
		cities.add("Kolhapur");
		
		Iterator itr = cities.iterator();
		while(itr.hasNext()){
			size++;
			itr.next();
		}
		
		System.out.println("Size of Linked list :"+size);
		
	}

}
