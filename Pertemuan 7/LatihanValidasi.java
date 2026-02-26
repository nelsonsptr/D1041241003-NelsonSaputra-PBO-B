package pertemuan7;

/*  
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 22 Februari 2026
*/

public class LatihanValidasi {
    public static void main(String[] args){
        //Inisialisasi nilai awal, menggunakan array karena terdapat "input" lebih dari satu
        int[]nilai = {-10, 150, 85};
        //variabel count digunakan sebagai index array agar kita bisa menggunakan elemen yang sesuai tiap iterasi
        int count = 0;
        System.out.println("=== VALIDASI NILAI UJIAN ===");
        
        //Proses yang akan dilakukan paling tidak satu kali,
        //Pengkondisian agar nilai tidak lebih rendah dari 0 dan lebih dari 100
        do {
            System.out.println("Percobaan input: " + nilai[count]);
            if(nilai[count] > 100 || nilai[count] < 0){
                System.out.println("Error: Nilai harus antara 0-100!");
            } else {
                System.out.println("Nilai valid: " + nilai[count]);
            }
            count++;
        } while (count < 3);
    }
}
