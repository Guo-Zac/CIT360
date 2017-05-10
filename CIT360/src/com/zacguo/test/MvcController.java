package com.zacguo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MvcController {
	public static void main(String[] args) {
		
		MvcModel model = new MvcModel();
		String inputData = "";
		Scanner reader = new Scanner(System.in);
		
		while(true){
			MvcView.printOut(model.getArrayOfStrings());
			 // Reading from System.in
			inputData = reader.next();
			model.addString(inputData);
		}
	}
}
