package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int mas[] = new int[5];
        mas[0] = scanner.nextInt();
        mas[1] = scanner.nextInt();
        mas[2] = scanner.nextInt();
        mas[3] = scanner.nextInt();
        mas[4] = scanner.nextInt();
        int sum = 0;
        for (int i=0;i<mas.length;i++) {
            sum = sum + mas[i];
        }

        System.out.println("Сумма элементов массива равна: " + sum);

        int i = 0;

        System.out.println("Способ While");
        sum = 0;
        while (i < mas.length) {
            mas[i] = scanner.nextInt();
            sum += mas[i];
            i++;
        }

        System.out.println("Сумма элементов массива равна: " + sum);

        sum = 0;
        i = 0;
        System.out.println("Способ DO While");
        do {
            mas[i] = scanner.nextInt();
            sum += mas[i];
            i++;
        } while (i < mas.length);
        System.out.println("Сумма элементов массива равна: " + sum);
    }
}
