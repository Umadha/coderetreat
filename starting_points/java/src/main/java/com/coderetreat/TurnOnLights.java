package com.coderetreat;

public class TurnOnLights {
    private int[][] arr;

    public TurnOnLights(int[][] arr) {
        this.arr = arr;
    }

    public int[][] turnOn(int starti, int startj, int endi, int endj){
        for(int i=starti;i<=endi;i++){
           for(int j=startj;j<=endj;j++){
                arr[i][j] = 1;
            }
        }

        return arr;
    }
}
