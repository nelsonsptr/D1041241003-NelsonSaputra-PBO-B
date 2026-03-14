package pertemuan12;

/*
    Nama    : Nelson Saputra
    NIM     : D1041241003
    Kelas   : PBO B
    Tanggal : 14 Maret 2026
*/

class Mahasiswa{
    //Class Mahasiswa memiliki attribute static jumlahMahasiswa dan attribute non-static nama
    static int jumlahMahasiswa = 0;
    String nama;
    //Constructor ini akan menerima parameter nama lalu menambah nilai jumlahMahasiswa serta mencetak nama mahasiswa yang ditambahkan
    Mahasiswa(String n){
        this.nama = n;
        jumlahMahasiswa++;
        System.out.println("Mahasiswa dibuat : " + nama);
    }
    //Methode ini akan mengembalikan jumlah mahasiswa sesuai banyaknya Object class Mahasiswa yang dibuat
    static int getJumlah(){
        return jumlahMahasiswa;
    }
}

public class StaticCounter {
    public static void main(String[] args) {
        //Membuat 3 Object yang dimana ini akan menjalankan constructor yang menghitung jumlah mahasiswa
        Mahasiswa m1 = new Mahasiswa("Andi");
        Mahasiswa m2 = new Mahasiswa("Budi");
        Mahasiswa m3 = new Mahasiswa("Citra");
        //Memanggil Methode yang akan menampilkan jumlah mahasiswa saat ini
        System.out.println("");
        System.out.println("Total Mahasiswa: " + Mahasiswa.getJumlah());
    }
}
