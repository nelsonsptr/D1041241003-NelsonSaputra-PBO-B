package pertemuan5;

/*
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 6 Maret 2026
*/

public class LatihanDiskon {
    public static void main(String[] args) {
        //Deklarasi variabel yang akan dibutuhkan
        double totalBelanja = 750000.0;
        double diskon;
        int persenDiskon;
        boolean isDiscount = false;
        //Percabangan yang memeriksa berapa diskon yang didapat totalBelanja
        if(totalBelanja > 1000000){
            diskon = 0.15;
            persenDiskon = 15;
        } else if (totalBelanja > 500000 && totalBelanja < 999999){
            diskon = 0.1;
            persenDiskon = 10;
        } else if (totalBelanja > 100000 && totalBelanja < 499999){
            diskon = 0.05;
            persenDiskon = 5;
        } else {
            diskon = 1;
            persenDiskon = 0;
            isDiscount = true;
        }
        //Mencetak totalBelanja
        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Total Belanja: Rp " + totalBelanja);
        //Memeriksa apakah totalBelanja mendapat diskon atau tidak, jika tidak maka tidak ada perhitungan yang berhubungan dengan diskon
        if(isDiscount){
            System.out.println("Diskon (0%): Rp 0.0");
            System.out.println("Harga Akhir: Rp " + totalBelanja);
            System.out.println("Anda Hemat: Rp 0.0");
        } else {
            double hargaAkhir = totalBelanja - (totalBelanja * diskon);
            System.out.println("Diskon (" + persenDiskon + "%): Rp " + (totalBelanja * diskon));
            System.out.println("Harga Akhir: Rp " + hargaAkhir);
            System.out.println("Anda Hemat: Rp " + (totalBelanja - hargaAkhir));
        }
        
    }
}
