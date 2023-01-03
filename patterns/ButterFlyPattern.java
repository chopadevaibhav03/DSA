package com.Vaibhav.patterns;

import java.util.Scanner;

public class ButterFlyPattern {
    public static void butterFly(int n){
        // first half  ..."
        for (int i=1;i<=n;i++){
            // Stars - i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Space = 2*(n - i);
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // stares - i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i=n;i>=1;i--){
            // Stars - i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Space = 2*(n - i);
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // stares - i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows you want :-> ");
        int n = sc.nextInt();
        butterFly(n);
    }
}
