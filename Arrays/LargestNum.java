package com.Vaibhav.Arrays;

public class LargestNum {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0;i<numbers.length;i++){
            // this is largest value.
            if (largest < numbers[i]){
                largest = numbers[i];
            }
            // this is for smallest value.
            if (smallest > numbers[i]){
                smallest = numbers[i];
            }

        }
        System.out.println("smallest value is: " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int[] numbers = {2,3,4,1,7,9,0};
        System.out.println("Largest value is: " + getLargest(numbers));

    }
}
