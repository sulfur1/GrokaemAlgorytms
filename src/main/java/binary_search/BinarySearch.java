package binary_search;

import java.util.*;

/**
 * Реализация на Java бинарного поиска стр.28 "Грокаем алгоритмы"
 * Пример выполнен для Integer для ознакомления, так как в утилитном классе {@link Arrays} присутствует бинарный поиск для различных типов.
 * Бинарный поиск выполняется за O(log n)
 */

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(7, 2, 1, 3, 0, 4, 8, 3);
        /*Random random = new Random();
        for (int i = 0; i < 8; i++) {
            integers.add(random.nextInt(10));
        }*/

        integers.forEach(System.out::print);
        System.out.println();
        Collections.sort(integers);

        integers.forEach(System.out::print);

        System.out.println();
        System.out.println(binarySearch(8, integers));

    }


    static <T extends Comparable<T>> int binarySearch(T item, List<T> list) {
        int countOperation = 0;
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Comparable<T> integer = list.get(mid);

            int resultCompare = integer.compareTo(item);
            if (resultCompare > 0) {
                countOperation++;
                high = mid - 1;
            } else if (resultCompare < 0) {
                countOperation++;
                low = mid + 1;
            } else {
                System.out.println("Количество проверок чисел для нахождения искомого элемента: " + countOperation);
                return mid;
            }
        }
        return -1;
    }


}
