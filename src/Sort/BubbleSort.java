package Sort;

import java.util.Arrays;

public class BubbleSort {

    private void bubbleSort(Integer[] dataArray) {

        int temp;

        for (int i = 0; i < dataArray.length; i++) {

            for (int j = 1; j < dataArray.length - i; j++) {

                if (dataArray[j - 1] > dataArray[j]) {

                    temp = dataArray[j - 1];
                    dataArray[j - 1] = dataArray[j];
                    dataArray[j] = temp;

                }
            }
        }
    }

    private void bubbleSortSimple(Integer[] dataArray) {
        Arrays.sort(dataArray);
    }

    public static void main(String[] args) {

        Integer[] dataArray = {20, 10, 1, 3, 4, 2};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSortSimple(dataArray);

        for (int item : dataArray) {
            System.out.println(item);
        }

    }
}
