package com.zacguo.topics;

import java.util.Scanner;

public class MyCollections {
	public static void main(String[] args){
		String inputData = "";
//		while(!inputData.equals("exit")){
			Scanner reader = new Scanner(System.in);  // Reading from System.in
	//		System.out.print("Enter a number: ");
			printMainMenu();
			String n = reader.next();
	//		
			
			System.out.println("input is " + n);
//		}
	} 
	private static void printMainMenu(){
		System.out.println("+----------------------------------------+");
		System.out.println("|   PLEASE CHOOSE A TYPE OF COLLECTION   |");
		System.out.println("+----------------------------------------+");
		System.out.println("|   1: Array                             |");
		System.out.println("|   2: LinkedList                        |");
		System.out.println("|   3: Vector                            |");
		System.out.println("|   4: HashSet                           |");
		System.out.println("|   5: LinkedHashSet                     |");
		System.out.println("|   6: TreeSet                           |");
		System.out.println("|   7: HashMap                           |");
		System.out.println("|   8: TreeMap                           |");
		System.out.println("|   9: LinkedHashMap                     |");
		System.out.println("|  10: ListIterator                      |");
		System.out.println("+----------------------------------------+");
		System.out.println("|   0: End the Program                   |");
		System.out.println("+----------------------------------------+");
		System.out.print("Please choose your collection: ");
	}
	
	private static void arrayCollection(){
		
	}
}
