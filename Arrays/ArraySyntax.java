package com.Vaibhav.Arrays;

import java.util.Scanner;

public class ArraySyntax {
    public static void main(String[] args) {
        int[] marks = new int[10];
        Scanner sc =new Scanner(System.in);
//        System.out.println("enter the element");
        System.out.println("length of an array :-> " + marks.length);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
//        marks[3] = sc.nextInt();
//        marks[4] = sc.nextInt();
//        marks[5] = sc.nextInt();


        System.out.println("phy : "+ marks[0]);
        System.out.println("chem : "+ marks[1]);
        System.out.println("math : "+ marks[2]);
//        System.out.println("eng : "+ marks[3]);
//        System.out.println("his : "+ marks[4]);
//        System.out.println("geo : "+ marks[5]);

        marks[2] = 100;
        marks[2] = marks[2]+1;
        System.out.println("math : "+ marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2]) / 3;
        System.out.println("percentage = "+ percentage + "%");
    }
}
