/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*


*/
/**
 *
 * @author Akmal Nuur Fauzan
 */
public class Tugas4 {
    public static void main(String[] args) {
        char hotel[][] = {
            {'*','*','*','X','*'},
            {'*','*','*','*','*'},
            {'*','X','*','*','*'},
            {'*','*','*','*','X'}
        };
        char kosong = '*';
        int count = 0;
        for(int lantai = 0;lantai < hotel.length;lantai++){
            for(int kamar = 0; kamar < hotel[lantai].length;kamar++){
//                for(int lantaiAkhir = hotel[hotel.length-1][0];lantaiAkhir>0;lantaiAkhir--){
                    if(hotel[lantai][kamar] == 'X'){
                        System.out.println("Tamu berada di Lantai "+ (lantai+1) /* atau (lantai-4) */ +" Kamar "+ (kamar+1));
                    }
                    if(hotel[lantai][kamar] == kosong){
                        count++;
                    }
                }
//            }
        }
        System.out.println("Jumlah kamar yang tersedia adalah "+count+" kamar");
    }    
}
