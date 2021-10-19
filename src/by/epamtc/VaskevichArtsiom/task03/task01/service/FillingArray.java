package by.epamtc.VaskevichArtsiom.task03.task01.service;

import by.epamtc.VaskevichArtsiom.task03.task01.entity.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class FillingArray {
    public static int scanIntNumber() {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        }

        return number;
    }

    public static int[] inputArray(int length) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanIntNumber();
        }

        return array;
    }

    public static Array fillFromConsole() {
        ArrayList<Integer> tmp = new ArrayList<>();

        int length = scanIntNumber();
        return new Array(inputArray(length));
    }

    public static Array generateRandomArray() {
        int length = scanIntNumber();
        int minValue = scanIntNumber();
        int maxValue = scanIntNumber();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = generateNumber(minValue, maxValue);
        }

        return new Array(array);
    }

    public static int generateNumber(int minValue, int maxValue) {
        return (int) (minValue + Math.random() * (maxValue - minValue));
    }
}
