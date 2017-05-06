package com.zacguo.topics;

import java.util.*;

public class MyCollections {
	public static void main(String[] args) {
		String inputData = "";
		while (!inputData.equals("0")) {
			Scanner reader = new Scanner(System.in); // Reading from System.in
			// System.out.print("Enter a number: ");
			printMainMenu();
			inputData = reader.next();

			// System.out.println("input is " + inputData);

			switch (inputData) {
			case "1":
				arrayCollection();
				break;
			case "2":
				linkedListCollection();
				break;
			case "3":
				vectorCollection();
				break;
			case "4":
				hashSetCollection();
				break;
			case "5":
				linkedHashCollection();
				break;
			case "6":
				treeSetCollection();
				break;
			case "7":
				hashMapCollection();
				break;
			case "8":
				treeMapCollection();
				break;
			case "9":
				linkedHashMapCollection();
				break;
			case "10":
				listIteratorCollection();
				break;
			}
			if(!inputData.equals("0")){
				pressAnyKeyToContinue();
			}
			else{
				System.out.println("-----------------------------------------------------");
				System.out.println("Program Ended. Thank you for using MyCollections.java");
			}

		}
	}

	private static void printMainMenu() {
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

	private static void arrayCollection() {
		// Creates a sting based array
		ArrayList<String> cities = new ArrayList<String>(Arrays.asList("Littleton", "Boulder", "Rexburg"));
		System.out.println("Some United States cities are" + cities);

		// say I forgot to add a city I can add it easily
		// I will need to specify the index number and the new city
		cities.add("Colorado Springs");
		cities.add(1, "Cairo");
		// The one will put the new city 2nd because it starts with 0
		// Below is the newly added cities
		System.out.println("Some United States cities are" + cities);

		// Since Cairo is wrong lets remove it
		cities.remove("Cairo");
		System.out.println("Some United States cities are" + cities);

		// Say I wanted to change one of the cities to an idaho City
		cities.set(3, "Idaho Falls");
		System.out.println("Some United States cities are" + cities);
		// Say you had a HUGE list and you needed to find out what
		// the index was of a city name
		int cityindex = cities.indexOf("Idaho Falls");
		System.out.println("The index number of Idaho Falls is " + cityindex);
		// Or the opposite say you had the index but not the string
		String cityname = cities.get(0);
		System.out.println("The index number 0 resolves to " + cityname);
	}

	private static void linkedListCollection() {
		LinkedList<String> mylinkedlist = new LinkedList<String>();
		// This doesn't work:
		// LinkedList.asList("Littleton","Boulder","Rexburg"));
		mylinkedlist.add("Screwdriver");
		mylinkedlist.add("Drill");
		mylinkedlist.add("Wrench");
		System.out.println("Some tools at the Home Depot are: " + mylinkedlist);

		// Adding and removing are the same
		mylinkedlist.add("Paintbrush");
		mylinkedlist.removeFirst();
		System.out.println(mylinkedlist);
	}

	private static void vectorCollection() {
		/*
		 * Vector is a growable array that starts with an initial Capacity and
		 * can be given an increment of growth
		 */
		Vector<String> vector = new Vector<String>(3);
		vector.add("item0");
		vector.add("item1");
		vector.add("item2");
		System.out.println("Current size of the vector is " + vector.size());
		System.out.println("Growth increment is " + vector.capacity());
		// what happens when we add another? it grows by the growth cap #
		vector.add("item3");
		System.out.println("Current size of the vector is " + vector.size());
		System.out.println("Growth increment is " + vector.capacity());
		// Notice the growth increment increased by 3.
		// To display the values its the same as an array
		System.out.println(vector);
	}

	private static void hashSetCollection() {
		/*
		 * Next is the Set Collection which has HashSet's, Linked Hash Sets and
		 * Tree set. HashSet's are similar to an array but it doesnt have an
		 * index all the data is stored and displayed in a random order.
		 */
		HashSet<String> hashset = new HashSet<String>();
		// HashSet.asList("Littleton","Boulder","Rexburg");
		// You cant add to a hash set using the asList option.
		// To add simple use <name>.add("Element");
		hashset.add("Apple");
		/*
		 * There is no way to add them except one at a time unless you make them
		 * into an array. Example: validStates = new
		 * HashSet<String>(Arrays.asList("AL", "AK", ".."));
		 */
		hashset.add("Peach");
		hashset.add("Grape");
		hashset.add("Orange");
		System.out.println("\nHere is a random assortment of fruit: " + hashset);
		/*
		 * as you can see it randomized it This does NOT work:
		 * hashset.add(1,"Lemon");
		 */
	}

	private static void linkedHashCollection() {
		/*
		 * Linked HashSet is similar to Hashset but it maintains the order of
		 * elements in which they were added to the set.
		 */
		LinkedHashSet<String> linkedhashset = new LinkedHashSet<String>();
		linkedhashset.add("A");
		linkedhashset.add("B");
		linkedhashset.add("C");
		linkedhashset.add("D");
		linkedhashset.add("E");
		linkedhashset.add("F");
		System.out.println(linkedhashset);
		// Notice the order remained the same as we added it.
		// This: linkedhashset.add(0,"F"); doesnt work
	}

	private static void treeSetCollection() {
		/*
		 * Tree set will organize sets alphabetically or from least to greatest
		 */
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("yoyo");
		treeset.add("ball");
		treeset.add("pogostick");
		treeset.add("bicycle");

		TreeSet<Integer> treeset2 = new TreeSet<Integer>();
		treeset2.add(3534);
		treeset2.add(-24);
		treeset2.add(89123);
		treeset2.add(213354);
		System.out.println(treeset);
		System.out.println(treeset2);
		// As you can see the ints and strings are organized
	}

	private static void hashMapCollection() {
		/*
		 * The Map collection includes Hash Map, Tree Map and Linked Map
		 */

		// Hash Map stores data using a key a value pair system.
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(87, "the number 87");
		hashmap.put(25, "the number 25");
		hashmap.put(-7, "the number -7");
		hashmap.put(32, "the number 32");
		hashmap.put(007, "the number 007");
		// to display content you can use
		System.out.println(hashmap);
		// OR using iterator
		System.out.println("\nHash Map output");
		Set set = hashmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mapentry = (Map.Entry) iterator.next();
			System.out.print("key is: " + mapentry.getKey() + " & Value is: ");
			System.out.println(mapentry.getValue());
		}
		/*
		 * You can use get to find the value at a certain int similar to an
		 * array list index
		 */
		String getbyint = hashmap.get(-7);
		System.out.println("The value of int -7 is " + getbyint);
	}

