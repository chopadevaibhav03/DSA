package com.Vaibhav.Strings;

import java.util.Scanner;

public class Strings {
    public static void printLetters(String srt){
        for (int i=0;i<srt.length();i++){
            // (.charAt() => this is for to print each character in the string)
            System.out.print(srt.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        char arr[] = {'a','b','c','d'};
//        String srt = "Vaibhav";
//        String str1 = new String("dsddggzf@13435");
//
//        // Strings are IMMUTABLE;
//
//        Scanner sc = new Scanner(System.in);
//        String name;
//        name = sc.nextLine();
//        System.out.println(name);

        // (.length) for count lenght of string..
//        String fulname = "hi i am vaibhav";
//        System.out.println(fulname.length());

        // Concatenation => it means to join the two different strings..
        String firstname = "Vaibhav";
        String lastname = "chopade";
        String fulname = (firstname +" "+ lastname);
        System.out.println(fulname);

        printLetters(fulname);

    }
}
