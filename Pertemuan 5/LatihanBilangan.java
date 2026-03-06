package pertemuan5;

/*
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 6 Maret 2026
*/

public class LatihanBilangan {
    public static void main(String[] args) {
        //Deklarasi variabel
        int number = -7;
        String bilangan;
        String tipe;
        //Operasi percabangan yang memeriksa apakah angka tersebut lebih, kurang atau sama dengan nol
        if(number > 0){
            bilangan = "Bilangan positif";
            //Operasi percabangan dengan ternary operator untuk memeriksa ganjil atau genap
            tipe = (number % 2 == 0) ? "Genap" : "Ganjil";
        } else if (number < 0){
            bilangan = "Bilangan negatif";
            tipe = (number % 2 == 0) ? "Genap" : "Ganjil";
        } else {
            bilangan = "bilangan nol";
            tipe = (number % 2 == 0) ? "Genap" : "Ganjil";
        }
        //Mencetak output
        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan: " + number);
        System.out.println("Jenis: " + bilangan);
        System.out.println("Tipe: " + tipe);
    }
}