	private static void treeMapCollection() {
		/* Tree map sorts Data just like the TreeSet only in Map Format */
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		treemap.put(87, "the number 87");
		treemap.put(25, "the number 25");
		treemap.put(-7, "the number -7");
		treemap.put(32, "the number 32");
		treemap.put(007, "the number 007");

		TreeMap<Integer, String> treemap2 = new TreeMap<Integer, String>();
		treemap2.put(87, "A");
		treemap2.put(25, "B");
		treemap2.put(-7, "C");
		treemap2.put(32, "D");
		treemap2.put(007, "E");
		// Display treemap data
		System.out.println("\nTree Map output");
		System.out.println(treemap);
		System.out.println("\nTree Map 2 output");
		System.out.println(treemap2);
		// OR using iterator
		System.out.println("\nTree Map output");
		Set set2 = treemap.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry mapentry2 = (Map.Entry) iterator2.next();
			System.out.print("key is: " + mapentry2.getKey() + " & Value is: ");
			System.out.println(mapentry2.getValue());

		}
		System.out.println("\nTree Map 2 output");
		Set set3 = treemap2.entrySet();
		Iterator iterator3 = set3.iterator();
		while (iterator3.hasNext()) {
			Map.Entry mapentry3 = (Map.Entry) iterator3.next();
			System.out.print("key is: " + mapentry3.getKey() + " & Value is: ");
			System.out.println(mapentry3.getValue());

		}
		// Notice Tree Map 2 lists them by their key not their value!
	}

	private static void linkedHashMapCollection() {
		/*
		 * Linked Hash Map retains the insertion Order using the Head Tail
		 * method as does the Liked hash
		 */

		LinkedHashMap<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
		linkedhashmap.put(22, "A");
		linkedhashmap.put(33, "B");
		linkedhashmap.put(1, "C");
		linkedhashmap.put(2, "D");
		linkedhashmap.put(100, "E");

		System.out.println("\nLinked Hash Map output");
		Set set4 = linkedhashmap.entrySet();
		Iterator iterator4 = set4.iterator();
		while (iterator4.hasNext()) {
			Map.Entry me = (Map.Entry) iterator4.next();
			System.out.print("Key is: " + me.getKey() + " & Value is: " + me.getValue() + "\n");
		}
		// Values are in the order entered

		/*
		 * Iteration is to repeat or loop mathematically and is the Last Java
		 * collection
		 */
		System.out.println("\nExample of iteration");
		Set set5 = linkedhashmap.entrySet();
		Iterator iterator5 = set5.iterator();
		while (iterator5.hasNext()) {
			Map.Entry me1 = (Map.Entry) iterator5.next();
			System.out.print("Key is: " + me1.getKey() + " & Value is: " + me1.getValue() + "\n");

		}
	}

	private static void listIteratorCollection() {
		/*
		 * ListIterator can reverse or forward the order of the iteration/loop
		 * using Previous and Next
		 */
		ListIterator<String> litr = null;
		List<String> names = new ArrayList<String>();
		names.add("1");
		names.add("2");
		names.add("3");
		names.add("4");
		names.add("5");
		// Obtaining list iterator
		litr = names.listIterator();

		System.out.println("\nTraversing the list in forward direction:");
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("\nTraversing the list in backward direction:");
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

	}

	private static void pressAnyKeyToContinue() {
		System.out.println("-------------------------------------");
		System.out.println("Press any key to continue...");
		try {
			System.in.read();
		} catch (Exception e) {
		}
	}
}
