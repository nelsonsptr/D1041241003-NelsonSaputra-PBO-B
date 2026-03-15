package pertemuan13;

/*
    Nama    : Nelson Saputra
    NIM     : D1041241003
    Kelas   : PBO B
    Tanggal : 15 Maret 2026
*/

public class ArrayNilai {
    public static void main(String[] args) {
        //Array satu dimensi yang menyimpan nilai bertipe integer
        int[] nilai = {85, 90, 78, 92, 88};
        System.out.println("=== DAFTAR NILAI ===");
        //For Loop sebanyak isi array lalu menampilkan index sesuai iterasinya
        //Dibutuhkan index + 1 agar outputnya tidak dari 0 lagi
        for(int index = 0; index < nilai.length; index++){
            System.out.println("Nilai " + (index + 1) + ": " + nilai[index]);
        }
        //Menampilkan ukuran array
        System.out.println("");
        System.out.println("Total Nilai: " + nilai.length);
    }
}
