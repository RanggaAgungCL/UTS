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

public class Array2Dimensi5x5 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] kursi = new int[5][5];

        // Menampilkan denah awal (semua kosong)
        System.out.println("Denah kursi awal:");
        tampilkanKursi(kursi);

        // Mengisi beberapa kursi
        System.out.print("Masukkan jumlah kursi yang ingin diisi: ");
        int jumlah = input.nextInt();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan baris (0-4): ");
            int baris = input.nextInt();

            System.out.print("Masukkan kolom (0-4): ");
            int kolom = input.nextInt();

            if (kursi[baris][kolom] == 0) {
                kursi[baris][kolom] = 1;
            } else {
                System.out.println("Kursi sudah terisi!");
                i--; // ulang input
            }
        }

        // Menampilkan denah setelah diisi
        System.out.println("\nDenah kursi setelah diisi:");
        tampilkanKursi(kursi);

        // Menghitung kursi kosong dan terisi
        int kosong = 0, terisi = 0;

        for (int i = 0; i < kursi.length; i++) {
            for (int j = 0; j < kursi[i].length; j++) {
                if (kursi[i][j] == 0) {
                    kosong++;
                } else {
                    terisi++;
                }
            }
        }

        System.out.println("\nJumlah kursi kosong: " + kosong);
        System.out.println("Jumlah kursi terisi: " + terisi);
    }

    // Method untuk menampilkan denah kursi
    public static void tampilkanKursi(int[][] kursi) {
        for (int i = 0; i < kursi.length; i++) {
            for (int j = 0; j < kursi[i].length; j++) {
                System.out.print(kursi[i][j] + " ");
            }
            System.out.println();
        }
    }
}