package pertemuan8;

/*
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 22 Februari 2026
*/

public class LatihanKombinasiLoop {
    public static void main(String[] args) {
        //Flag boolean agar for loop awal bisa break juga
        boolean flag = false;
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        //For loop awal untuk koordinat [x, ...]
        for(int i = 1; i <= 3; i++){
            //For loop kedua untuk koordinat [..., y]
            for(int j = 1; j <= 5; j++){
                System.out.println("Cek: " + "[" + i + "," + j + "]");
                //Kondisi jika [2,3] ketemu
                if(i == 2 && j == 3){
                    System.out.println("Koordinat ditemukan!");
                    System.out.println("Pencarian selesai.");
                    flag = true;
                    break;
                }
            }
            //Menghentikan loop awal
            if(flag){
                break;
            }
        }
    }
}
