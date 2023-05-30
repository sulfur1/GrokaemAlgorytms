package recursion;

/**
 * Обратный отсчет.
 * Пример самой простой рекурсии, иллюстрирующий важное условия правильного использования рекурсии - это условие выхода из рекурсии.
 */
public class SampleRecursion {
    public static void main(String[] args) {
        recursion(5);
    }

    private static void recursion(int i) {
        System.out.println(i);
        if (i == 0) return; // Базовый случай рекурсии
        recursion(i - 1); // Рекурсивный случай
    }
}
