package com.company;

import java.util.Scanner;

public class Main {

    public static void main (String[] arg) {

        Scanner in = new Scanner(System.in);
        int hour ;
        String dayLesson;
        System.out.print("Enter day: ");
        dayLesson = in.nextLine();

        if (dayLesson.equals("Friday")||dayLesson.equals("Monday")) {
            System.out.print("Choice hour: ");
            hour = in.nextInt();

            if (hour >= 18 && hour <= 19) {
                System.out.print("Lessons is running. \n");
            }
            else {
                System.out.println("Lessons isn't running at " + hour + " o'clock");
            }
        }
        else {
            System.out.println("Lessons isn't running on " + dayLesson);
        }
    }
}
