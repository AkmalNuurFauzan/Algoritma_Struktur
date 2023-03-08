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
public class Tugas3Algoritma {
    // Mengembalikan nilai true jika string adalah polindrome
    public static boolean Polindrome(String str){
        // Pointer menujuk awal dan akhir string
        int i = 0, j = str.length() - 1;
        
        // ketika ada karakter yang dibandingkan
        while(i < j){
            //jika karakter tidak sama
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            // increment untuk pointer pertama
            // dan decrement untuk yang lain
            i++;
            j--;
        }
        // memberikan string adalah polindrome
        return true;
    }
    // Method Utama
    public static void main(String[] args) {
        // untuk menginput value dengan output string
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String str = input.next();
        
        //mengganti string menjadi karakter kecil
        str = str.toLowerCase();
        if (Polindrome(str)) {
            System.out.println(str+": Palindrome");
        } else {
            System.out.println(str+": Bukan Palindrome");
        }
    }
}
