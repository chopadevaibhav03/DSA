package com.Vaibhav.Arrays;

public class PairsOfAnArray {
      public static void pairsArray(int n[]){
          int totalPairs = 0;
          for (int i=0;i<n.length;i++){
              int current = n[i];// 2,4,6,8,10;
              for (int j=i+1;j<n.length;j++){
                  System.out.print("("+ current +","+ n[j] +") ");
                  totalPairs++;
              }
              System.out.println();
          }
          System.out.println("Total number of pairs :-> "+ totalPairs);
      }

    public static void main(String[] args) {
          int n[] = {2,4,6,8,10};
          pairsArray(n);

    }
}
