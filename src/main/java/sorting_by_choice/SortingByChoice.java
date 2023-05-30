package sorting_by_choice;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Сортировка выбором.
 * Выполняется за O(n * n) or O(n^2)
 */
public class SortingByChoice {
    public static void main(String[] args) {
        //int[] array = {5, 3, 6, 2, 10};

        Double[] array = {5.2, 5.1, 6.4, 2.2, 1.1, 1.0};
        System.out.print(Arrays.toString(array));
        System.out.println();
        sort(array);
        System.out.print(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
    }

    public static  <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = i;
            T smallest = array[i];

            for (int j = i + 1; j < array.length; j++) {
                int result = array[j].compareTo(smallest);
                if (result < 0) {
                    smallestIndex = j;
                    smallest = array[j];
                }
            }
            array[smallestIndex] = array[i];
            array[i] = smallest;
        }
    }

}
