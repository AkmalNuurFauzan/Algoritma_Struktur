/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9;
/**
 *
 * @author User
 */
public class LinkedList {
        Simpul pertama =null,posisi,pendahulu;
        public void isiData(String nim, String nama, int nilai){
        Simpul ptrBaru = new Simpul(nim,nama,nilai);
        ptrBaru.berikutnya = pertama;
        pertama = ptrBaru;
    }

    public void Tampilkan(){
        System.out.println("Isi Linked List");
        Simpul penunjuk = pertama;
        while(penunjuk != null){
        penunjuk.infoData();
        System.out.println(penunjuk.berikutnya);
        penunjuk = penunjuk.berikutnya;
        }
    }

    public boolean findData(String x){
        posisi = pertama;
        pendahulu = null;
        boolean ditemukan = false;
        while(posisi !=null){
        String nama = posisi.nama;
        if(nama.compareTo(x)==0){
        ditemukan = true;
        break;
        }
        pendahulu = posisi;
        posisi = posisi.berikutnya;
        }
    return ditemukan;
    }

    public boolean hapusData(String x){
        pendahulu = null;
        posisi = null;
        boolean ditemukan = findData(x);
        if(!ditemukan){
            System.out.println("Data yang akan dihapus tidak ditemukan");
            return false;
        }
        if(pendahulu==null){
        pertama = pertama.berikutnya;
    }
    else{
        pendahulu.berikutnya = posisi.berikutnya;
    }
    return true;
    }
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.isiData("123", "irwan", 100);
        ls.Tampilkan();
        ls.hapusData("irwan");
        ls.Tampilkan();
    }
}


