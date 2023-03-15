package com.coderetreat.brightness;

public class ToggleBrightness {
    private int[][] arr;

    public ToggleBrightness(int[][] arr) {
        this.arr = arr;
    }

    public int[][] toggleBrightness(int starti, int startj, int endi, int endj){
        for(int i=starti;i<=endi;i++){
            for(int j=startj;j<=endj;j++){
                arr[i][j] = arr[i][j] + 2;
            }
        }

        return arr;
    }
}
