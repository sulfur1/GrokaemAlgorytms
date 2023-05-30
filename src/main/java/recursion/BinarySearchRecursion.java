package recursion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchRecursion {
        public static void main(String[] args) {
            List<Integer> integers = Arrays.asList(7, 2, 1, 3, 0, 4, 8, 3);

            integers.forEach(System.out::print);
            System.out.println();
            Collections.sort(integers);

            integers.forEach(System.out::print);

            System.out.println();
            System.out.println(binarySearch(8, integers, 0, integers.size() - 1));

        }


        static <T extends Comparable<T>> int binarySearch(T item, List<T> list, int low, int high) {
            if (low >= high) {
                return (list.get(low).compareTo(item)) == 0 ? low : -1;
            }

            int mid = low + (high - low) / 2;
            Comparable<T> integer = list.get(mid);

            int resultCompare = integer.compareTo(item);

            if (resultCompare > 0) {
                return binarySearch(item, list, low, mid - 1);
            } else if (resultCompare < 0) {
                return binarySearch(item, list, mid + 1, high);
            } else {
                return mid;
            }


        }

}
