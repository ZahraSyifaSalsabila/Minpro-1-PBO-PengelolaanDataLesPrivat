## Deskripsi Singkat Kegiatan
Sistem Pengelolaan Data Les Privat adalah program berbasis Java yang digunakan untuk membantu mengelola kegiatan les privat. Program ini mengelola 3 jenis data utama, yaitu data siswa, data tutor, dan data jadwal les. Pengguna dapat menambahkan data baru, melihat seluruh data yang tersimpan, mengubah data, dan terakhir menghapus data melalui menu yang sudah dibuat. Data disimpan menggunakan ArrayList, untuk proses pengelolaan data dilakukan pada class LayananLesPrivat.

## Penjelasan Alur Program
Program dimulai dengan menampilkan menu utama sistem yang berisi 4 proses pengelolaan data dan menu keluar. Pengguna bisa memilih menu sesuai kebutuhan. Pada proses tambah, update, dan hapus, pengguna akan diminta untuk memilih data yang ingin dikelola, yaitu siswa, tutor, atau jadwal. Data jadwal akan menggunakan ID siswa dan ID tutor sebagai penghubung, sehingga nama siswa dan tutor dapat ditampilkan pada jadwal. Program akan terus berjalan dan kembali ke menu utama sampai pengguna memilih menu keluar.

## Penjelasan Letak Penerapan Nilai Tambah
Nilai tambah yang diterapkan adalah access modifier. Penerapannya terdapat pada class LayananLesPrivat, yaitu penggunaan private pada Scanner dan ArrayList.
Penerapannya:

private Scanner scanner;

private ArrayList<Siswa> daftarSiswa = new ArrayList<>();

private ArrayList<Tutor> daftarTutor = new ArrayList<>();

private ArrayList<Jadwal> daftarJadwal = new ArrayList<>();

private Scanner scanner digunakan untuk membatasi akses terhadap objek Scanner, sehingga hanya bisa digunakan dari dalam class LayananLesPrivat. Juga dengan ArrayList yang digunakan untuk menyimpan data siswa, tutor, dan jadwal. Penggunaan private akan membuat data tersebut tidak bisa diakses secara langsung dari class lain.
