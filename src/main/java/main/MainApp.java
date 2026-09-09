package main;

import java.util.Scanner;
import model.LayananLesPrivat;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LayananLesPrivat layanan = new LayananLesPrivat(scanner);

        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=== SISTEM PENGELOLAAN DATA LES PRIVAT ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> layanan.tambahData();
                case 2 -> layanan.tampilkanData();
                case 3 -> layanan.updateData();
                case 4 -> layanan.hapusData();
                case 5 -> berjalan = false;
                default -> System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }
}