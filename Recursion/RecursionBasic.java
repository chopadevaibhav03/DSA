package com.Vaibhav.Recursion;

import java.util.Scanner;

public class RecursionBasic {
    // Descending order...
    public static void printDec(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    // Increasing order...
    public static void printInc(int n){
        if (n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    // Factorial of n..
    public static int printFact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = printFact(n-1);
        int fn = n * printFact(n-1);
        return fn;
    }

    // Sum of N natural numbers..
    public static int calSum(int n){
        if (n == 1){
            return 1;
        }
        int sum1 = calSum(n-1);
        int sum = n + sum1;
        return sum;
    }
    // Calculate Fibonacci..
    public static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fibo(n-1);
        int fnm2 = fibo(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    // check array is Sorted or not...
    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    // write a Function to find the first occurrence..
    public static int firstOccurrence(int arr[],int key,int i){
        if (i == arr.length){
            return -1;
        }
        if (arr[i]  == key){
            return i;
        }
        return firstOccurrence(arr,key,i+1);
    }

    // Last Occurrence...
    public static int lastOccurrence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isfonund = lastOccurrence(arr,key,i+1);
        if (isfonund == -1 && arr[i] == key){
            return i;
        }
        return isfonund;
    }

    // Calculate X^n-1...
    public static int power(int x,int n){
        if (n == 0){
            return 1;
        }
//        int xnm1 = power(x,n-1);
//        int xn = x * xnm1-1;
//        return xn;

        return x * power(x,n-1);

    }

    // Optimized Power solution..
    public static int optimizedPower(int a,int n){
        if (n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a,n/2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd..
        if (n % 2 != 0 ){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    // Tiling Problem...
    public static int tilingProblem(int n){
        // base
        if(n == 0 || n ==1){
            return 1;
        }
//        //vertical choice
//        int fnm1 = tilingProblem(n-1);
//        // horizontal choice..
//        int fnm2 = tilingProblem(n-1);
//
//        int toWays = fnm1 + fnm2;
//        return toWays;

        return tilingProblem(n-1) + tilingProblem(n-2);
    }

    // Remove Duplicates From a given String...
    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
        // base case..
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        // kaam
        char currentChar = str.charAt(idx);
        if (map[currentChar-'a'] == true){
            // Duplicates..
            removeDuplicates(str,idx+1,newStr,map);
        }else {
            map[currentChar-'a'] = true;
            removeDuplicates(str,idx+1,newStr.append(currentChar),map);
        }
    }

    // Friends pairing problem..
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
//        // choice..
//        //single..
//        int fnm1 = friendsPairing(n-1);
//
//        // pair ..
//        int fnm2 = friendsPairing(n-2);
//        int pairWays = (n-1) * fnm2;
//
//        // total ways..
//        int totWays = fnm1 + pairWays;
//        return totWays;
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    // Print BINARY STRING..
    public static void printBinaryString(int n,int lastPlace,String str){
        // Base case...
        if(n == 0){
            System.out.println(str);
            return;
        }
        printBinaryString(n-1,0,str+"0");
        if(lastPlace == 0){
            printBinaryString(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5,5,6,5,7,8,9};
//        System.out.println("ans is :" +tilingProblem(2));

//        String str = "appnnacollage";
//        removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
//        System.out.println(tilingProblem(3));
        printBinaryString(3,0,"");

    }
}
