package com.vinaypinjani;

public class Main {

    public static void main(String[] args) {
        // the following are not leap years
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2200));
        System.out.println(isLeapYear(2300));
        System.out.println(isLeapYear(2500));
        System.out.println(isLeapYear(2600));

        // the following are leap years
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2400));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }

            }
        }
        return false;
    }
}
