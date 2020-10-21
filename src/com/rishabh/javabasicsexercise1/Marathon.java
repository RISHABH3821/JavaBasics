package com.rishabh.javabasicsexercise1;

public class Marathon {

    public void printAllTimes(int[] times) {
        System.out.println("All times:");
        for (int time : times) {
            System.out.format("%d, ", time);
        }
        System.out.println();
    }


    public void printBestAndSecondBestTime(int[] times) {
        int bestTime = Integer.MAX_VALUE;
        int secondBestTime = Integer.MAX_VALUE;
        for (int time : times) {
            if (bestTime > time) {
                secondBestTime = bestTime;
                bestTime = time;
            } else if (secondBestTime > time) {
                secondBestTime = time;
            }
        }
        System.out.println("Best Time: " + bestTime);
        System.out.println("Second best Time: " + secondBestTime);
    }


    public static void main(String[] args) {
        int[] times = {120, 200, 110, 399, 111, 222, 118, 119, 133, 144};
        Marathon marathon = new Marathon();
        marathon.printAllTimes(times);
        marathon.printBestAndSecondBestTime(times);
    }


}
