package com.Vaibhav.FunctionMethod;

public class BinaryToDecimal {
    public static void binToDec(int binNum){
        int myNum = 101;
        int pow = 0;
        int decnNum = 0;

        while (binNum > 0){
            int lastDegit = binNum % 10;
            decnNum = decnNum + (lastDegit * (int) Math.pow(2,pow));

            pow ++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + myNum  +" => " + decnNum);
    }

    public static void main(String[] args) {
        binToDec(101);
    }
}
