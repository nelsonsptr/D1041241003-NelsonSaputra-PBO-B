package Pertemuan9;

/*  
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 6 Maret 2026
*/

class Buku{
    //Deklarasi Attribute Di Dalam Class
    String judul;
    String pengarang;
    int harga;
    //Mencetak dan Memanggil Method Untuk Tiap Object
    public void tampilkanInfo(){
        System.out.println("");
        System.out.println("Judul     : " + judul);
        System.out.println("");
        System.out.println("Pengarang : " + pengarang);
        System.out.println("");
        System.out.println("Harga     : Rp " + harga);
    }
}

public class ClassBuku {
    public static void main(String[] args) {
        //Membuat 2 Object Baru
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        //Mengisi 2 Object Tersebut (buku1 dan buku2)
        buku1.judul = "Pemrograman Java";
        buku1.pengarang = "Budi Raharjo";
        buku1.harga = 125000;
        buku2.judul = "Algoritma dan Struktrur Data";
        buku2.pengarang = "Rinaldi Munir";
        buku2.harga = 150000;
        //Memanggil Method Yang Sama Untuk Kedua Object
        System.out.println("=== INFORMASI BUKU ===");
        buku1.tampilkanInfo();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("=== INFORMASI BUKU ===");
        buku2.tampilkanInfo();
    }
}
