public class LatihanPerhitungan {
    /*
    Nama    : Nelson Saputra
    NIM     : D1041241003
    Kelas   : PBO B
    Tanggal : 13 Februari 2026
    */
    public static void main(String[] args) {
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        //Variable saldo bertipe integer
        int saldo = 1000000;

        //Menampilkan saldo awal
        System.out.println("Saldo Awal              : " + saldo);

        //Menambahkan saldo
        int setoran = 500000;
        saldo += setoran;
        System.out.println("Setoran                 : " + setoran);

        //Menampilkan saldo setelah setoran
        System.out.println("Saldo Setelah Setoran   : " + saldo);

        //Mengurangi saldo
        int penarikan = 250000;
        saldo -= penarikan;
        System.out.println("Penarikan               : " + penarikan);

        //Menampilkan saldo setelah penarikan
        System.out.println("Saldo Akhir             : " + saldo);
    }
}
