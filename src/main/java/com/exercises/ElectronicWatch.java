package com.exercises;

import java.time.LocalTime;
import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int clockSeconds = seconds - (seconds / 60) * 60;
        int clockHours = (seconds / 60) / 60;
        int clockMinutes = (seconds / 60) - clockHours * 60;
        clockHours = clockHours - (clockHours / 24) * 24;

        String result = LocalTime.of(clockHours, clockMinutes, clockSeconds).toString();
        if (clockSeconds == 0) {
            result = result + ":00";
        }
        if (clockHours < 10) {
            result = result.substring(1);
        }
        System.out.println(result);
    }
}
