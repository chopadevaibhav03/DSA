package com.Vaibhav.FunctionMethod;

import java.util.Scanner;

public class Product {
    public static int multiply(int a,int b){
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        int prod = multiply(3,4);
        System.out.println("a * b ="+ prod);
        prod = multiply(30,40);
        System.out.println("a * b ="+ prod);
    }
}
