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

public class ArrayMinimarket {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah produk: ");
        int produk = input.nextInt();
        input.nextLine(); // buang newline

        int hari = 7;
        
        // (A) Menyimpan data penjualan dalam array 2 dimensi
        String[] namaProduk = new String[produk];
        int[][] penjualan = new int[produk][hari];
        int[] total = new int[produk];

        // Input nama produk
        for (int i = 0; i < produk; i++) {
            System.out.print("Masukkan nama produk ke-" + (i + 1) + ": ");
            namaProduk[i] = input.nextLine();
        }

        System.out.println();

        // Input data penjualan
        for (int i = 0; i < produk; i++) {
            System.out.println("Input penjualan untuk " + namaProduk[i]);
            for (int j = 0; j < hari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
                // (B) Menghitung total penjualan tiap produk
                total[i] += penjualan[i][j];
            }
            System.out.println();
        }

        // (D) Menampilkan seluruh data dalam bentuk tabel
        System.out.println("\n=== TABEL PENJUALAN ===");

        System.out.print("Produk\t\t");
        for (int j = 0; j < hari; j++) {
            System.out.print("H" + (j + 1) + "\t");
        }
        System.out.println("Total");

        for (int i = 0; i < produk; i++) {
            System.out.print(namaProduk[i] + "\t\t");
            for (int j = 0; j < hari; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println(total[i]);
        }

        // (C) Menentukan produk dengan penjualan tertinggi
        int maxIndex = 0;
        for (int i = 1; i < produk; i++) {
            if (total[i] > total[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("\nProduk terlaris: " + namaProduk[maxIndex]);
        System.out.println("Total penjualan: " + total[maxIndex]);
    }
}
