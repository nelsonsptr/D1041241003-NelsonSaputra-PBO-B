package pertemuan15;

/*
    Nama    : Nelson Saputra
    NIM     : D1041241003
    Kelas   : PBO B
    Tanggal : 15 Maret 2026
*/

public class MethodVarArgs {
    //Method menghitung rata rata dari array satu dimensi
    static double hitungRataRata(int... nilai){
        //Jika array kosong maka kembalikan rata rata 0
        if(nilai.length == 0){
            return 0;
        }
        //Menghitung total pada array
        int total = 0;
        for(int n : nilai){
            total += n;
        }
        //Total yang sudah dihitung akan dibagi dengan banyaknya nilai dan dikembalikan sebagai double
        return (double) total / nilai.length;
    }
    public static void main(String[] args) {
        //Menggunakan method dengan parameter berupa array
        double rata1 = hitungRataRata(70, 80, 90);
        double rata2 = hitungRataRata(85, 90, 78, 92, 88);
        //Memanggil method
        System.out.println("Rata-rata (3 nilai): " + rata1);
        System.out.println("Rata-rata (5 nilai): " + rata2);
    }
}
