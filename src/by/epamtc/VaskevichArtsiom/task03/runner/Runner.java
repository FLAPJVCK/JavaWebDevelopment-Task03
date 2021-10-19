package by.epamtc.VaskevichArtsiom.task03.runner;

import by.epamtc.VaskevichArtsiom.task03.task01.entity.Array;
import by.epamtc.VaskevichArtsiom.task03.task01.service.FillingArray;

public class Runner {
    public static void main(String[] args) {
        Array array1 = new Array(5, 6, 8, 3, 7, 2);
        Array array2 = FillingArray.fillFromConsole();
        Array array3 = FillingArray.generateRandomArray();

        System.out.println(array1);
        System.out.println(array2);
        System.out.println(array3);
    }
}
