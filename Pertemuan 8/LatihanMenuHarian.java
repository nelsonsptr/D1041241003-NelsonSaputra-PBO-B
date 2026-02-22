package pertemuan8;

/*  
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 22 Februari 2026
*/

public class LatihanMenuHarian {
    public static void main(String[] args) {
        //Array statis yang berisi menu, dipanggil sesuai index array
        String[] menu = {"Nasi Goreng", "Soto Ayam", "Bubur Ayam", "Mie Goreng", "Roti Bakar", "Nasi Uduk"};
        //Variabel count untuk memanggil elemen array menu sesuai index
        int count = 0;
        //For loop pertama untuk hari, loop kedua untuk waktu
        System.out.println("=== MENU MAKAN 3 HARI ===");
        for(int i = 1; i <= 3; i++){
            System.out.println("Hari " + i + ":");
            for(int j = 0; j < 2; j++){
                if(j == 0){
                System.out.println("  Pagi: " + menu[count]);
                count++;
                } else {
                    System.out.println("  Siang: " + menu[count]);
                    count++;
                }
            }
            System.out.println("");
        }
    }
}
