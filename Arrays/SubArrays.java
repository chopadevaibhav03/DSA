package com.Vaibhav.Arrays;

public class SubArrays {
    public static void printSubarrays(int numbers[]){
        int ts=0;
        for (int i=0;i<numbers.length;i++){
            int start=i;  //start
            for (int j=i;j<numbers.length;j++){
                int end=j;// end
                for (int k=start;k<=end;k++){ // print
                    System.out.print(numbers[k]+" "); // subarrays.
                }
                ts++;
                System.out.println();
            }
//            System.out.println("sub array is printed :");
            System.out.println();
        }
        System.out.println("Total SubArrays := "+ ts);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printSubarrays(numbers);
    }
}
