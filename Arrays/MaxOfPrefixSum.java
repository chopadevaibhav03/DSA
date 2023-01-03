package com.Vaibhav.Arrays;

public class MaxOfPrefixSum {
    public static void prefixSum(int numbers[])  {
        int CurrSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int[] prefix = new int [numbers.length];

        prefix[0]=numbers[0];
        for (int i=0;i<numbers.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for (int i=0;i<numbers.length;i++){
            int start = i;
            for (int j=i;j<numbers.length;j++){
                int end = j;

                CurrSum = i == 0 ? prefix[end]:prefix[j] - prefix[start -1];

                if (MaxSum < CurrSum){
                    MaxSum = CurrSum;
                }
            }
        }
        System.out.println("Max Sum = " + MaxSum);

    }
    public static void main(String[] args) {
        int numbers[] ={1,-2,6,-1,3};
        prefixSum(numbers);
    }
}
