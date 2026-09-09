package model;

public class Jadwal {
    public String idJadwal;
    public String idSiswa;
    public String idTutor;
    public String hari;
    public String jam;

    public Jadwal(String idJadwal, String idSiswa, String idTutor, String hari, String jam) {
        this.idJadwal = idJadwal;
        this.idSiswa = idSiswa;
        this.idTutor = idTutor;
        this.hari = hari;
        this.jam = jam;
    }

    public void tampilkanInfo(String namaSiswa, String namaTutor) {
        System.out.printf("%-8s | %-20s | %-20s | %-12s | %-10s\n",
                idJadwal, namaSiswa, namaTutor, hari, jam);
    }
}