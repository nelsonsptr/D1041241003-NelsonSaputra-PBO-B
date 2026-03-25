package pertemuan16;

class Produk{
    String kodeProduk;
    String namaProduk;
    double hargaProduk;
    public Produk(String kodeProduk, String namaProduk, double hargaProduk){
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
    }
    public void tampilkanProduk(){
        System.out.printf("%-12s %-50s Rp %,12.0f%n", kodeProduk, namaProduk, hargaProduk);
    }
}

public class SistemPoS_kbeautyskincare {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════════════════════════╗"); 
        System.out.println("║                          SISTEM POINT OF SALE (PoS)                          ║"); 
        System.out.println("║                          KBEAUTYSKINCARE - Pontianak                         ║"); 
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════╝"); 
        System.out.println("");
        Produk[] daftarProduk = new Produk[10];
        daftarProduk[0] = new Produk("P001", "Npure Centella Asiatica Toner 150 Ml", 104200);
        daftarProduk[1] = new Produk("P002", "Facetology Triple Care Sunscreen", 193200);
        daftarProduk[2] = new Produk("P003", "Pyary Nalpamara Sabun Arab", 34700);
        daftarProduk[3] = new Produk("P004", "Implora Urban Lip Cream Matte", 19800);
        daftarProduk[4] = new Produk("P005", "Hanasui Boba Edition / Mattedorable Lip Cream", 28200);
        daftarProduk[5] = new Produk("P006", "Marcks Active Bedak Tabur", 23000);
        daftarProduk[6] = new Produk("P007", "SALSA Vinylash Eyelash Curler", 14000);
        daftarProduk[7] = new Produk("P008", "IMPLORA Lip Crayon Satin 3.5gr", 20900);
        daftarProduk[8] = new Produk("P009", "Kapas Selection Round Facial 80 Pcs", 17500);
        daftarProduk[9] = new Produk("P010", "Hanasui Fix & Glow Setting Spray", 31300);
        System.out.println("═══════════════════════════════════ DAFTAR PRODUK ══════════════════════════════");
        for(int i = 0; i < daftarProduk.length; i++){
            daftarProduk[i].tampilkanProduk();
        }
        System.out.println("════════════════════════════════════════════════════════════════════════════════"); 
        System.out.println();
        System.out.println("═══════════════════════════════════ TRANSAKSI BARU ═════════════════════════════");
        System.out.println("Tanggal : 30 Maret 2026");
        System.out.println("Kasir   : Anggun");
        System.out.println("────────────────────────────────────────────────────────────────────────────────");
        int item1Qty = 1;
        double sumItem1 = item1Qty * daftarProduk[1].hargaProduk;
        System.out.printf("%-40s %2dx%,.0f  Rp %,13.0f%n", daftarProduk[1].namaProduk, item1Qty, daftarProduk[1].hargaProduk, sumItem1);
        int item2Qty = 2;
        double sumItem2 = item2Qty * daftarProduk[2].hargaProduk;
        System.out.printf("%-40s %2dx%,.0f  Rp %,13.0f%n", daftarProduk[2].namaProduk, item2Qty, daftarProduk[2].hargaProduk, sumItem2);
        int item3Qty = 3;
        double sumItem3 = item3Qty * daftarProduk[8].hargaProduk;
        System.out.printf("%-40s %2dx%,.0f  Rp %,13.0f%n", daftarProduk[8].namaProduk, item3Qty, daftarProduk[8].hargaProduk, sumItem3);
        System.out.println("────────────────────────────────────────────────────────────────────────────────");
        double total = sumItem1 + sumItem2 + sumItem3;
        System.out.printf("SUBTOTAL                                            Rp %,14.0f%n", total);
        System.out.println("────────────────────────────────────────────────────────────────────────────────");
        System.out.printf("TOTAL BAYAR                                         Rp %,14.0f%n", total);
        double cash = 400000;
        System.out.printf("CASH                                                Rp %,14.0f%n", cash);
        double kembalian = cash - total;
        System.out.printf("KEMBALIAN                                           Rp %,14.0f%n", kembalian);
        System.out.println("════════════════════════════════════════════════════════════════════════════════");
        System.out.println();
        System.out.println("                          Terima Kasih Sudah Berkunjung!");
        System.out.println("                               Sampai Jumpa Lagi :)");
    }
}
