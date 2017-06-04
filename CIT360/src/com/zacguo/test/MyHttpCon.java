package com.zacguo.test;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyHttpCon {
	public static void main(String[] args) throws Exception {

		//Create input/out to read in an website url
		Scanner reader = new Scanner(System.in);
		System.out.println("Please input a website address include the protocol like https://google.com");
		String input = reader.nextLine();

		URL webpagename = new URL(input);

		// creates the connection to said web page
		HttpURLConnection testconnection = (HttpURLConnection) webpagename.openConnection();
		// establish connection buffer and prep it to display
		BufferedReader displaydata = new BufferedReader(new InputStreamReader(testconnection.getInputStream()));
		// here is the string object that the data will display in
		String hyperText;
		// loop while there is data left and display in the string
		while ((hyperText = displaydata.readLine()) != null) {

			/*
			 * Three pattern created to read out the information returned from the website.
			 * Pattern 1 matches the title tag to output the website title.
			 * Pattern 2 and 3 matches the description meta tag to output the website description.
			 * It is possible that websites place the name perimeter before or after the content perimeter.
			 */
			Pattern pattern = Pattern.compile("<title>(.*?)</title>");
			Matcher matcher = pattern.matcher(hyperText);
			if (matcher.find()) {
				System.out.println("Site Title      : " + matcher.group(1));
			}
			
			Pattern pattern2 = Pattern.compile("<meta content=\"(.*?)\" name=\"description\">");
			Matcher matcher2 = pattern2.matcher(hyperText);
			if (matcher2.find()) {
				System.out.println("Site Description: " + matcher2.group(1));
			}
			
			Pattern pattern3 = Pattern.compile("<meta name=\"description\" content=\"(.*?)\">");
			Matcher matcher3 = pattern3.matcher(hyperText);
			if (matcher3.find()) {
				System.out.println("Site Description: " + matcher3.group(1));
			}
		}
	}
}
