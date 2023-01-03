package com.Vaibhav.Arrays;

public class WaterTrapped {
    public static int trappedWater(int height[]) {
        int n = height.length;
        // Calculate left boundary - array.
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i=0;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        // calculate right boundary - array.
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i=0;i<n;i--){
            rightMax[i] = Math.max(height[i],leftMax[i+1]);
        }

        int trappedWater = 0;
        // loop
        for (int i=0;i<n;i--){
            // Water level = min(leftMax.RightMax)
            int waterlevel = Math.max(leftMax[i],rightMax[i]);
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        trappedWater(height);
    }
}
