package by.epamtc.VaskevichArtsiom.task03.task02.service;

public class JaggedArraySorterImpl implements JaggedArraySorter {
    @Override
    public void bubbleSort(int[][] array) {
        boolean sorted = false;
        int temp;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; i < array[i].length - 1; j++) {
                    for (int k = 0; i < array.length - 1; k++) {
                        if (array[i][k] > array[i][k + 1]) {
                            temp = array[i][k];
                            array[i][k] = array[i][k + 1];
                            array[i][k + 1] = temp;
                            sorted = false;
                        }
                    }
                }
            }
        }
    }

    @Override
    public int countElementsSum(int[] arrayString) {
        int sum = 0;

        for (int number : arrayString) {
            sum += number;
        }

        return sum;
    }

    @Override
    public int countMaxElementRow(int[] arrayString) {
        int maxValue = arrayString[0];

        for (int value : arrayString) {
            if (maxValue < value) {
                maxValue = value;
            }
        }

        return maxValue;
    }

    @Override
    public int countMinElementRow(int[] arrayString) {
        int minValue = arrayString[0];

        for (int value : arrayString) {
            if (minValue > value) {
                minValue = value;
            }
        }

        return minValue;
    }
}
