package model;

public class Tutor {
    public String idTutor;
    public String nama;
    public String keahlian;
    public String noTelepon;

    public Tutor(String idTutor, String nama, String keahlian, String noTelepon) {
        this.idTutor = idTutor;
        this.nama = nama;
        this.keahlian = keahlian;
        this.noTelepon = noTelepon;
    }

    public void tampilkanInfo() {
        System.out.printf("%-8s | %-20s | %-20s | %-15s\n",
                idTutor, nama, keahlian, noTelepon);
    }
}