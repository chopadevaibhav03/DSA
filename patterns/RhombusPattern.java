package com.Vaibhav.patterns;

import java.util.Scanner;

public class RhombusPattern {
    public static void solid_Rhombus(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows you want :-> ");
        int n = sc.nextInt();
        solid_Rhombus(n);
    }
}
