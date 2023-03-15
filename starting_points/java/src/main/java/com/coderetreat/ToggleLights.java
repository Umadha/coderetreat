package com.coderetreat;

public class ToggleLights {
    private int[][] arr;

    public ToggleLights(int[][] arr) {
        this.arr = arr;
    }

    public int[][] toggle(int starti, int startj, int endi, int endj){
        for(int i=starti;i<=endi;i++){
            for(int j=startj;j<=endj;j++){
                arr[i][j] = (arr[i][j] == 0) ? 1 : 0;
            }
        }

        return arr;
    }
}
