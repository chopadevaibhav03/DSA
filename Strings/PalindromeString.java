package com.Vaibhav.Strings;

import java.util.Scanner;

public class PalindromeString {
    public static boolean isPalindrome(String str){
        for (int i=0;i<str.length()/2;i++){
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-1-i)){
                // not a palindrome
                return false;
            }
        }
        // string is palindrome.
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));

    }
}
