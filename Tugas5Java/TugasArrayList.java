/**
 *
 * @author Akmal Nuur Fauzan
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TugasArrayList {
    public static void main(String[] args) {
        ArrayList<String>dataKota = new ArrayList();
        dataKota.add("Sukabumi");
        dataKota.add("Cianjur");
        dataKota.add("Bandung");
        dataKota.add("Garut");
        dataKota.add("Tasik");
        dataKota.add("Ciamis");
        dataKota.add("Banjar");
        
        ArrayList<Integer>tarif = new ArrayList();
        tarif.add(10_000);
        tarif.add(15_000);
        tarif.add(7_500);
        tarif.add(5_000);
        tarif.add(7_500);
        tarif.add(6_000);
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Kota Keberangkatan : ");
        String berangkat = input.nextLine();
        
        while(!dataKota.contains(berangkat)){
            System.out.println("Kota berangkat tidak valid, mohon masukkan kembali:");
            berangkat = input.nextLine();
        }
        
        System.out.print("Masukkan Kota Tujuan : ");
        String tujuan = input.nextLine();
        
        while(!dataKota.contains(tujuan)){
            System.out.println("Kota tujuan tidak valid, mohon masukkan kembali:");
            tujuan = input.nextLine();
        }
        
        double total = 0;
        
        int berangkatIndex = dataKota.indexOf(berangkat);
        int tujuanIndex = dataKota.indexOf(tujuan);
        
        if(berangkatIndex < tujuanIndex){
            for(int i = berangkatIndex; i < tujuanIndex; i++){
                total += tarif.get(i);
            }
        } else{
            for(int i = berangkatIndex - 1; i >= tujuanIndex; i--){
                total += tarif.get(i);
            }
        }
        
        System.out.println("Apakah anda anggota TNI/POLRI? (Y/N)");
        String tentara = input.nextLine();
        
        while(!tentara.equalsIgnoreCase("Y") && !tentara.equalsIgnoreCase("N")){
            System.out.println("Masukkan Y untuk Ya atau N untuk Tidak:");
            tentara = input.nextLine();
        }
        
        if(berangkat.equalsIgnoreCase("Sukabumi") && tujuan.equalsIgnoreCase("Banjar") || berangkat.equalsIgnoreCase("Banjar") && tujuan.equalsIgnoreCase("Sukabumi")){
            total *= 0.95;
        }
        if(tentara.equalsIgnoreCase("Y")){
            total *= 0.9;
        }
        System.out.println("Total tarif : Rp."+total);
    }
}
