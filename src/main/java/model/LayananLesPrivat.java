package model;

import java.util.ArrayList;
import java.util.Scanner;

public class LayananLesPrivat {
    private Scanner scanner;

    private ArrayList<Siswa> daftarSiswa = new ArrayList<>();
    private ArrayList<Tutor> daftarTutor = new ArrayList<>();
    private ArrayList<Jadwal> daftarJadwal = new ArrayList<>();

    public LayananLesPrivat(Scanner scanner) {
        this.scanner = scanner;
    }

    public void tambahData() {
        System.out.println("\n1. Siswa");
        System.out.println("2. Tutor");
        System.out.println("3. Jadwal");
        System.out.print("Pilih: ");
        int pilih = scanner.nextInt();
        scanner.nextLine();

        if (pilih == 1) {
            System.out.print("ID Siswa: ");
            String id = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Jenjang: ");
            String jenjang = scanner.nextLine();
            System.out.print("Mata Pelajaran: ");
            String mapel = scanner.nextLine();

            daftarSiswa.add(new Siswa(id, nama, jenjang, mapel));

        } else if (pilih == 2) {
            System.out.print("ID Tutor: ");
            String id = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Keahlian: ");
            String keahlian = scanner.nextLine();
            System.out.print("No. Telepon: ");
            String telepon = scanner.nextLine();

            daftarTutor.add(new Tutor(id, nama, keahlian, telepon));

        } else if (pilih == 3) {
            System.out.print("ID Jadwal: ");
            String id = scanner.nextLine();
            System.out.print("ID Siswa: ");
            String siswa = scanner.nextLine();
            System.out.print("ID Tutor: ");
            String tutor = scanner.nextLine();
            System.out.print("Hari: ");
            String hari = scanner.nextLine();
            System.out.print("Jam: ");
            String jam = scanner.nextLine();

            daftarJadwal.add(new Jadwal(id, siswa, tutor, hari, jam));
        }
    }

    public void tampilkanData() {
        System.out.println("\nDATA SISWA");
        for (Siswa s : daftarSiswa) {
            s.tampilkanInfo();
        }

        System.out.println("\nDATA TUTOR");
        for (Tutor t : daftarTutor) {
            t.tampilkanInfo();
        }

        System.out.println("\nDATA JADWAL");

        for (Jadwal j : daftarJadwal) {
            String namaSiswa = "";
            String namaTutor = "";

            for (Siswa s : daftarSiswa) {
                if (s.idSiswa.equals(j.idSiswa)) {
                    namaSiswa = s.nama;
                    break;
                }
            }

            for (Tutor t : daftarTutor) {
                if (t.idTutor.equals(j.idTutor)) {
                    namaTutor = t.nama;
                    break;
                }
            }

            j.tampilkanInfo(namaSiswa, namaTutor);
        }
    }

    public void updateData() {
        System.out.println("\n1. Siswa");
        System.out.println("2. Tutor");
        System.out.println("3. Jadwal");
        System.out.print("Pilih: ");
        int pilih = scanner.nextInt();
        scanner.nextLine();

        if (pilih == 1) {
            System.out.print("ID Siswa: ");
            String id = scanner.nextLine();

            for (Siswa s : daftarSiswa) {
                if (s.idSiswa.equalsIgnoreCase(id)) {
                    System.out.print("Nama: ");
                    s.nama = scanner.nextLine();
                    System.out.print("Jenjang: ");
                    s.jenjang = scanner.nextLine();
                    System.out.print("Mata Pelajaran: ");
                    s.mataPelajaran = scanner.nextLine();
                    break;
                }
            }

        } else if (pilih == 2) {
            System.out.print("ID Tutor: ");
            String id = scanner.nextLine();

            for (Tutor t : daftarTutor) {
                if (t.idTutor.equalsIgnoreCase(id)) {
                    System.out.print("Nama: ");
                    t.nama = scanner.nextLine();
                    System.out.print("Keahlian: ");
                    t.keahlian = scanner.nextLine();
                    System.out.print("No. Telepon: ");
                    t.noTelepon = scanner.nextLine();
                    break;
                }
            }

        } else if (pilih == 3) {
            System.out.print("ID Jadwal: ");
            String id = scanner.nextLine();

            for (Jadwal j : daftarJadwal) {
                if (j.idJadwal.equalsIgnoreCase(id)) {
                    System.out.print("ID Siswa: ");
                    j.idSiswa = scanner.nextLine();
                    System.out.print("ID Tutor: ");
                    j.idTutor = scanner.nextLine();
                    System.out.print("Hari: ");
                    j.hari = scanner.nextLine();
                    System.out.print("Jam: ");
                    j.jam = scanner.nextLine();
                    break;
                }
            }
        }
    }

    public void hapusData() {
        System.out.println("\n1. Siswa");
        System.out.println("2. Tutor");
        System.out.println("3. Jadwal");
        System.out.print("Pilih: ");
        int pilih = scanner.nextInt();
        scanner.nextLine();

        if (pilih == 1) {
            System.out.print("ID Siswa: ");
            String id = scanner.nextLine();

            for (Siswa s : daftarSiswa) {
                if (s.idSiswa.equalsIgnoreCase(id)) {
                    daftarSiswa.remove(s);
                    break;
                }
            }

        } else if (pilih == 2) {
            System.out.print("ID Tutor: ");
            String id = scanner.nextLine();

            for (Tutor t : daftarTutor) {
                if (t.idTutor.equalsIgnoreCase(id)) {
                    daftarTutor.remove(t);
                    break;
                }
            }

        } else if (pilih == 3) {
            System.out.print("ID Jadwal: ");
            String id = scanner.nextLine();

            for (Jadwal j : daftarJadwal) {
                if (j.idJadwal.equalsIgnoreCase(id)) {
                    daftarJadwal.remove(j);
                    break;
                }
            }
        }
    }
}