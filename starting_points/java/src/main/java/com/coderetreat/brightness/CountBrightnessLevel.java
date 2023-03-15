package com.coderetreat.brightness;

public class CountBrightnessLevel {
    private int[][] arr;

    public CountBrightnessLevel(int[][] arr) {
        this.arr = arr;
    }

    public void countTotalBrightness(){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                count += arr[i][j];
            }
        }
        System.out.println("Total Brightness Level: "+ count);
    }
}
