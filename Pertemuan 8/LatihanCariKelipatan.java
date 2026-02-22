package pertemuan8;

/*  
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 22 Februari 2026
*/

public class LatihanCariKelipatan {
    public static void main(String[] args) {
        System.out.println("=== CARI KELIPATAN 7 ===");
        //For loop dari 1-50 akan mencetak setiap i
        for(int i = 1; i <= 50; i++){
            System.out.println("Cek: " + i);
            //Kondisi agar if bernilai true
            if(i % 7 == 0){
                System.out.println("Kelipatan 7 pertama: " + i);
                System.out.println("Pencarian selesai.");
                break;
            }
        }
    }
}
