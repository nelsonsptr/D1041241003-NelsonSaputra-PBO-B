package pertemuan15;

/*
    Nama    : Nelson Saputra
    NIM     : D1041241003
    Kelas   : PBO B
    Tanggal : 15 Maret 2026
*/

public class RefactoringKeEnhancedFor {
    public static void main(String[] args) {
        //Array satu dimensi berisi nama buah dengan tipe String
        String[] buah = {"Apel", "Jeruk", "Mangga", "Anggur"};
        //Refactoring dari for loop biasa menjadi enhanced for loop, kerjanya sama saja.
        for(String b : buah){
            System.out.println("Buah: " + b);
        }
    }
}
