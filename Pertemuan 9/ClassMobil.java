package Pertemuan9;

/*
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 6 Maret 2026
*/

class Mobil{
    //Deklarasi attribute yang dipakai untuk class Mobil, default kecepatan adalah 0
    String merk;
    String warna;
    int tahun;
    int kecepatan = 0;
    //Method untuk menampilkan spesifikasi mobil
    public void tampilkanSpesifikasi(){
        System.out.println("");
        System.out.println("Merk : " + merk);
        System.out.println("");
        System.out.println("Warna: " + warna);
        System.out.println("");
        System.out.println("Tahun: " + tahun);
    }
    //Method untuk mempercepat mobil dengan kecepatan awal 0
    public void percepat(){
        kecepatan = kecepatan + 20;
        System.out.println("Mobil dipercepat...");
        System.out.println("");
    }
    //Method untuk menampilkan kecepatan mobil saat ini
    public void tampilkanKecepatan(){
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
    }
}

public class ClassMobil {
    public static void main(String[] args) {
        //Deklarasi object baru dan mengisi nilainya
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota Avanza";
        mobil1.warna = "Silver";
        mobil1.tahun = 2020;
        //Mencetak dan memanggil method untuk mobil1
        System.out.println("=== SPESIFIKASI MOBIL ===");
        mobil1.tampilkanSpesifikasi();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        mobil1.percepat();
        mobil1.percepat();
        mobil1.tampilkanKecepatan();
    }
}
