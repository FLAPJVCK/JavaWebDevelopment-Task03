package by.epamtc.VaskevichArtsiom.task03.task01.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    private int[] value;

    public Array() {
    }

    public Array(int... value) {
        this.value = value;
    }

    public int[] getValue() {
        return value;
    }

    public void setValue() {
        this.value = value;
    }

    public static int[] bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        return array;
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }

        return array;
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;
    }

    public static int binarySearch(int[] array, int element) {
        int[] sortedArray = insertionSort(array);
        int index = -1;
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < element) {
                low = mid + 1;
            } else if (sortedArray[mid] > element) {
                high = mid - 1;
            } else if (sortedArray[mid] == element) {
                index = mid;
                break;
            }
        }

        return index;
    }

    public static int maxArrayElement(int[] array) {
        int[] sortedArray = insertionSort(array);
        return sortedArray[sortedArray.length - 1];
    }

    public static int minArrayElement(int[] array) {
        int[] sortedArray = insertionSort(array);
        return sortedArray[0];
    }

    public static boolean isPrimeNumber(int number) {
        boolean result = true;

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                result = false;
            }
        }

        return result;
    }

    public static int[] calculatePrimeNumbers(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int number : array) {
            if (isPrimeNumber(number)) {
                result.add(number);
            }
        }

        return convertArrayListToArray(result);
    }

    public static int[] convertArrayListToArray(ArrayList<Integer> arrayList) {
        int[] array = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }

        return array;
    }

    public static boolean isFibonacciNumber(int number) {
        return (Math.sqrt(5 * Math.pow(number, 2) + 4)) % 1 == 0 || (Math.sqrt(5 * Math.pow(number, 2) - 4)) % 1 == 0;
    }

    public static int[] findFibonacciNumbers(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int number : array) {
            if (isFibonacciNumber(number)) {
                result.add(number);
            }
        }

        return convertArrayListToArray(result);
    }

    public static boolean isUniqueInNumber(int number, int numberOfDigits) {
        boolean result = true;
        String strNumber = Integer.toString(number);
        char[] charNumber = strNumber.toCharArray();

        if (strNumber.length() != numberOfDigits) {
            result = false;
        } else {
            for (int i = 0; i < charNumber.length; i++) {
                char curr = charNumber[i];
                for (int j = i + 1; j < charNumber.length; j++) {
                    if (curr == charNumber[j]) {
                        result = false;
                    }
                }
            }
        }

        return result;
    }

    public static int[] findUniqueThreeDigitNumbers(int[] array, int numberOfDigits) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int number : array) {
            if (isUniqueInNumber(number, numberOfDigits)) {
                result.add(number);
            }
        }

        return convertArrayListToArray(result);
    }

    @Override
    public String toString() {
        return "Array{" + " value = " + Arrays.toString(value) + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        return Arrays.equals(value, array.value);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(value);
    }
}
