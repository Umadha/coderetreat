package com.coderetreat;

public class ChristmasLightsDemo {
    public static void main(String[] args) {
        int[][] arr = new int[1000][1000];

        arr = new TurnOnLights(arr).turnOn(887,9, 959,629);
        arr = new TurnOnLights(arr).turnOn(454,398, 844,448);
        arr = new TurnOffLights(arr).turnOff(539,243, 559,965);
        arr = new TurnOffLights(arr).turnOff(370,819, 676,868);
        arr = new TurnOffLights(arr).turnOff(145,40, 370,997);
        arr = new TurnOffLights(arr).turnOff(301,3, 808,453);
        arr = new TurnOnLights(arr).turnOn(351,678, 951,908);
        arr = new ToggleLights(arr).toggle(720,196, 897,994);
        arr = new ToggleLights(arr).toggle(831,394, 904,860);

        new DisplayLights(arr).display();

        new FindLitLights(arr).countLitLights();
    }
}