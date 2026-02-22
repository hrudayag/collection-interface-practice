package com.uniquenumber;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers (duplicates allowed):");

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        System.out.println("\nUnique Numbers:");

        //using Iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nTotal Unique Count: " + numbers.size());
        scanner.close();
    }
}