/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */


package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = scan.nextInt();

        String drivingcheck = (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.print(""+drivingcheck+"");
    }
}
