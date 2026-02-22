package com.studentlist;

public class Student {
    private int id;
    private String name;
    private double marks;

    //constructor
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    //setter for updating marks
    public void setMarks(double marks) {
        this.marks = marks;
    }

    // toString method
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}