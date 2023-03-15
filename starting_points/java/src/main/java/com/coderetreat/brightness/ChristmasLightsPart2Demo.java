package com.coderetreat.brightness;

import com.coderetreat.*;

public class ChristmasLightsPart2Demo {
    public static void main(String[] args) {
        int[][] arr = new int[1000][1000];

        arr = new TurnBrightnessOn(arr).increaseBrightness(887,9, 959,629);
        arr = new TurnBrightnessOn(arr).increaseBrightness(454,398, 844,448);
        arr = new TurnBrightnessOff(arr).reduceBrightness(539,243, 559,965);
        arr = new TurnBrightnessOff(arr).reduceBrightness(370,819, 676,868);
        arr = new TurnBrightnessOff(arr).reduceBrightness(145,40, 370,997);
        arr = new TurnBrightnessOff(arr).reduceBrightness(301,3, 808,453);
        arr = new TurnBrightnessOn(arr).increaseBrightness(351,678, 951,908);
        arr = new ToggleBrightness(arr).toggleBrightness(720,196, 897,994);
        arr = new ToggleBrightness(arr).toggleBrightness(831,394, 904,860);

        new CountBrightnessLevel(arr).countTotalBrightness();
    }
}