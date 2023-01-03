package com.Vaibhav.Strings;

import java.util.Scanner;

public class StringFunctions {
    public static String substring(String str,int si,int ei){ // si = starting index , ei = ending index
        String substr = "";
        for (int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
//        String s1 = "Vaibhav";
//        String s2 = "Vaibhav";
//        String s3 = new String("Vaibahv");

//        if (s1 == s2){
          //  == it checks on object level.it is not useful
//            System.out.println("String are equal");
//        }else {
//            System.out.println("String are not  equal");
//        }
       // if (s1.equals(s3)){
            // (. equals) => this function checks the value of the string .
            // it is boolean type function..
            // it is useful than (==) <-this
//            System.out.println("String are equal");
//        }else {
//            System.out.println("String are not  equal");
//        }
        // "helloWorld";
        Scanner sc=  new Scanner(System.in);
        System.out.println("enter string:");
        String str = sc.nextLine();
        System.out.println(str.substring(2,4));
//        System.out.println(substring(str,0,5));
    }
}
