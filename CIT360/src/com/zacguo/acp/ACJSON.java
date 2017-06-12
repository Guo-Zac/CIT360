package com.zacguo.acp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.JSONUtilities;
import org.quickconnectfamily.json.ParseException;

import com.zacguo.test.MvcView;

public class ACJSON {
	
	private static ApplicationController acp = new ApplicationController();
	
	public static void main(String args[]) {
		
		acp.mapCommand("json", new ACJSONHandler());
		
		printMenu("initMenu");

		Scanner reader = new Scanner(System.in);
		String inputData = reader.nextLine();

		/*
		 * There are three main functions of QCJSON, read string, read file and save file.
		 * Option 1 ask the user to read JSON string, option 2 ask the user to read in a file.
		 */
		switch (inputData) {
		case "1":
			jUtil();
			break;
		case "2":
			jInStream();
			break;
		}
		
		reader.close();
	}

	/*
	 * Print out menus with the MvcView class
	 */
	private static void printMenu(String menuName) {
		switch (menuName) {
		case "initMenu":
			MvcView view = new MvcView();
			view.printArray(new ArrayList<String>(Arrays.asList("1. Read JSON String", "2. Read JSON File")));
			System.out.print("Choose your option: ");
			break;
		}
	}

	/*
	 * jUtil read JSON strings and parse them into either ArrayList or HashMap
	 * After the parsing, will ask user if they want to save the file
	 */
	private static void jUtil() {
        HashMap<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("command", "readString");
        acp.handleRequest("json", dataMap);
	}

	
	/*
	 * jInStream read a JSON file and parse them into either ArrayList or HashMap
	 * After the parsing, will ask user if they want to save the file
	 */
	private static void jInStream() {
        HashMap<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("command", "readFile");
        acp.handleRequest("json", dataMap);
	}

}
