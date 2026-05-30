/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Hype
 */
import java.util.Arrays;

public class UrutanNamaNamaMahasiswa {
    
    // Bubble Sort
    public static void bubbleSort(String[] data) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (data[j].compareToIgnoreCase(data[j + 1]) > 0) {

                    // Tukar posisi
                    String temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(String[] data) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (data[j].compareToIgnoreCase(data[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            // Tukar data
            String temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(String[] data) {
        int n = data.length;

        for (int i = 1; i < n; i++) {

            String key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].compareToIgnoreCase(key) > 0) {
                data[j + 1] = data[j];
                j--;
            }

            data[j + 1] = key;
        }
    }

    // Main Program
    public static void main(String[] args) {

        String[] nama = {
            "Tamim",
            "Dwi",
            "Shinta",
            "zila",
            "Fahri"
        };

        // Bubble Sort
        String[] bubble = nama.clone();
        bubbleSort(bubble);

        // Selection Sort
        String[] selection = nama.clone();
        selectionSort(selection);

        // Insertion Sort
        String[] insertion = nama.clone();
        insertionSort(insertion);

        // Output
        System.out.println("Data Asli:");
        System.out.println(Arrays.toString(nama));

        System.out.println("\nHasil Bubble Sort:");
        System.out.println(Arrays.toString(bubble));

        System.out.println("\nHasil Selection Sort:");
        System.out.println(Arrays.toString(selection));

        System.out.println("\nHasil Insertion Sort:");
        System.out.println(Arrays.toString(insertion));
    }
}