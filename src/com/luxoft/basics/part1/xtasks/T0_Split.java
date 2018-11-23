package com.luxoft.basics.part1.xtasks;

public class T0_Split {
    public static void main(String[] args) {
        double randomNumber = 343.36;
        double randomNumber2 = 3.069;
        double randomNumber3 = .2;

        String str = "" + randomNumber;

        int dotIndex = str.indexOf(".");

        System.out.println("whole: " + str.substring(0, dotIndex) + "," + " fract: " + str.substring(4));
    }
}
