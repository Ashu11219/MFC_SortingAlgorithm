import java.util.Random;
//Ashish Mishra - 24BME0471

public class SortingComparison {
    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }


    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(10000); // Random numbers between 0 and 9999
        }
        return arr;
    }


    public static int[] copyArray(int[] arr) {
        int[] copy = new int[arr.length];
        System.arraycopy(arr, 0, copy, 0, arr.length);
        return copy;
    }


    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000}; // Array sizes to test
        for (int size : sizes) {
            System.out.println("Array size: " + size);

            int[] arr = generateRandomArray(size);

            // Bubble Sort
            int[] arrBubble = copyArray(arr);
            long startTime = System.nanoTime();
            bubbleSort(arrBubble);
            long endTime = System.nanoTime();
            System.out.println("Bubble Sort Time: " + (endTime - startTime) / 1_000_000 + " ms");

            // Selection Sort
            int[] arrSelection = copyArray(arr);
            startTime = System.nanoTime();
            selectionSort(arrSelection);
            endTime = System.nanoTime();
            System.out.println("Selection Sort Time: " + (endTime - startTime) / 1_000_000 + " ms");

            // Insertion Sort
            int[] arrInsertion = copyArray(arr);
            startTime = System.nanoTime();
            insertionSort(arrInsertion);
            endTime = System.nanoTime();
            System.out.println("Insertion Sort Time: " + (endTime - startTime) / 1_000_000 + " ms");

            System.out.println();
        }
    }
}
