package com.zacguo.acp;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONUtilities;

public class ACJSONHandler implements ACHandler {

	@Override
	public void handleIt(HashMap<String, Object> data) {
		String command = (String) data.remove("command");

		switch (command) {
		case "readString":
			readJSONString();
			break;
		case "readFile":
			readJSONFile();
			break;
		}
	}

	private void readJSONString() {

		try {
			Scanner reader = new Scanner(System.in);
			String inputData = "";

			System.out.print("Input your JSON String: ");
			inputData = reader.nextLine();

			JSONUtilities jsonUtil = new JSONUtilities();

			String inType = jsonUtil.parse(inputData).getClass().getSimpleName();

			switch (inType) {
			case "HashMap":
				HashMap parsedJSONMap = (HashMap) jsonUtil.parse(inputData);
				System.out.println("We converted the JSON file into a HashMap, and here is the data.");
				System.out.println(parsedJSONMap);

				break;
			case "ArrayList":
				ArrayList parsedJSONArray = (ArrayList) jsonUtil.parse(inputData);
				System.out.println("We converted the JSON file into an ArrayList, and here is the data.");
				System.out.println(parsedJSONArray);

				break;
			}

			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void readJSONFile() {

		try {

			Scanner reader = new Scanner(System.in);
			String inputData = "";

			System.out.print("Input your JSON file path: ");
			inputData = reader.nextLine();

			InputStream inStream = new FileInputStream(new File(inputData));

			Scanner inScanner = new Scanner(inStream);

			String inString = "";

			while (inScanner.hasNext()) {
				inString += inScanner.nextLine();
			}

			String inType = new JSONUtilities().parse(inString).getClass().getSimpleName();

			JSONInputStream jsonInput = new JSONInputStream(new FileInputStream(new File(inputData)));

			switch (inType) {
			case "HashMap":
				HashMap parsedJSONMap = (HashMap) jsonInput.readObject();
				System.out.println("We converted the JSON file into a HashMap, and here is the data.");
				System.out.println(parsedJSONMap);

				break;
			case "ArrayList":
				ArrayList parsedJSONArray = (ArrayList) jsonInput.readObject();
				System.out.println("We converted the JSON file into an ArrayList, and here is the data.");
				System.out.println(parsedJSONArray);

				break;
			}

			reader.close();
			inScanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
