package pertemuan7;

/*  
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 22 Februari 2026
*/

public class LatihanTabelPerkalian {
    public static void main(String[] args) {
        //Inisialisasi nilai awal
        int angka = 7;
        System.out.println("=== TABEL PERKALIAN 7 ===");
        
        //Proses iterasi dengan For Loop sebanyak 12 kali
        for(int i = 1; i <= 12; i++){
            System.out.println(angka + " x " + i + " = " + (angka * i));
        }
    }
}

