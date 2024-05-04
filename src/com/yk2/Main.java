package com.yk2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите три произвольные строки различной длины");
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[3];
        for (int i = 0; i < 3; i++) {
            lines[i] = scanner.nextLine();
        }
        Arrays.sort(lines);
        System.out.println(lines[1]);

        Comparator<String> lightComp = Comparator.comparingInt(String::length);

        Arrays.sort(lines, lightComp);

        System.out.println("Отсортированные строки по длине:");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}