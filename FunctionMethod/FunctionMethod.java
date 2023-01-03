package com.Vaibhav.FunctionMethod;

import java.util.Scanner;

public class FunctionMethod {


// .........................return by function........................
    public static void printhelloworld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
//

    /* .........................return by parameter............................*/

    public static int calculateSum(int num1,int num2){ //(int num1, int num2)-> parameter or formal parameter
        int sum = num1 + num2;
        return sum;
    }
    public static void swap(int a,int b){
        Scanner sc = new Scanner(System.in);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+ a);
        System.out.println(" b = "+ b);
    }
//    public static void main(string[] args){
//        int a = 4;
//        int b = 5;
//        swap(a,b);
//    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap (a,b); //......(a,b) is arguments,actual parameter:........
//        System.out.println("a = "+ a);
//        System.out.println(" b = "+ b);
    }


}
