import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        System.out.print("Введите минимальное значение: ");
        int min = scanner.nextInt();
        System.out.print("Введите максимальное значение: ");
        int max = scanner.nextInt();

        int[] array = madeArray.generateRandomArray(size, min, max);

        System.out.println("Исходный массив: " + Arrays.toString(array));

        Sort.heapSort(array);

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }


}

