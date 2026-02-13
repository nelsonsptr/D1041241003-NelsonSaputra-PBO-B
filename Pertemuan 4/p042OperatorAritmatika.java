public class p042OperatorAritmatika {
    /*
    Nama    : Nelson Saputra
    NIM     : D1041241003
    Kelas   : PBO B
    Tanggal : 13 Februari 2026
    */
   public static void main(String[] args) {
    int a = 10;
    int b = 3;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println();

    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("a / b = " + (a / b));
    System.out.println("a % b = " + (a % b));

    //Pembagian dengan desimal
    double hasil = (double) a / b;
    System.out.println("a / b (desimal) = " + hasil);
   }
}