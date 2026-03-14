package pertemuan12;

/*
    Nama    : Nelson Saputra
    NIM     : D1041241003
    Kelas   : PBO B
    Tanggal : 14 Maret 2026
*/

class Sekolah{
    //Outer Class Sekolah dengan attribute namaSekolah
    String namaSekolah;
    //Construct pada Outer Class Sekolah yang menerima parameter nama sekolah
    Sekolah(String namaSekolah){
        this.namaSekolah = namaSekolah;
    }
    class Kelas{
        //Inner Class Kelas dengan attribute namaKelas
        String namaKelas;
        //Construct pada Inner Class Kelas yang menerima parameter nama kelas
        Kelas(String namaKelas){
            this.namaKelas = namaKelas;
        }
        //Methode yang menampilkan nama sekolah dan kelas
        void info(){
            System.out.println("Sekolah: " + namaSekolah);
            System.out.println("Kelas: "+ namaKelas);
        }
    }
}

public class InnerClassSederhana {
    public static void main(String[] args) {
        //Membuat Object, perlu membuat bagian Outer Class dulu baru membuat bagian Inner Class nya
        Sekolah sekolah = new Sekolah("SMA Negeri 1");
        Sekolah.Kelas kelas = sekolah.new Kelas("X-A");
        //Memanggil Methode dengan Inner Class
        kelas.info();
    }
}
