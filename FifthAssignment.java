package com.assignment.dayone;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * Write a pogram for data iteration from collection
 * */
public class FifthAssignment {

	public static void main(String[] args) {
		
		LinkedList<String> cities = new LinkedList<String>();
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Nashik");
		cities.add("Banglore");
		cities.add("Kolhapur");
		
		Iterator itr = cities.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
