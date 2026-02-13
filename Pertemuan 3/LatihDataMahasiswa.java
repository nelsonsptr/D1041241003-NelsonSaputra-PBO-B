public class LatihDataMahasiswa {
    /*
    Nama    : Nelson Saputra
    NIM     : D1041241003
    Kelas   : PBO B
    Tanggal : 13 Februari 2026
    */
    public static void main(String[] args) {
        //Menyimpan NIM dengan integer
        long nim = 2301010001L;
        //Menyimpan Nama dengan String
        String nama = "Budi Santoso";
        //Menyimpan Kelas dengan Char
        char kelas = 'A';
        //Menyimpan Status Aktif dengan Boolean
        boolean statusAktif = true;
        //Menyimpan IPK Semester dengan double
        double ipkSemester = 3.75;
        //Menyimpan Total SKS dengan int
        int totalSks = 72;
        //Mencetak Hasil
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("NIM             : " + nim);
        System.out.println("Nama            : " + nama);
        System.out.println("Kelas           : " + kelas);
        System.out.println("Status Aktif    : " + statusAktif);
        System.out.println("IPK Semester    : " + ipkSemester);
        System.out.println("Total SKS       : " + totalSks);
    }
}
