package com.coderetreat;

public class TurnOffLights {
    private int[][] arr;

    public TurnOffLights(int[][] arr) {
        this.arr = arr;
    }

    public int[][] turnOff(int starti, int startj, int endi, int endj){
        for(int i=starti;i<=endi;i++){
            for(int j=startj;j<=endj;j++){
                arr[i][j] = 0;
            }
        }

        return arr;
    }
}