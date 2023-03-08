/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_algoritmastruktur;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PolindromeAngka {
    // function untuk memeriksa Polindrome
    public static boolean isPolindrome(String s){
        int kiri = 0;
        int kanan = s.length() - 1;
        
        while (kiri < kanan){
            if (s.charAt(kiri) != s.charAt(kanan)){
                return false;
            }
            kiri++;
            kanan--;
        }
        return true;
    }
    // Function mengembalikan nilai number terdekat polindrome
    public static void closestPolindrome(int num) {
        // bilangan polindrome terbesar yang lebih kecil dari angka yang diberikan
        int Pnum = num - 1;
        
        while(isPolindrome(Integer.toString(Pnum)) == false){
            Pnum--;
        }
        // bilangan poindrome terkecil yang lebih besar dari angka yang diberikan
        int Snum = num + 1;
        
        while(isPolindrome(Integer.toString(Snum)) == false){
            Snum++;
        }
        
        // memeriksa perbedaan yang absolut
        if(Math.abs(num - Snum) > Math.abs(num - Pnum)){
            System.out.print("Output : "+Snum);
        } else{
            System.out.print("Output : "+Pnum);
        }
    }
    // code yang dijalankan
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input : ");
        int n = input.nextInt();
        
        closestPolindrome(n );
    }
}
