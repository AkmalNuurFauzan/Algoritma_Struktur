import java.util.Scanner;

/**
 * @KeteranganFile Tugas Variabel dan Tipe Data_Sesi ke 2_Julhan Abdul Malik
 * @author ASUS
 */
public class Tugas2 {
    static double bilangan1, bilangan2, hasil;
    static char pilihan;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=================================================================");
        System.out.println("- Tugas Variabel dan Tipe Data - Sesi ke 2 - Akmal Nuur Fauzan -");
        System.out.println("-----------------------------------------------------------------");
        
        //Konversi Nilai dari Angka ke Huruf
        System.out.println("\n1. Konversi Nilai dari Angka ke Huruf");
        System.out.print("Masukan Nilai: ");
        int nilai = input.nextInt();
        String grade;
        
        if (nilai >= 85 && nilai <= 100) {
            grade = "A";  
        }
        else if (nilai >= 75 && nilai <= 84) {
            grade = "B";
        }
        else if (nilai >= 65 && nilai <= 74) {
            grade = "C";
        }
        else if (nilai >= 55 && nilai <= 64) {
            grade = "D";
        }
        else if (nilai <= 54) {
            grade = "E";
        }
        else {
            grade = "Maaf inputan anda Salah";
        }
        System.out.println("Nilai anda adalah: " + grade);
        System.out.println("---");
        
        // Operasi Aritmatika
        System.out.println("\n2. Operasi Aritmatika");
        System.out.print("Masukan bilangan pertama : ");
        bilangan1 = input.nextInt();       
        System.out.print("Masukan bilangan kedua   : ");
        bilangan2 = input.nextInt();
        
        System.out.println("\nPilihan Operasi Aritmatika");
        System.out.println("(+)Penjumlahan");
        System.out.println("(-)Pengurangan");
        System.out.println("(*)Perkalian");
        System.out.println("(/)Pembagian");
        System.out.println("(%)Modus");
        System.out.print("Pilihan anda: ");
        pilihan = input.next().charAt(0);
        
        String operator = null;
        
        switch (pilihan){
            case '+' -> {
                hasil = bilangan1 + bilangan2;
                operator = "Penjumlahan ";
            }
            case '-' -> {
                hasil = bilangan1 - bilangan2;
                operator = "Pengurangan ";
            }
            case '*' -> {
                hasil = bilangan1 * bilangan2;
                operator = "Perkalian ";
            }
            case '/' -> {
                hasil = bilangan1 / bilangan2;
                operator = "Pembagian ";
            }
            case '%' -> {
                hasil = bilangan1 % bilangan2;
                operator = "Modus ";
            }
            default -> System.out.println("Pilihan anda Salah, tolong dicoba kembali!");
        }
        System.out.println("\nHasil " + operator + bilangan1 + " dan " + bilangan2+ " adalah " + hasil);
        System.out.println("---");
        System.out.println("Semoga harimu menyenangkan - byJulhan");
    }
}