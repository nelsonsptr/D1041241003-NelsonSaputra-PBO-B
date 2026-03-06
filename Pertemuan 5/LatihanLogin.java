package pertemuan5;

/*
    Nama : Nelson Saputra
    NIM : D1041241003
    Kelas : PBO B
    Tanggal : 6 Maret 2026
*/

public class LatihanLogin {
    public static void main(String[] args) {
        //Deklarasi variabel username dan password
        String inputUsername = "admin";
        String inputPassword = "admin123";
        System.out.println("=== VALIDASI LOGIN ===");
        System.out.println("Username: admin");
        System.out.println("Password: ****");
        System.out.println("---");
        //Memeriksa username
        if(inputUsername.equals("admin")){
            System.out.println("Username valid");
            //Memeriksa password
            if(inputPassword.equals("admin13")){
                System.out.println("Password benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("Selamat datang, admin");
            } else {
                System.out.println("Password salah");
                System.out.println("LOGIN GAGAL!");
            }
        }
    }
}
