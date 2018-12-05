package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Main LabFourth = new Main();

        LabFourth.task1();
        LabFourth.task2();
        LabFourth.task3();
        LabFourth.task4();
        LabFourth.Stroki();
        LabFourth.task6();
        LabFourth.Tablica();
    }

    void task1() {
        System.out.println("\nПеремещение максимального и минимального элемента");
        int l = 25;
        int arr[] = new int[l];
        Random r = new Random();

        int indexMin = 0;
        int indexMax = 0;

        System.out.println("Начальный массив: ");
        for (int i = 0; i < l; ++i) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "\t");
            if (arr[i] > arr[indexMax])
                indexMax = i;
            else if (arr[indexMin] > arr[i])
                indexMin = i;
        }


        int tmp = arr[indexMax];
        arr[indexMax] = arr[indexMin];
        arr[indexMin] = tmp;
        System.out.println("\nМассив после замены: ");
        for (int i = 0; i < l; ++i) {
            System.out.print(arr[i] + "\t");
        }
    }

    void task2() {
        System.out.println("\n\n Упорядочивание массива по возростанию");
        int n = 25;
        int arr[] = new int[n];
        Random r = new Random();
        System.out.println("Начальный массив: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nОтсортированный массив: ");
        for (int i = 0; i < n ; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print(arr[i] + "\t");
        }
    }

    void task3() {
        System.out.println("\n\nНахождение среднего значения");
        int sredn = 0;
        int n = 20;
        int arr[] = new int[n];
        Random r = new Random();
        System.out.println("Начальный массив: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "\t");
            sredn += arr[i];
        }
        sredn /= n;
        System.out.println("\nСреднее значение массива: " + sredn);
    }

    void task4() {
        System.out.println("\nСумма чётных нечётных элементов");
        int n = 30;
        int sumChet = 0;
        int sumNechet = 0;
        int arr[] = new int[n];
        Random r = new Random();
        System.out.println("Начальный массив: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "\t");
            if (arr[i] % 2 == 0) {
                sumChet += arr[i];
            } else {
                sumNechet += arr[i];
            }
        }
        System.out.println("\nСумма чётных: " + sumChet);
        System.out.println("Сумма нечётных: " + sumNechet);
    }

    void Tablica() {
        System.out.println("\nТаблица 3х5");
        int arr[][] = new int[3][5];
        Random r = new Random();
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 5; ++j) {
                arr[i][j] = r.nextInt(100);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void task6() {
        System.out.println("\n\nНахождение максимального элемента");
        int n = 25;
        int arr[] = new int[n];
        Random r = new Random();
        int indexMax = 0;
        System.out.println("Начальный массив: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "\t");
            if (arr[i] > arr[indexMax])
                indexMax = i;
        }
        System.out.println("\nМакс элемент массива: " + arr[indexMax]);
    }

    void Stroki() {
        System.out.println("\nСложение строк");
        String  s1 = "Hello",
                s2 = ", Howdy ho!",
                s3 = ", What's up?",
                s4 = "Hi",
                s5 = "Greetings";
        if (s4.equals(s5)) {
            System.out.print(s1 + s2);
        }else {
            System.out.print(s1 + s3);
        }
    }
}
