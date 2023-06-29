import java.util.Scanner;
import java.util.Arrays;

public class Tugas13 {
    static String[] kamusInggris = {
        "programming", "algorithm", "computer", "network"};
    static String[] kamusIndonesia = {
        "pemrograman", "algoritma", "komputer", "jaringan"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("================");
        System.out.println("- Kamus Bahasa -");
        System.out.println("----------------");
        
        System.out.print("Masukan kata yang mau di terjemahkan: ");
        String kata = input.nextLine().toLowerCase();

        System.out.println("\n=== === Menu === ===");
        System.out.println("1. Bahasa Inggris ke Bahasa Indonesia");
        System.out.println("2. Bahasa Indonesia ke Bahasa Inggris");
        
        System.out.print("Masukan Angka Pilihan: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            String terjemahan = cariTerjemahan(kata, kamusInggris, kamusIndonesia);
            System.out.println("\n=== Menu -> Bahasa Inggris ke Bahasa Indonesia ===");
            
            if (terjemahan != null) {
                System.out.println("Terjemah dari \"" + kata + "\" adalah \"" + terjemahan + "\"");
                System.out.println("");
            } else {
                System.out.println("Kata \"" + kata + "\" tidak ditemukan dalam kamus\n");
            }
        }
        else if (pilihan == 2) {
            String terjemahan = cariTerjemahan(kata, kamusIndonesia, kamusInggris);
            System.out.println("\n=== Menu -> Bahasa Indonesia ke Bahasa Inggris ===");
            
            if (terjemahan != null) {
                System.out.println("Terjemah dari \"" + kata + "\" adalah \"" + terjemahan + "\"");
                System.out.println("");
            } else {
                System.out.println("Kata \"" + kata + "\" tidak ditemukan dalam kamus\n");
            }
        }
        else {
            System.out.println("Pilihan tidak ada");
        }
    }

    static String cariTerjemahan(String kata, String[] kamusAsal, String[] kamusTerjemahan) {
        int low = 0;
        int high = kamusAsal.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            String kataPivot = kamusAsal[mid];

            if (kataPivot.equals(kata)) {
                return kamusTerjemahan[mid];
            } else if (kata.compareTo(kataPivot) < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }
}