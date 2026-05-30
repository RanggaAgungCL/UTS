/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Hype
 */
import java.util.Scanner;

public class SortingHargaProdukToko {

    // Method Bubble Sort
    public static void bubbleSort(int[] harga, String[] namaBarang) {

        int n = harga.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Urut dari murah ke mahal
                if (harga[j] > harga[j + 1]) {

                    // Tukar harga
                    int tempHarga = harga[j];
                    harga[j] = harga[j + 1];
                    harga[j + 1] = tempHarga;

                    // Tukar nama barang
                    String tempNama = namaBarang[j];
                    namaBarang[j] = namaBarang[j + 1];
                    namaBarang[j + 1] = tempNama;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input jumlah barang
        System.out.print("Masukkan jumlah barang: ");
        int jumlah = input.nextInt();
        input.nextLine();

        // Array nama barang dan harga barang
        String[] namaBarang = new String[jumlah];
        int[] hargaBarang = new int[jumlah];

        // Input data barang
        for (int i = 0; i < jumlah; i++) {

            System.out.println("\nData Barang ke-" + (i + 1));

            System.out.print("Nama Barang : ");
            namaBarang[i] = input.nextLine();

            System.out.print("Harga Barang: ");
            hargaBarang[i] = input.nextInt();
            input.nextLine();
        }

        // Tampilkan data sebelum sorting
        System.out.println("\n=== DATA BARANG SEBELUM SORTING ===");

        for (int i = 0; i < jumlah; i++) {
            System.out.println(
                namaBarang[i] + " - Rp " + hargaBarang[i]
            );
        }

        // Proses Bubble Sort
        bubbleSort(hargaBarang, namaBarang);

        // Tampilkan data setelah sorting
        System.out.println("\n=== DATA BARANG DARI TERMURAH KE MAHAL (ASCENDING) ===");

        for (int i = 0; i < jumlah; i++) {
            System.out.println(
                namaBarang[i] + " - Rp " + hargaBarang[i]
            );
        }

        input.close();
    }
}