package com.Vaibhav.BitManipulation;

import java.util.Scanner;

public class Operations {
  // Get Ith bit.........

    public static int getIthBit(int n,int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }else {
            return 1;
        }
    }
    // Set Ith Bit..........
    public static int SetIthBit(int n, int i){
        int bitmask = i<<i;
        return n | bitmask ;
    }
    // Clear ith bit............
    public static int ClearIthBit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    // Update Ith Bit...
    public static int UpdateIthBit(int n, int i, int newBit){
//        if(newBit == 0){
//            return ClearIthBit(n , i);
//        }else {
//            return SetIthBit(n,i);
//        }

        n = ClearIthBit(n,i);
        int Bitmask = newBit<<i;
        return n | Bitmask;
    }
    // Clear Las I Bit.........
    public static int ClearLastIBits(int n,int i){
        int Bitmask = (~0)<<i;
        return n & Bitmask;
    }

    // Clear Bits In range ..........
    public static int ClearBitsInRange(int n , int i , int j){
        int a =((~0)<<(j+1));
        int b= (1<<i)-1;
        int Bitmask = a | b;
        return n & Bitmask;
    }

    // Check number is Power of 2 or not.......
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }

    // count set bit...
    public static int CountSetBits(int n){
        int count = 0;
        while (n > 0){
            if ((n & 1) != 0){  // check LSB...
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    // Fast Exponential...
    public static int FastExpo(int n,int a){
        int ans = 1;
        while (n > 0){
            if ((n & 1) != 0){ // check LSB...
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");

        int ans = sc.nextInt();

//        System.out.println("get Ith Bit : "+getIthBit(10,3));
//        System.out.println("Set Ith bit : "+SetIthBit(10,2));
//        System.out.println("Clear Ith Bit :"+ClearIthBit(10,1));
//        System.out.println("Update Ith Bit : "+UpdateIthBit(10,2,1));
//        System.out.println("Clear Las I Bits : "+ClearLastIBits(15,2));
//        System.out.println("Clear I Bit in range :"+ClearBitsInRange(10,2,4));
//        System.out.println(" power of 2 or not : "+isPowerOfTwo(8));
//        System.out.println(CountSetBits(16));
        System.out.println("Fast Exponentiation : "+FastExpo(sc.nextInt(), ans));
    }
}
