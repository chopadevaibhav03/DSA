package com.Vaibhav.FunctionMethod;

import java.util.Scanner;

public class PrimeOrNot {
//    public static boolean isPrime(int n){
//        boolean isPrime = true;
//        for (int i=2;i<=n-1;i++){
//            if (n % i== 0){
////                    isPrime = false;
//                return false;
//            }
//        }
//        return true;
        public static boolean isPrime(int n){
            if(n == 2){
                return true;
            }

            for (int i=2;i<=Math.sqrt(n);i++){
                if (n % i == 0){
                    return false;
                }
            }
            return true;
    }
    public static void main(String [] args){
        System.out.println(" the number is not prime :-> "+isPrime(16));
        System.out.println("the number is prime :-> "+isPrime(7));
    }
}
