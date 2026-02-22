package pertemuan8;

/*  
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 22 Februari 2026
*/

public class LatihanTotalGenap {
    public static void main(String[] args) {
        //Inisialisasi variabel untuk menyimpan hasil perhitungan tiap iterasi yang dijalankan
        int total = 0;
        System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");
        //For loop 1-20 dengan mengabaikan nilai bilangan ganjil
        for(int i = 1; i <= 20; i++){
            if(i % 2 != 0){
                continue;
            }
            total += i;
            System.out.println("Tambah: " + i + " -> Total: " + total);
        }
        //Total akhir
        System.out.println("---");
        System.out.println("Total akhir: " + total);
    }
}
