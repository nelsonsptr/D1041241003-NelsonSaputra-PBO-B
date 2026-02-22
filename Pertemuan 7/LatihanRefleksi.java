package pertemuan7;

/*  
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 22 Februari 2026
*/

public class LatihanRefleksi {
    public static void main(String[] args){
        //Inisialisasi variabel karena while loop membutuhkan variabel diluar syntax while loop
        //Setiap iterasi menampilkan variabel angka
        int angka = 0;
        System.out.println("=== MENGGUNAKAN WHILE ===");
        while(angka < 5){
            angka += 1;
            System.out.print(angka + " ");
        }

        //Perlu newline untuk memisahkan lalu newline lagi untuk baris kosong agar terlihat rapi
        System.out.println("");
        System.out.println("");
        System.out.println("=== MENGGUNAKAN DO-WHILE ===");

        //Do-while tetap membutuhkan variabel diluar syntaxnya namun
        //pasti menjalankan perintah paling tidak satu kali
        int number = 0;
        do { 
            number += 1;
            System.out.print(number + " ");
        } while (number < 5);

        //Perlu newline untuk memisahkan lalu newline lagi untuk baris kosong agar terlihat rapi
        System.out.println("");
        System.out.println("");
        System.out.println("=== MENGGUNAKAN FOR ===");

        //For loop juga membutuhkan variabel tapi deklarasi
        //variabel tersebut ada di dalam syntax for loop
        for(int i = 0; i < 5; i++){
            System.out.print((i + 1) + " ");
        }
    }
}
