package Pertemuan9;

/*  
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 20 Februari 2026
*/

class Mobil {
    String merk;
    String warna;
    int tahun;
    int kecepatan;
    public void tampilkanInfo(){
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
        System.out.println("Kecepatan: " + kecepatan);
    }
    public void percepat() {
        kecepatan += 10;
        System.out.println("Kecepatan saat ini adalah : " + kecepatan + "km/jam");
    }
}

public class ObjectDanClass {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();

        mobil1.merk = "Toyota";
        mobil1.warna = "Silver";
        mobil1.tahun = 2009;
        mobil1.kecepatan = 35;

        mobil1.tampilkanInfo();
        mobil1.percepat();
    }
}