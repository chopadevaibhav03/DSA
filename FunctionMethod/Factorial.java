package com.Vaibhav.FunctionMethod;

import java.util.Scanner;

public class Factorial {
    public static int Factorial(int n){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number :");
        int f = 1;

        for (int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binomialCoefficient(int n,int r){
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n-r);

        int binomialCoefficient = fact_n / (fact_r*fact_nmr);
        return binomialCoefficient;
    }



    public static void main(String[] args) {
        System.out.println(binomialCoefficient(5,2));

    }
}

