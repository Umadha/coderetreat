package com.coderetreat.brightness;

public class TurnBrightnessOff {
    private int[][] arr;

    public TurnBrightnessOff(int[][] arr) {
        this.arr = arr;
    }

    public int[][] reduceBrightness(int starti, int startj, int endi, int endj){
        for(int i=starti;i<=endi;i++){
            for(int j=startj;j<=endj;j++){
                arr[i][j] = ((arr[i][j] - 1) < 0) ? 0 : (arr[i][j] - 1);
            }
        }

        return arr;
    }
}
