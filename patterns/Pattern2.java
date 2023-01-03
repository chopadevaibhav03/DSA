package com.Vaibhav.patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void inverted_half_pyramid_with_Number(int n){
        for (int i=1;i<=n;i++){
            for (int j=1; j<=n-i+1;j++){

                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows you want :");
        int n = sc.nextInt();
        inverted_half_pyramid_with_Number(n);
    }
}
