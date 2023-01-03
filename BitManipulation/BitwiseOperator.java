package com.Vaibhav.BitManipulation;

public class BitwiseOperator {
    public static void oddEven(int n){
        int bitmark = 1;
        if ((n & bitmark) == 0){
            System.out.println(" Even number");
        }else {
            System.out.println(" odd number");
        }
    }

    public static void main(String[] args) {
        oddEven(3);
        oddEven(4);
        oddEven(1233);
    }
}
