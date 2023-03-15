package com.coderetreat;

public class FindLitLights {
    private int[][] arr;

    public FindLitLights(int[][] arr) {
        this.arr = arr;
    }

    public void countLitLights(){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == 1)
                    count++;
            }
        }
        System.out.println("Number of Lights Lit: "+ count);
    }
}
