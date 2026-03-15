package pertemuan14;

/*
    Nama    : Nelson Saputra
    NIM     : D1041241003
    Kelas   : PBO B
    Tanggal : 15 Maret 2026
*/

public class Array2DSederhana {
    public static void main(String[] args) {
        //Array 2 Dimensi dengan ukuran 3x3
        int[][] data = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("===  TABEL 3x3  ===");
        //Nested For Loop untuk menampilkan array 2d
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                //Menampilkan index 0.0, 0.1, 0.2 dst...
                System.out.print(data[i][j] + "     ");
            }
            //Setiap selesai for loop dalam, perlu pindah baris
            System.out.println();
        }
    }
}
