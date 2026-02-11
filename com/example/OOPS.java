package com.example;

class pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }
    public void printcolor() {
        System.out.println(this.color);
    }   
}

class Student {
    String name;
    int age;
    int rollno;

    public void printInfo( String name){
        System.out.println(name);           
    }

    public void printInfo( int age){
        System.out.println(age);           
    }

    public void printInfo( int age, String name){
        System.out.println(name); 
        System.out.println(age);           
    }

    public void PrintName() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollno);
    }

    Student() {
        System.out.println("constructor called");
    }

    Student(String name, int age, int rollno) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }
}
public class OOPS {
    public static void main(String args[]){
        pen p1 = new pen();
        p1.color = "blue";
        p1.type = "gel";

        pen p2 = new pen();
        p2.color = "black";
        p2.type = "ball";

        p1.printcolor();
        p2.printcolor();

        Student s1 = new Student();
        s1.name = "harry";
        s1.age = 18; 
        s1.rollno = 12;

       Student s2 = new Student("rohan", 19, 13);

        s1.PrintName(); 
        s2.PrintName();
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);

    }

}
