package pertemuan11;

/*
    Nama    : Nelson Saputra
    NIM     : D1041241003
    Kelas   : PBO B
    Tanggal : 14 Maret 2026
*/

class Mobil{
    //Class Mobil dengan attribute merk, warna dan tahun
    String merk;
    String warna;
    int tahun;
    //Constructor yang tidak memiliki parameter, memberi nilai default
    public Mobil(){
        merk = "Unknown";
        warna = "Unknown";
        tahun = 0;
    }
    //Constructor yang hanya menerima parameter merk, memberi nilai default kecuali merk
    public Mobil(String merk){
        this.merk = merk;
        warna = "Unknown";
        tahun = 0;
    }
    //Constructor yang menerima semua parameter
    public Mobil(String merk, String warna, int tahun){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }
    //Methode yang mencetak semua spesifikasi mobil
    public void tampilkanSpesifikasi(){
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
        System.out.println("");
    }
}

public class LatihanMobilOverloading {
    public static void main(String[] args) {
        //Object yang menerima parameter sesuai dengan constructor yang sudah diatur sebelumnya
        Mobil m1 = new Mobil();
        Mobil m2 = new Mobil("Toyota");
        Mobil m3 = new Mobil("Honda Civic", "Merah", 2023);
        //Memanggil Methode untuk setiap Object
        m1.tampilkanSpesifikasi();
        m2.tampilkanSpesifikasi();
        m3.tampilkanSpesifikasi();
    }
}
