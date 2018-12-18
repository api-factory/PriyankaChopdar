package com.assignment.dayone;

/*
 * Write a Program with nested catch block
 * */
public class SixthAssignment {

	public static void main(String[] args) {
		
		try{
			
			int a=9,b=0;
			int div = a/b;
			
			
		}catch(NumberFormatException nf){
			System.out.println("don't dicide number by zero");
		}catch(Exception ex){
			System.out.println("Catching the exception");
		}

	}

}
