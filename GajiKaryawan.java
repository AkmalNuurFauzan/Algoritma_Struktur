
import java.util.Scanner;

public class GajiKaryawan {
    
    static String nama;
    static String golGaji;
    static Integer JumlahAnak;
    static Integer lembur;
    static int totalGaji;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama : ");
        nama = sc.nextLine();
        
        System.out.print("Golongan Gaji : ");
        golGaji = sc.nextLine();
        
        System.out.print("Jumlah Anak : ");
        JumlahAnak = sc.nextInt();
        System.out.print("Lembur : ");
    }
}
