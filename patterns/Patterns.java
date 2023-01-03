package com.Vaibhav.patterns;

import java.util.Scanner;

public class Patterns {
    public static void halloRectangle(int totalRows,int totalColums){
        // outer loop
        for (int i=1;i<=totalRows;i++){
        // inner loop
            for (int j=1;j<=totalColums;j++){
                if (i == 1 || i == totalRows || j == 1 || j == totalColums){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter of Rows : ");
        int totalRows = sc.nextInt();
        System.out.println("Enter of columss : ");
        int totalColums = sc.nextInt();
        halloRectangle(totalRows,totalColums);
    }
}
