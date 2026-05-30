/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Hype
 */
import java.util.Stack;

public class UndoStack {
     public static void main(String[] args) {

        Stack<String> aksi = new Stack<>();

        System.out.println("=== SIMULASI FITUR UNDO PADA MICROSOFT WORD ===\n");

        System.out.println("--- Pengguna melakukan beberapa aksi di Word ---");

        aksi.push("Mengetik judul \"Laporan Praktikum\"");
        System.out.println("-> Push: Mengetik judul \"Laporan Praktikum\"");

        aksi.push("Mengetik paragraf pertama");
        System.out.println("-> Push: Mengetik paragraf pertama");

        aksi.push("Mengubah font menjadi Times New Roman");
        System.out.println("-> Push: Mengubah font menjadi Times New Roman");

        aksi.push("Mengubah ukuran font menjadi 12");
        System.out.println("-> Push: Mengubah ukuran font menjadi 12");

        aksi.push("Menambahkan gambar logo");
        System.out.println("-> Push: Menambahkan gambar logo");

        System.out.println("\nIsi Stack Riwayat Aksi saat ini (Bawah ke Atas):");
        System.out.println(aksi);

        System.out.println("\n--- Pengguna menekan tombol UNDO (Ctrl + Z) ---");
        System.out.println("[UNDO BERHASIL] Aksi yang dibatalkan: " + aksi.pop());

        System.out.println("\n--- Pengguna menekan tombol UNDO lagi ---");
        System.out.println("[UNDO BERHASIL] Aksi yang dibatalkan: " + aksi.pop());

        System.out.println("\nIsi Stack Riwayat Aksi Terakhir:");
        System.out.println(aksi);

    }
}
