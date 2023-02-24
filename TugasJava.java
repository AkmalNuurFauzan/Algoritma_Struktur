import java.text.DecimalFormat;
import java.util.Scanner;

public class TugasJava {
    static char operator;
    static double bil_1,bil_2,hasil;
    public static void main(String[] args) {
        // untuk menghilangkan angka 0 yang dibelakang titik desimal.
        DecimalFormat format = new DecimalFormat("0.##");
        // untuk mengimput value
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Bilangan 1 : ");
        bil_1 = sc.nextInt();

        System.out.print("input Operator (+,-,*,/,%) : ");
        operator = sc.next().charAt(0);

        System.out.print("Input Bilangan 2 : ");
        bil_2 = sc.nextInt();

        switch(operator) {
            // Operasi Pertambahan
            case '+' :
                hasil = bil_1 + bil_2;
                System.out.println("Output : Hasil pertambahan " + format.format(bil_1) + " dan " + format.format(bil_2) + " adalah " + format.format(hasil));
                break;
            // Operasi Pengurangan
            case '-' :
                hasil = bil_1 - bil_2;
                System.out.println("Output : Hasil pengurangan " + format.format(bil_1) + " dan " + format.format(bil_2) + " adalah " + format.format(hasil));
                break;
            // Operasi Perkalian
            case '*' :
                hasil = bil_1 * bil_2;
                System.out.println("Output : Hasil perkalian " + format.format(bil_1) + " dan " + format.format(bil_2) + " adalah " + format.format(hasil));
                break;
            // Operasi Pembagian
            case '/' :
                hasil = bil_1 / bil_2;
                System.out.println("Output : Hasil pembagian " + format.format(bil_1) + " dan " + format.format(bil_2) + " adalah " + format.format(hasil));
                break;
            // Operasi
            case '%' :
                hasil = bil_1 % bil_2;
                System.out.println("Output : Hasil modulus " + format.format(bil_1) + " dan " + format.format(bil_2) + " adalah " + format.format(hasil));
                break;
            default:
                System.out.println("Maaf inputan Anda Salah!!");
        }
        // Mengkonversikan hasil menjadi nilai
        if(hasil >= 85 && hasil <= 100){
            System.out.println("Nilai Anda adalah A ");
        } else if (hasil >= 75 && hasil < 85) {
            System.out.println("Nilai Anda adalah B ");
        } else if (hasil >= 65 && hasil < 75) {
            System.out.println("Nilai Anda adalah C ");
        } else if (hasil >= 55 && hasil < 65) {
            System.out.println("Nilai Anda adalah D ");
        } else if (hasil < 55) {
            System.out.println("Nilai Anda adalah E ");
        } else {
            System.out.println("Inputan Anda Salah ");
        }
        sc.close();
    }
}
