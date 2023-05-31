import java.util.Arrays;

/**
 * @KeteranganFile Tugas Selection Sort_Sesi ke 11
 * @author Akmal Nuur Fauzan
 */
public class Tugas11 {
    static int data[] = {20, 25, 22, 13, 80, 34, 90, 100, 95, 70};
    
    static int value_1 [] = {55, 15, 85, 25, 90, 35};
    static int value_2 [] = {10, 20, 30, 40, 25, 15, 5};
    
    static int min = data[0];
    static int index = 0;
    static int jumlahSwap = 0;
    
    public static void main(String[] args) {      
        System.out.println("Proses Swap ASC dari value 1:");
        goSort(value_1, "ASC");
        
        System.out.println("\nHasil dari Selection Sort:");
        tampilkanData(value_1);
        
        System.out.println("\nSwap yang dilakukan sebanyak: " + jumlahSwap + " Kali");
        
        System.out.println("\nProses Swap DESC dari value 1:");
        goSort(value_1, "DESC");
        
        System.out.println("\nHasil dari Selection Sort:");
        tampilkanData(value_1);
        
        System.out.println("\nSwap yang dilakukan sebanyak: " + jumlahSwap + " Kali");
        
        System.out.println("\nProses Swap ASC dari value 2:");
        goSort(value_2, "ASC");
        
        System.out.println("\nHasil dari Selection Sort:");
        tampilkanData(value_2);
        
        System.out.println("\nSwap yang dilakukan sebanyak: " + jumlahSwap + " Kali");
        
        System.out.println("\nProses swap DESC dari value 2:");
        goSort(value_2, "DESC");
        
        System.out.println("\nHasil dari Selection Sort:");
        tampilkanData(value_2);
         
        System.out.println("\nSwap yang dilakukan sebanyak: " + jumlahSwap + " Kali");
    }
    
    static void goSort(int[] nilai, String opsi){
        for (int j = 0; j < nilai.length-1 ; j++) {
            for (int i = j; i < nilai.length; i++) {
                if (opsi.equals("ASC")) {
                    if (nilai[i] < min) {
                        min = nilai[i];
                        index = i;
                    } 
                }
                else if(opsi.equals("DESC")){
                    if (nilai[i] > min) {
                        min = nilai[i];
                        index = i;
                    } 
                }
            }
            
            if (opsi.equals("ASC")) {
                if (min < nilai[j]) {
                    nilai[index] = nilai[j];
                    nilai[j] = min;
                    jumlahSwap++;
                }
            }
            else if (opsi.equals("DESC")) {
                if (min > nilai[j]) {
                    nilai[index] = nilai[j];
                    nilai[j] = min;
                    jumlahSwap++;
                }
            }
            min = nilai[j+1];

            System.out.println(Arrays.toString(nilai));
        }
    }
    
    static void tampilkanData(int[] nilai2) {
        for (int i = 0; i < nilai2.length; i++) {
            System.out.print(nilai2[i] + " - ");
        }
        System.out.println("");
    }
}