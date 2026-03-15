package pertemuan13;

/*
    Nama    : Nelson Saputra
    NIM     : D1041241003
    Kelas   : PBO B
    Tanggal : 15 Maret 2026
*/

public class ArrayNama {
    public static void main(String[] args) {
        //Array satu dimensi yang berisi nama dengan tipe String
        String[] nama = {"Andi", "Budi", "Citra", "Deni", "Eka"};
        System.out.println("=== DAFTAR NAMA ===");
        //Perulangan For sebanyak ukuran array
        for(int index = 0; index < nama.length; index++){
            //index + 1 diperlukan karena urutan array itu dari 0, jadi agar output lebih sesuai perlu +1
            System.out.println((index + 1) + ". " + nama[index]);
        }
    }
}
