package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Введите выражение:");
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        Calculate calcApp = new Calculate(expression);
        int[] result = calcApp.calculate();
        if (result[1] == 1) {
            Convert conv = new Convert();
            System.out.println("Результат: " + conv.convert(result[0]));
        } else {
            System.out.println("Результат: " + result[0]);
        }
    }

}
