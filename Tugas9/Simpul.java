/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9;
/**
 *
 * @author User
 */
public class Simpul {
    static String nim, nama;
    static int nilai;
    static Simpul berikutnya;

    public Simpul(String xnim, String xnama, int xnilai){
        nim = xnim;
        nama = xnama;
        nilai = xnilai;
        berikutnya = null;
    }

    public void infoData(){
        System.out.println("NIM : " + nim);
        System.out.println("NAMA : " + nama);
        System.out.println("NILAI : " + nilai);
        System.out.println("Pointer Next " + berikutnya);
        System.out.println("---------------------------------");
    }
 }

