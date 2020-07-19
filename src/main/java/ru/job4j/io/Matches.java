package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        boolean player = true;
        int matches = 11;
        while (run) {
            System.out.println("На столе " + matches + " спичек!");
            if (player) {
                System.out.println("Игрок 1 возьмите от 1 до 3 спичек:");
                player = false;
            } else {
                System.out.println("Игрок 2 возьмите от 1 до 3 спичек:");
                player = true;
            }
            int select = Integer.valueOf(input.nextLine());
            matches -= select;
            if (matches <= 0) {
                run = false;
                if (player) {
                    System.out.println("Игрок 2 победил!");
                } else {
                    System.out.println("Игрок 1 победил!");
                }
            }
        }
    }
}