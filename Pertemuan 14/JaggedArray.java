package pertemuan14;

/*
    Nama    : Nelson Saputra
    NIM     : D1041241003
    Kelas   : PBO B
    Tanggal : 15 Maret 2026
*/

public class JaggedArray {
    public static void main(String[] args) {
        //Array 2D yang tiap baris beda ukuran
        int[][] jagged = {{10, 20}, {30, 40, 50, 60}, {70, 80, 90}};
        System.out.println("=== JAGGED ARRAY ===");
        //For Loop yang akan menampilkan sekarang baris ke berapa dan ukuran baris tersebut
        for(int i = 0; i < jagged.length; i++){
            System.out.print("Baris " + i + " (" + jagged[i].length + " elemen): ");
            //For Loop yang menampilkan nilai yang ada di baris tersebut
            for(int j = 0; j < jagged[i].length; j++){
                System.out.print(jagged[i][j] + " ");
            }
            //Pindah baris
            System.out.println();
        }
    }
}
