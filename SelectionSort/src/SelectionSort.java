import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SelectionSort {
    private static final int ARR_SIZE = 100000;

    void sort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            int min_idx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();

        int[] arr = new int[ARR_SIZE];
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("rand_nums.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int i = 0;
        while (scanner.hasNextInt()) {
            arr[i++] = scanner.nextInt();
        }
        scanner.close();

        ob.sort(arr);
        ob.printArray(arr);
    }
}