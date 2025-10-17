package com.example;

import java.util.Scanner;
import java.util.*;

public class prob1 {

    public static int resultofNum(int a, int b){
        int mul = a*b;
        return mul;
        }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = resultofNum(a,b);
        System.out.println("The sum of two number is " + mul);
    }
    
}
