package com.company;

public class Circle {

    private static double PI = Math.PI;

    public static String area (double enterARadius) {
        return PI * Math.pow(enterARadius, 2) + " (см. в квадрате)";
    }

    public static String circumference (double enterARadius) {
        return PI * 2 * enterARadius + " cм";
    }
}
