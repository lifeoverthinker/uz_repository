package lab4_p;
import java.util.Random;

public class zad4 {
    public static void main(String[] args) {
        Random r = new Random();

        // Tworzenie tablic
        int[] tab1 = new int[30];
        int[] tab2 = new int[30];

        // Wypełnianie tablicy tab1 losowymi liczbami
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = r.nextInt(51) + 99;  // Liczby z zakresu 99-149
        }

        // Kopiowanie tablicy tab1 do tab2
        System.arraycopy(tab1, 0, tab2, 0, tab1.length);

        // Tworzenie kopii do sortowania
        int[] bubbleArray = tab1.clone();
        int[] quickArray = tab1.clone();

        // Sortowanie bąbelkowe (2 przebiegi)
        bubbleSortPartial(bubbleArray, 2);
        System.out.println("Tablica po 2 przebiegach sortowania bąbelkowego:");
        printArray(bubbleArray);

        System.out.println();

        // Sortowanie szybkie (2 przebiegi)
        quickSortPartial(quickArray, 0, quickArray.length - 1, 2);
        System.out.println("Tablica po 2 przebiegach sortowania szybkiego:");
        printArray(quickArray);
    }

    // Metoda sortowania bąbelkowego z ograniczeniem do określonej liczby przebiegów
    public static void bubbleSortPartial(int[] arr, int maxPasses) {
        int n = arr.length;
        for (int i = 0; i < maxPasses; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Zamiana elementów
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Jeśli nie było zamian, zakończ sortowanie
        }
    }

    // Metoda sortowania szybkiego z ograniczeniem do określonej liczby przebiegów
    public static void quickSortPartial(int[] arr, int low, int high, int maxDepth) {
        if (low < high && maxDepth > 0) {
            int pi = partition(arr, low, high);
            quickSortPartial(arr, low, pi - 1, maxDepth - 1);
            quickSortPartial(arr, pi + 1, high, maxDepth - 1);
        }
    }

    // Metoda partycjonowania dla sortowania szybkiego
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Zamiana elementów
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Ostateczna zamiana elementów
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Pomocnicza metoda do wypisywania tablicy
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
