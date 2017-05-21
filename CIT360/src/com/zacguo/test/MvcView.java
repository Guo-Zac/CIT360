package com.zacguo.test;

import java.util.*;

public class MvcView {
	/*
	 * This is just a static method to print out an array into a box format
	 * Views can have multiple methods to display data differently
	 */
	public static void printOut(ArrayList<String> inputStrings){
		String openEnd = "+----------------------------------------+";
		String inTheMiddle = "|                                        |";
		System.out.println(openEnd);
		inputStrings.forEach(word -> System.out.println(inTheMiddle.substring(0, 4) + word + inTheMiddle.substring(4+word.length())));
		System.out.println(openEnd);
		System.out.print("Add more strings: ");
	}
}
