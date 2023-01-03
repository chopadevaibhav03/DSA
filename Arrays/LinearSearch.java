package com.Vaibhav.Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static int linear_Search(int numbers[],int key){
        for (int i=0;i<numbers.length;i++){
            if (numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int index = linear_Search(numbers,key);
        if (index == -1){
            System.out.println("Not Found :");
        }else {
            System.out.println("key is at index : "+ index);

        }
    }
}
