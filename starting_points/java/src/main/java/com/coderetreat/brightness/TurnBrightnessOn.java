package com.coderetreat.brightness;

public class TurnBrightnessOn {
    private int[][] arr;

    public TurnBrightnessOn(int[][] arr) {
        this.arr = arr;
    }

    public int[][] increaseBrightness(int starti, int startj, int endi, int endj){
        for(int i=starti;i<=endi;i++){
            for(int j=startj;j<=endj;j++){
                arr[i][j] = arr[i][j] + 1;
            }
        }

        return arr;
    }
}
