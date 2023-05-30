package quick_sort;

import java.util.Arrays;

/**
 * Реализация быстрой сортировки.
 * Сложность O(n * log(n))
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] ints = {1, 4, 19, 20, 3, 5, 7};
        System.out.println(Arrays.toString(ints));
        quickSort(ints, 0, ints.length - 1);
        System.out.println(Arrays.toString(ints));
    }

    private static void quickSort(int[] arr, int from, int to) {
        if (from < to) {
            int divideIndex = partition(arr, from, to);

            printSortStep(arr, from, to, divideIndex);

            quickSort(arr, from, divideIndex - 1);

            quickSort(arr, divideIndex, to);
        }
    }
    private static int partition(int[] arr, int from, int to) {
        int leftIndex = from;
        int rightIndex = to;

        int pivot = arr[from];

        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }

        return leftIndex;
    }

    private static void swap(int[] arr, int leftIndex, int rightIndex) {
        int tmp = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = tmp;
    }

    private static void printSortStep(int[] arr, int from, int to, int divideIndex) {
        for (int i = from; i <= to; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(" DivideIndex: " + divideIndex);
        System.out.println();
    }

}
