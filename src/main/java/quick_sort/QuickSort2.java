package quick_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort2 {
    private static final Random random = new Random();
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            integers.add(random.nextInt(0, 100));
        }
        integers.forEach(integer -> System.out.print(integer + " "));
        System.out.println();
        quickSort(integers, 0, integers.size() - 1);
        integers.forEach(integer -> System.out.print(integer + " "));
    }

    private static void quickSort(List<Integer> list, int from, int to) {
        /*if (integers.size() < 2) {
            return integers;
        } else {
            int pivot = random.nextInt(from, to);
            *//*integers.forEach(integer -> System.out.print(integer + " "));
            System.out.println();*//*
            List<Integer> leftIntegers = partitionLeft(integers, pivot);
            List<Integer> rightIntegers = partitionRight(integers, pivot);


            return Stream.concat(quickSort(leftIntegers, from, leftIntegers.size()).stream(), quickSort(rightIntegers, from, rightIntegers.size()).stream()).toList();
        }*/
        if (from < to) {
            int pivot = from;
            int left = from + 1;
            int right = to;
            int pivotValue = list.get(pivot);
            while (left <= right) {
                // left <= to -> limit protection
                while (left <= to && pivotValue >= list.get(left)) {
                    left++;
                }
                // right > from -> limit protection
                while (right > from && pivotValue < list.get(right)) {
                    right--;
                }
                if (left < right) {
                    Collections.swap(list, left, right);
                }
            }
            Collections.swap(list, pivot, left - 1);
            quickSort(list, from, right - 1);
            quickSort(list, right + 1, to);
        }
    }

    private static List<Integer> partitionLeft(List<Integer> integers, int pivot) {
        List<Integer> result = new ArrayList<>();

        integers.forEach(integer -> {
            if (integer < integers.get(pivot)) result.add(integer);
        });
        result.add(integers.get(pivot));
        return result;
    }
    private static List<Integer> partitionRight(List<Integer> integers, int pivot) {
        List<Integer> result = new ArrayList<>();

        integers.forEach(integer -> {
            if (integer > integers.get(pivot)) result.add(integer);
        });
        return result;
    }

    /*private static void partition(List<Integer> integers, int pivot) {
        int left = 0;
        int right = integers.size() - 1;

        while (left < pivot && right > pivot) {
            while (integers.get(left) < integers.get(pivot)) {
                left++;
            }
            while (integers.get(right) > integers.get(pivot)) {
                right--;
            }
            Collections.
            if (left <= right) {

            }
        }
    }*/
}
