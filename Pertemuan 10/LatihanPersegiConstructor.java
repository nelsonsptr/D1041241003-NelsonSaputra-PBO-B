package pertemuan10;

/*
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 6 Maret 2026
*/
class Persegi{
    //Deklarasi attribute untuk class Persegi
    int sisi;
    int luas;
    int keliling;
    //Deklarasi boolean disini agar baris Error bisa ditampilkan dengan benar, jika tidak baris error bisa muncul di baris awal output
    boolean isError = false;
    //Constructor yang memeriksa sisi apakah <= 0, menghitung luas dan menghitung keliling
    public Persegi(int sisi){
        if(sisi <= 0){
            isError = true;
            this.sisi = 1;
        } else {
            this.sisi = sisi;
        }
        this.luas = this.sisi * this.sisi;
        this.keliling = 4 * this.sisi;
    }
    //Method yang akan menampilkan pesan error (jika iya), sisi serta hasil perhitungan luas dan keliling
    public void tampilkanHasil(){
        if(isError){
            System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
        }
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi    : " + sisi + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
    }
}
public class LatihanPersegiConstructor {
    public static void main(String[] args) {
        //Deklarasi object yang memiliki nilai valid dan invalid
        Persegi persegi1 = new Persegi(5);
        Persegi persegi2 = new Persegi(-3);
        //Mencetak dan memanggil method untuk setiap object
        persegi1.tampilkanHasil();
        System.out.println("");
        persegi2.tampilkanHasil();
    }
}
