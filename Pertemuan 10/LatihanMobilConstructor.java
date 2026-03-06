package pertemuan10;

/*
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 6 Maret 2026
*/

class Mobil {
    //Deklarasi attribute untuk class Mobil
    String merk;
    String warna;
    int tahun;
    //Constructor tanpa parameter yang berisi nilai default
    public Mobil (){
        merk = "Belum diisi";
        warna = "Belum diisi";
        tahun = 0;
    }
    //Constructor yang hanya memiliki parameter merk dan sisanya bernilai default
    public Mobil(String merk){
        this.merk = merk;
        warna = "Belum diisi";
        tahun = 0;
    }
    //Constructor yang memiliki parameter untuk semua attribute
    public Mobil(String merk, String warna, int tahun){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }
    //Method yang melakukan cetak spesifikasi mobil
    public void tampilkanSpesifikasi(){
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
    }
}

public class LatihanMobilConstructor {
    public static void main(String[] args){
        //Deklarasi tiga object yang menggunakan constructor yang berbeda-beda
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil("Toyota");
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);
        //Cetak dan memanggil method untuk setiap object
        System.out.println("=== SPESIFIKASI MOBIL ===");
        mobil1.tampilkanSpesifikasi();
        System.out.println("");
        System.out.println("=== SPESIFIKASI MOBIL ===");
        mobil2.tampilkanSpesifikasi();
        System.out.println("");
        System.out.println("=== SPESIFIKASI MOBIL ===");
        mobil3.tampilkanSpesifikasi();
    }
}
