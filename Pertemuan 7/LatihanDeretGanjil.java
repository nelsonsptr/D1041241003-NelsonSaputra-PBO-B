package pertemuan7;

/*  
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 22 Februari 2026
*/

public class LatihanDeretGanjil {
    public static void main(String[] args) {
        //Inisialisasi nilai awal
        int angka = 1;
        System.out.println("=== BILANGAN GANJIL 1-15 ===");
        
        //Proses while loop untuk menampilkan angka ganjil 1-15
        //Penggunaan angka += 2 digunakan karena lebih sederhana
        //Angka tidak akan berubah menjadi genap
        while(angka < 16){
            System.out.print(angka + " ");
            angka += 2;
        }
    }
}
