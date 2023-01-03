package com.Vaibhav.Arrays;

import java.util.Scanner;

public class BinarySearch {
    public static int binary_search(int numbers[],int key){
        int start = 0,end = numbers.length-1;
        while (start <= end){
            int mid = (start+end)/2;

            if (numbers[mid] == key ){
                return mid;
            }
            if (numbers[mid] < key){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the for search : ");
        int key = sc.nextInt();
        System.out.println("index for key is :-> " + binary_search(numbers,key));
    }
}
