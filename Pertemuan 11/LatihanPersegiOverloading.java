package pertemuan11;

/*
    Nama    : Nelson Saputra
    NIM     : D1041241003
    Kelas   : PBO B
    Tanggal : 14 Maret 2026
*/

class PersegiPanjang{
    //Class PersegiPanjang yang memiliki attribute panjang, lebar, luas dan keliling
    int panjang;
    int lebar;
    int luas;
    int keliling;
    //Construct #1 ini hanya menerima satu parameter maka bangun ruang akan dianggap 
    //persegi yang hanya memiliki sisi karena itu artinya panjang dan lebarnya sama
    public PersegiPanjang(int sisi){
        this.panjang = sisi;
        this.lebar = sisi;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }
    //Constructor #2 menerima parameter panjang dan lebar yang artinya ini persegi panjang
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }
    //Methode ini akan menampilkan hasil perhitungan luas dan keliling baik itu persegi atau persegi panjang
    public void tampilkanInfo(){
        System.out.println("Panjang  : " + panjang + " cm");
        System.out.println("Lebar    : " + lebar + " cm");
        System.out.println("Luas     : " + luas + " cm²");
        System.out.println("Keliling : " + keliling + " cm");
        System.out.println("");
    }
}

public class LatihanPersegiOverloading {
    public static void main(String[] args) {
        //Membuat Object yang menerima parameter berbeda, Object satu adalah persegi dan Object dua adalah persegi panjang
        PersegiPanjang p1 = new PersegiPanjang(5);
        PersegiPanjang p2 = new PersegiPanjang(8, 4);
        //Menampilkan hasil perhitungan sesuai dengan parameter yang sudah ditentukan
        System.out.println("=== PERSEGI ===");
        p1.tampilkanInfo();
        System.out.println("=== PERSEGI PANJANG ===");
        p2.tampilkanInfo();
    }
}
