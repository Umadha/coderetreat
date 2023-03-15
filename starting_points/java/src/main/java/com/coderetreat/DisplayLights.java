package com.coderetreat;

public class DisplayLights {
    private int[][] arr;

    public DisplayLights(int[][] arr) {
        this.arr = arr;
    }

    public void display(){
       for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
