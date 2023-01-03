package com.Vaibhav.FunctionMethod;

public class FunctionOverloading {
   /* Function ob=verloadint using paremeter: */

    // Function to call sum of 2 numbers:
//    public static int sum(int a,int b){
//        return a+b;
//    }
    // Function to call sum of 3 numbers:
//    public static int sum(int a,int b,int c){
//
//        return a+b+c;
//    }

    /* Function Overloading using Data Types : */
    //func to call int sum :.....
    public static int sum(int a,int b){
        return a+b;
    }

    //function to call Float sum :.....
    public static float sum(float a,float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("sum of 2 numbers is :->  "+sum(2,3));
        System.out.println("sum of 3 numbers is :->  "+sum(1.2f,3.3f));

    }
}
