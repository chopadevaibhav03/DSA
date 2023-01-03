package com.Vaibhav.FunctionMethod;

import static com.Vaibhav.FunctionMethod.PrimeOrNot.isPrime;

public class InRange {
    public static void primeInRange(int n){
        for (int i=2;i<=n;i++){
            if (isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primeInRange(100);
    }
}
