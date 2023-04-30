import java.util.Scanner;

/**
 * @KeteranganFile Tugas Queue_Sesi ke 7_Akmal Nuur Fauzan
 * @author Akmal Nuur Fauzan
 */
public class QueueArray {
    static int maksElemen = 10;
    static String [] antrian = new String[maksElemen];
    static int palingDepan = 0;

    public static void MenuInfo(){
        System.out.println("\n=========================");
        System.out.println("- Antrian Bank Mangkiri -");
        System.out.println("-------------------------");

        if (palingDepan == 0) {
            System.out.println("Tidak ada pelanggan");
        } else {
            for (int i = 0; i < palingDepan; i++) {
                System.out.println((i+1) + ". " + antrian[i]);
            }
        }
    }
    
    public static void tambahPelanggan(){
        Scanner input2 = new Scanner(System.in);
        int i = 0;
        System.out.println("\n=== Menu -> Tambah Data Antrian ===");
        String repeat = "y";
        
        while(repeat.equalsIgnoreCase("y") && i < antrian.length){
            if (palingDepan == antrian.length) {
                System.out.println("Antrian sudah penuh!");
            } else {
                System.out.print("Masukkan nama pelanggan: ");
                String nama = input2.nextLine();
                antrian[palingDepan] = nama;
                palingDepan++;
                System.out.println("Pelanggan '" + nama + "' berhasil ditambahkan");

                if (i < antrian.length) {
                    System.out.print("\nApakah anda ingin menambah data lagi (y/n)? ");
                    repeat = input2.nextLine();
                } else {
                    System.out.println("Antrian sudah penuh!");
                }
            }
        }
    }
    
    public static void hapusAntrian(){
        System.out.println("\n=== Menu -> Hapus Antrian Elemen Pertama ===");
        
        if (palingDepan == 0) {
            System.out.println("Tidak ada antrian");
        } else {
            System.out.println("Pelanggan '" + antrian[0] + "' berhasil dihapus");
            shiftQueue();
            palingDepan--;
        }
    }
    
    public static void shiftQueue() {
        for (int i = 0; i < palingDepan-1; i++) {
            antrian[i] = antrian[i+1];
        }
        antrian[palingDepan-1] = null;
    }
    
    public static void hapusAntrian_noUrut(){
        Scanner input3 = new Scanner(System.in);
        System.out.println("\n=== Menu -> Hapus Antrian di Posisi Tertentu ===");
        
        if (palingDepan == 0) {
            System.out.println("Tidak ada antrian");
        } else {
            System.out.print("Masukkan posisi antrian: ");
            int position = input3.nextInt();
            if (position < 1 || position > palingDepan) {
                System.out.println("Posisi antrian tidak valid!");
            } else {
                System.out.println("Pelanggan '" + antrian[position-1] + "' berhasil dihapus");
                for (int i = position-1; i < palingDepan-1; i++) {
                    antrian[i] = antrian[i+1];
                }
                antrian[palingDepan-1] = null;
                palingDepan--;
            }
        }
    }
    
    public static void hapusSemuaAntrian(){
        System.out.println("\n=== Menu -> Hapus Semua Elemen ===");
        
        if (palingDepan == 0) {
            System.out.println("Tidak ada antrian");
        } else {
            for (int i = 0; i < palingDepan; i++) {
                antrian[i] = null;
            }
            palingDepan = 0;
            System.out.println("Semua Elemen antrian telah berhasil dihapus");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MenuInfo();
        int angkaPilihan;
        
        do {
            System.out.println("\n====== Menu Antrian di Bank Mangkiri ======");
            System.out.println("1.Tambah Data Antrian\n"
                    + "2.Hapus Antrian Elemen Pertama\n"
                    + "3.Hapus Antrian di Posisi Tertentu\n"
                    + "4.Hapus Semua Elemen\n"
                    + "5.Tampilkan Data\n"
                    + "0.Keluar\n");

            System.out.print("Masukan pilihan Anda: ");
            angkaPilihan = input.nextInt();

            switch(angkaPilihan){
                case 1:
                    tambahPelanggan();
                    MenuInfo();
                    break;
                case 2:
                    hapusAntrian();
                    MenuInfo();
                    break;
                case 3:
                    hapusAntrian_noUrut();
                    MenuInfo();
                    break;
                case 4:
                    hapusSemuaAntrian();
                    MenuInfo();
                    break;
                case 5:
                    MenuInfo();
                    break;
                case 0:
                    System.out.println("Terima kasih ...");
                    break;
                default:
                    System.out.println("Maaf pilihan anda salah coba lagi!");
            }
        } while (angkaPilihan != 0);
    }
}