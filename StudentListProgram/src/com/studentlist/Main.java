package com.studentlist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //creating ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();

        //adding students
        students.add(new Student(1, "Hrudaya", 85.5));
        students.add(new Student(2, "Saptadipa", 92.0));
        students.add(new Student(3, "Dhana", 76.3));

        System.out.println("All Students:");
        displayStudents(students);

        //updating marks of student with ID 3
        for (Student s : students) {
            if (s.getId() == 3) {
                s.setMarks(80.0);
            }
        }

        System.out.println("\n----- After Updating Marks -----");
        displayStudents(students);

        //removing a student (ID 1)
        students.removeIf(s -> s.getId() == 1);

        System.out.println("\n----- After Removing Student -----");
        displayStudents(students);

        //sorting students by name
        Collections.sort(students, Comparator.comparing(Student::getName));

        System.out.println("\n----- Sorted by Name -----");
        displayStudents(students);
    }

    //method to display students using Iterator
    public static void displayStudents(ArrayList<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}