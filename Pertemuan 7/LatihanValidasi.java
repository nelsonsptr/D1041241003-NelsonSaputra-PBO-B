package pertemuan7;

/*  
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 22 Februari 2026
*/

public class LatihanValidasi {
    public static void main(String[] args){
        //Inisialisasi nilai awal
        int nilai = 85;
        System.out.println("=== VALIDASI NILAI UJIAN ===");
        
        //Proses yang akan dilakukan paling tidak satu kali,
        //Pengkondisian agar nilai tidak lebih rendah dari 0 dan lebih dari 100
        do { 
            System.out.println("Percobaan input: " + nilai);
            if(nilai > 100 || nilai < 0){
                System.out.println("Error: Nilai harus antara 0-100!");
                break;
            } else {
                System.out.println("Nilai valid: " + nilai);
                break;
            }
        } while (nilai > 0 && nilai < 101);
    }
}
