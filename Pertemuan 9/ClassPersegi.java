package Pertemuan9;

/*  
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 6 Maret 2026
*/

class Persegi{
    //Deklarasi attribute yang ada di class Persegi
    int sisi;
    int luas;
    int keliling;
    //Method untuk menhitung luas (sisi x sisi)
    public void hitungLuas(){
        luas = sisi * sisi;
    }
    //Method untuk menghitung keliling (4 x sisi)
    public void hitungKeliling(){
        keliling = 4 * sisi;
    }
    //Method untuk menampilkan hasil
    public void tampilkanHasil(){
        System.out.println("");
        System.out.println("Sisi     : " + sisi + " cm");
        System.out.println("");
        System.out.println("Luas     : " + luas + " cm²");
        System.out.println("");
        System.out.println("Keliling : " + keliling + " cm");
    }
}

public class ClassPersegi {
    public static void main(String[] args) {
        //Deklarasi object persegi1 dan mengisi nilai sisinya
        Persegi persegi1 = new Persegi();
        persegi1.sisi = 5;
        //Mencetak dan memanggil method untuk object persegi1
        System.out.println("=== PERSEGI ===");
        persegi1.hitungLuas();
        persegi1.hitungKeliling();
        persegi1.tampilkanHasil();
    }
}
