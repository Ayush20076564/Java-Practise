package com.example;
import java.util.*;

public class factorial {

    public static void fact(int n){

        int factorial = 1;

    for(int i = n; i>=1; i--){
       factorial = factorial*i;
   
    }

    System.out.println(factorial);
    return;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
   fact(n);
}
}