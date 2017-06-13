package com.zacguo.test;

import java.util.ArrayList;
import java.util.Arrays;

public class MyTestObject {
	public int twoElementAddition(int one, int two){
		return one+two;
	}
	
	public int square(int number){
		return number*number;
	}
	
	public void printMessageByTimes(int times){
		for(int i = 0; i< times; i++){
			System.out.print("This is a Test Message");
		}
	}
	
	public String nullForZac(String name){
		if(name == "Zac"){
			return null;
		}
		return name;
	}
	
	public Object returnSameObject(Object obj){
		return obj;
	}
	
	public void arrayIndexOutofBounds(){
		ArrayList<String> array = new ArrayList<String>(Arrays.asList("Littleton", "Boulder", "Rexburg"));
		System.out.println(array.get(5));		
	}
}
