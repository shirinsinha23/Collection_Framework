package test;
import java.util.*;
public class CollectionFramework {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        myList.add("Apple"); // Duplicates allowed

        System.out.println("List Elements (With Duplicates Allowed):");
        myList.forEach(System.out::println); // Using Lambda Expression

        // Implementing Set using HashSet
        Set<String> mySet = new HashSet<>();
        mySet.add("Dog");
        mySet.add("Cat");
        mySet.add("Elephant");
        mySet.add("Dog"); // Duplicate ignored

        System.out.println("\nSet Elements (Unique Values Only):");
        mySet.forEach(System.out::println); // Lambda Expression

        // Using Stream API to filter and display items from List
        System.out.println("\nFiltered List (Fruits Starting with 'A'):");
        myList.stream().filter(fruit -> fruit.startsWith("A")).forEach(System.out::println);

        // Converting Set to List
        List<String> convertedList = new ArrayList<>(mySet);
        System.out.println("\nConverted Set to List: " + convertedList);

	}

}
