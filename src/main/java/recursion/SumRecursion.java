package recursion;

/**
 * Вычисление суммы элементов массива с помощью рекурсии.
 */
public class SumRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumRecursion(arr, 0));
    }

    private static int sumRecursion(int[] arr, int i) {
        if (i == arr.length - 1) return arr[i];
        else return arr[i] + sumRecursion(arr, i + 1);
    }
}
