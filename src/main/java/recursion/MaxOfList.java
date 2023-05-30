package recursion;

/**
 * Найти наибольшее число в списке
 */
public class MaxOfList {
    public static void main(String[] args) {
        int[] ints = {1, 2, 10, 4, 5, 6};
        int max = getMax(ints,0, Integer.MIN_VALUE);
        System.out.println(max);
    }

    private static int getMax(int[] ints, int index, int max) {
        if (index >= ints.length) {
            return max;
        } else {
            int m = Math.max(ints[index], max);

            return getMax(ints, ++index, m);
        }
    }
}
