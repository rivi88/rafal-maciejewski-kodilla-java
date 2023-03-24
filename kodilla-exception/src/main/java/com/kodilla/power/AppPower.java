package com.kodilla.power;

import java.util.Scanner;


public class AppPower {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int base, exponent;


        System.out.println("Give base:");
        base = scanner.nextInt();
        System.out.println("Give exponent:");
        exponent = scanner.nextInt();

        Power power = new Power();
        power.power(base, exponent);

    }
}
