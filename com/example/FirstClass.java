package com.example;
import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        //output Hello, World! to the console
        System.out.println("Hello, World!"); 

        String name = " Ayush Sharma";
        int age = 10;
        int a = 25;
        int b = 30;
        double price =15.99;

        b = 20;
        name = "ironman";
        System.out.println("My name is" + name);
        System.out.println("My age is" + age);
        System.out.println("The sum of a and b is " + (a + b));
        System.out.println("The price is " + price);

        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        System.out.println("My name is " + name1);

    Scanner a1 = new Scanner(System.in);
    System.out.println("Enter first Number ");
    int num1 = a1.nextInt();
    
    Scanner b1 = new Scanner(System.in);

    System.out.println("Enter second Number "); 
    int num2 = b1.nextInt();
    int sum1 = num1 + num2;
    a1.close();
    b1.close();
    System.out.println("The sum of two numbers is " + sum1);
    }   
}