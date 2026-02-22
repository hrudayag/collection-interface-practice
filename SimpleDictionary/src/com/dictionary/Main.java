package com.dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        //add some words
        dictionary.put("Java", "A programming language");
        dictionary.put("Collection", "Framework to store and manipulate data");
        dictionary.put("Map", "Stores key-value pairs");

        System.out.println("Simple Dictionary: ");

        System.out.print("Enter a word to search: ");
        String word = scanner.nextLine();

        if (dictionary.containsKey(word)) {
            System.out.println("Meaning: " + dictionary.get(word));
        } else {
            System.out.println("Word not found in dictionary.");
        }

        System.out.println("\nAll Dictionary Entries:");

        //iterating using entrySet
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        scanner.close();
    }
}