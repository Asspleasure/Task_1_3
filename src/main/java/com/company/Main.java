package com.company;
import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main (String[] arg) {

        Scanner in = new Scanner(System.in);
        String str1 = "day"; String str; int tw ;
        System.out.print("Enter " + str1 +": ");
        str = in.nextLine();

        if (str.equals("Friday")||str.equals("Monday")) {
            System.out.print("Choice hour; ");
            tw = in.nextInt();

            if (tw >=18 && tw<=19)
                System.out.print("Lessons is running. \n");

            else  {
                System.out.println("Lessons isn't running at " + tw + " o'clock");
            }
}


        else {
            System.out.println("Lessons isn't running on " + str);
        }


    }
}
