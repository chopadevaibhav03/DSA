package com.Vaibhav.SortingAlgorithym;

import java.util.Arrays;
import java.util.Collection; //package
import java.util.Collections;

public class InbuiltSort {
    public static void insertionSort(Integer[] arr){
        for (int i=1;i< arr.length;i++){
            int curr = arr[i];
            int prev = i-1;

            // Finding out the correct pos for sort..
            while (prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1]=curr;

        }

    }
    public static void printArray(Integer arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = {5,4,1,3,2};  // do not work on basic int it works on Integer object class...
        // inbuiltSort
        Arrays.sort(arr,0,4, Collections.reverseOrder());
        // descending order of array
        printArray(arr);

    }
}


