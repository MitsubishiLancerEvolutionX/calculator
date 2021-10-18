package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите выражение:");
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        Calculate calcApp = new Calculate(expression);
        int[] result = calcApp.calculate();
        if (result[1] == 1) {
            Convert conv = new Convert(result[0]);
            System.out.println("Результат: " + conv.convert(result[0]));
        } else {
            System.out.println("Результат: " + result[0]);
        }
    }

}
