package com.Vaibhav.Arrays;



public class SubarraySum {
    public static void maxSubaarySum(int numbers[]) {
        int MaxSum = Integer.MIN_VALUE;
        int CurrSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                CurrSum = 0;

                for (int k = start; k <= end; k++) {
                    CurrSum += numbers[k];
                }
                System.out.println(CurrSum);
                if (MaxSum < CurrSum) {
                    MaxSum = CurrSum;
                }
            }
        }
        System.out.println("Max Sum = " + MaxSum);
    }

    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxSubaarySum(numbers);
       }
    }