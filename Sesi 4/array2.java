/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umum
 */
public class array2 {
    public static void main(String[] args) {
        int nilai[][]= {
            {10,20,30},
            {40,50,60},
            {70,80,90,100,110}
        };
        System.out.println(nilai.length);
        System.out.println(nilai[1][2]);
        
        for(int baris=0;baris<nilai.length;baris++){
            for(int kolom=0;kolom<nilai[baris].length;kolom++){
                System.out.print(nilai[baris][kolom]+"  ");
        }
            System.out.println();
    }
        int matriks [][] = new int[10][10];
        
        for(int i = 0;i<matriks.length;i++){
            for(int j=0;j<matriks[i].length;j++){
                if(i==j){
                    matriks[i][j] = 1;
                }
                else{
                    matriks[i][j] = 0;
                }
                System.out.print(matriks[i][j]+" ");
            }
            System.out.println();
        }
  }
}
