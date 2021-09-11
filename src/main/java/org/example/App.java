/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */


package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        System.out.print("What is your age? ");
        Scanner age = new Scanner(System.in);
        int age1 = age.nextInt();

        String drivingcheck = (age1 >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.print(""+drivingcheck+"");
    }
}
