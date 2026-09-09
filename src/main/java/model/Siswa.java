package model;

public class Siswa {
    public String idSiswa;
    public String nama;
    public String jenjang;
    public String mataPelajaran;

    public Siswa(String idSiswa, String nama, String jenjang, String mataPelajaran) {
        this.idSiswa = idSiswa;
        this.nama = nama;
        this.jenjang = jenjang;
        this.mataPelajaran = mataPelajaran;
    }

    public void tampilkanInfo() {
        System.out.printf("%-8s | %-20s | %-12s | %-20s\n",
                idSiswa, nama, jenjang, mataPelajaran);
    }
}