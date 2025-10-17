package com.example;

public class Pattern8 {
    public static void main(String args[]){
        int n = 5;
        int num = 1;
        int j = 0;
        for(int i=1; i<=n; i++){
            for(j=1;j<=i;j++){
                
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
    
}
