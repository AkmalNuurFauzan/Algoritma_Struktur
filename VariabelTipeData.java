
import java.util.Scanner;


public class VariabelTipeData {
    
    static String nama;
    static int nilai;
    static Integer sks;
    static final int biaya_sks = 100_000;
    static double total_diskon;
    static double diskon;
    
    public static void main(String[] args) {
        
        Scanner Isi = new Scanner(System.in);
        System.out.print("Isikan Nama : ");
        nama = Isi.nextLine();
        
        System.out.print("Isi Nilai : ");
        nilai = Isi.nextInt();
        
        System.out.print("Jumlah SKS : ");
        sks = Isi.nextInt();
        
        double total_biaya = sks * biaya_sks;
        
        if (total_biaya > 2_000_000){
            total_diskon = total_biaya - (total_biaya * 0.2);
            diskon = total_biaya * 0.2;
        }
        else if (total_biaya > 1_000_000){
            total_diskon = total_biaya - (total_biaya * 0.1);
            diskon = total_biaya * 0.1;
        }
        
        System.out.println("=========================");
        System.out.println("Nama Anda : " + nama);
        System.out.println("Nilai Anda : " + nilai);
        System.out.println("Total Biaya Keseluruhan : " + total_biaya);
        System.out.println("Jumlah Diskon : " + diskon);
        System.out.println("Total Bayar : " + total_diskon);
    }
    
}
