/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umum
 */
public class chess {
    public static void main(String[] args) {
        char chess[][] = {
            {'*','*','B','*','*'},
            {'R','*','*','*','*'},
            {'*','*','*','*','*'},
            {'*','*','*','*','*'},
            {'*','*','*','*','*'}
        };
        int barisBenteng=-1;
        int kolomBenteng=-1;
        int barisRaja=-1;
        int kolomRaja=-1;
        for(int baris=0;baris<chess.length;baris++){
            for(int kolom = 0; kolom<chess[baris].length;kolom++){
                if(chess[baris][kolom] == 'B'){
                    barisBenteng = baris;
                    kolomBenteng = kolom;
                }
                if(chess[baris][kolom] == 'R'){
                    barisRaja = baris;
                    kolomRaja = kolom;
                }
            }
            
            }
            if(barisBenteng == barisRaja){
                System.out.println("Skak!");
            }
            if(kolomBenteng == kolomRaja){
                System.out.println("Skak!");
        }
    }
}
