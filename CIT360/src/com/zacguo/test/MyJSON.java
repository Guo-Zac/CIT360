package com.zacguo.test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.quickconnectfamily.json.*;

public class MyJSON {
	public static void main(String args[]) throws ParseException, JSONException {
		
		jUtil();
		/*
		
		Scanner reader = new Scanner(System.in);
		String inputData = "";
		
		System.out.print("Input your JSON String: ");
		inputData = reader.nextLine();
		
		InputStream stream = new ByteArrayInputStream(inputData.getBytes());

		JSONInputStream jsonInput = new JSONInputStream(stream);

		System.out.print("Is it a Key/Value JSON(1) or Array JSON(2)? ");
		
		inputData = reader.nextLine();
		
//		System.out.println(jsonInput.readObject().getClass().getSimpleName());
//		System.out.println(jsonInput.readObject().getClass().getSimpleName());

		
		if (inputData.equals("1")) {
//	if (inputData.equals("1")) {
			HashMap parsedJSONMap = (HashMap) jsonInput.readObject();

			System.out.println(parsedJSONMap);
		}
		else if(inputData.equals("2")){
			ArrayList parsedJSONArray = (ArrayList) jsonInput.readObject();

			System.out.println(parsedJSONArray);
		}
		
		
		*/
	}
	
	private static void jUtil() throws JSONException, ParseException{

		Scanner reader = new Scanner(System.in);
		String inputData = "";
		
		System.out.print("Input your JSON String: ");
		inputData = reader.nextLine();
		
		JSONUtilities jsonUtil = new JSONUtilities();

		System.out.println(jsonUtil.parse(inputData).getClass().getSimpleName());
		System.out.println(jsonUtil.parse(inputData).getClass().getSimpleName());
	}
}
