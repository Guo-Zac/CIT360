package com.zacguo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MvcUserModel {
	HashMap<String, String> userArray = new HashMap<String, String>();
	
	/*
	 * Give this model an initial data set
	 * Initialized with User Zac and password 123123
	 */
	public MvcUserModel(){

		userArray.put("Zac", "123123");
	}

	public boolean checkUser(String username, String password){
		
		/*
		 * retrieve the password by username from the HashMap
		 * then compare it to the password user input.
		 */
		if(userArray.get(username).equals(password)){
			return true;
		}
		else{
			return false;
		}
		
	}
}