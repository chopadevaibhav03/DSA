package com.Vaibhav.FunctionMethod;

import java.util.Scanner;

public class CallByValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();

        //Swaping.

        int temp = a;
         a = b;
         b = temp;
        System.out.println("After changing value :"+ b);
    }
}
