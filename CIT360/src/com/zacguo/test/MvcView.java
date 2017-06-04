package com.zacguo.test;

import java.util.*;

public class MvcView {

	public void printOut(ArrayList<String> inputStrings){
		String openEnd = "+----------------------------------------+";
		String inTheMiddle = "|                                        |";
		System.out.println(openEnd);
		inputStrings.forEach(word -> System.out.println(inTheMiddle.substring(0, 4) + word + inTheMiddle.substring(4+word.length())));
		System.out.println(openEnd);
		System.out.print("Add more strings: ");
	}
	
	public void printArray(ArrayList<String> inputStrings){
		String openEnd = "+----------------------------------------+";
		String inTheMiddle = "|                                        |";
		System.out.println(openEnd);
		inputStrings.forEach(word -> System.out.println(inTheMiddle.substring(0, 4) + word + inTheMiddle.substring(4+word.length())));
		System.out.println(openEnd);
	//	System.out.print("Add more strings: ");
	}
}
