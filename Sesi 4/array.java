/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umum
 */
public class array {
    public static void main(String[] args) {
        int nilai[] = {90,80,70,80,50,60,120};
        // Mengakses angka 70
        System.out.println("Nilai Index ke 2 ialah "+nilai[2]);
        nilai[4]=100;
        System.out.println("Nilai index ke 4 ialah "+nilai[4]);
        int p = nilai.length;
        System.out.println("Nilai index terakhir ialah "+nilai[p-1]);
        for(int i=0;i<p;i++){
            System.out.println("Nilai Mahasiswa ke "+(i+1)+" : "+nilai[i]);
        }
        
        //Rata" nilai -> Jumlah data/banyak data
        
        int total =0;
        for(int i=0;i<p;i++){total+=nilai[i];}
        double rata= total/p;
        System.out.println("Nilai Rata-rata : " + rata);
    }
}
