package pertemuan11;

/*
    Nama    : Nelson Saputra
    NIM     : D1041241003
    Kelas   : PBO B
    Tanggal : 14 Maret 2026
*/

class Produk{
    //Class Produk yang memiliki attribute namaProduk, harga, dan stok
    String namaProduk;
    int harga;
    int stok;
    //Constructor #1 yang hanya menerima parameter namaProduk dan harga, untuk stok akan bernilai default
    public Produk(String namaProduk, int harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
        stok = 0;
    }
    //Constructor #2 yang menerima semua parameter dengan lengkap
    public Produk(String namaProduk, int harga, int stok){
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
    //Methode yang akan menampilkan informasi produk tersebut sesuai parameter constructor nanti
    public void tampilkanInfo(){
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp " + harga);
        System.out.println("Stok        : " + stok);
        System.out.println("");
    }
}

public class LatihanProdukOverloading {
    public static void main(String[] args){
        //Membuat Object yang menerima parameter berbeda yang akan menggunakan constructor yang berbeda pula
        Produk p1 = new Produk("Laptop ASUS", 8500000);
        Produk p2 = new Produk("Mouse Logitech", 250000, 50);
        //Memanggil Methode untuk setiap Object yang sudah dibuat sebelumnya
        p1.tampilkanInfo();
        p2.tampilkanInfo();
    }
}
