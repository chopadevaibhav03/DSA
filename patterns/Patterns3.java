package com.Vaibhav.patterns;

import java.util.Scanner;

public class Patterns3 {
    public static void floyd_triangle(int n){
        int counter = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows you want :-> ");
        int n = sc.nextInt();
        floyd_triangle(n);
    }
}
