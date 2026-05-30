/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Hype
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AntrianRestoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Queue untuk menyimpan data pelanggan + pesanan
        Queue<String> antrian = new LinkedList<>();

        int pilihan;

        do {
            System.out.println("\n=== SISTEM ANTRIAN RESTORAN ===");
            System.out.println("1. Tambah pesanan");
            System.out.println("2. Tampilkan antrian");
            System.out.println("3. Proses pesanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    // (a) Tambah data pelanggan + pesanan
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan pesanan: ");
                    String pesanan = input.nextLine();

                    String data = nama + " - " + pesanan;
                    antrian.add(data);

                    System.out.println("Pesanan berhasil ditambahkan ke antrian.");
                    break;

                case 2:
                    // (b) Tampilkan antrian
                    System.out.println("Daftar antrian: " + antrian);
                    break;

                case 3:
                    // (c) Proses pesanan pertama
                    if (!antrian.isEmpty()) {
                        String proses = antrian.poll();
                        System.out.println("Memproses: " + proses);

                        // (d) Tampilkan setelah proses
                        System.out.println("Sisa antrian: " + antrian);
                    } else {
                        System.out.println("Antrian kosong!");
                    }
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);
    }
}
