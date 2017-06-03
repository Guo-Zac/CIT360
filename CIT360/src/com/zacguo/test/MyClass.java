package com.zacguo.test;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args){
		System.out.println("Hello, CIT360");
		
		System.out.println("Thread id: "
                +Thread.currentThread().getName());
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.print("Enter a number: ");
		String n = reader.next();
		System.out.println("input is " + n);
	}
	
}
