package com.zacguo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MvcController {
	public static void main(String[] args) {
		
		/*
		 * In this controller example, it displays the model instance by view.
		 * Then, ask the user to input more data. Data will be saved back to model, and 
		 * use view to display the new array.
		 */
		MvcModel dataModel = new MvcModel();
		String inputData = "";
		Scanner reader = new Scanner(System.in);
		
		/*
		 * Username and password check is added from another model MvcUserModel
		 */
		System.out.print("Please input username: ");
		String username = reader.next();
		System.out.print("Please input password: ");
		String password = reader.next();
		
		MvcUserModel userModel = new MvcUserModel();
		if(!userModel.checkUser(username, password)){
			System.out.println("Username or Password error, program ended.");
			System.exit(0);
		}
		
		/*
		 * list size is limited, which the ability to check with method isNotFull()
		 */
		while(dataModel.isNotFull()){
			
			MvcView view = new MvcView();
			
			view.printOut(dataModel.getArrayOfStrings());
			 // Reading from System.in
			inputData = reader.next();
			dataModel.addString(inputData);
		}
		
		/*
		 * when list is full, notice the user and display the full list.
		 */
		System.out.println();
		System.out.println("List is full, here are the content");
		System.out.print(dataModel.getArrayOfStrings());
	}
}
