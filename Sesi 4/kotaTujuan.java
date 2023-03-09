
import java.util.Scanner;
public class kotaTujuan {
    public static void main(String[] args) {
        String kota[][] = {
            {"Jakarta","Depok","Bogor","Sukabumi"},
            {"Cianjur","Bandung","Garut","Tasik"},
            {"Ciamis","Cilacap","Banyuwangi","Purwokerto"},
            {"Magelang","Jogja","Klaten","Solo"},
        };
        Scanner input = new Scanner(System.in);
        System.out.print("Isikan kota asal : ");
        String kota_asal = input.nextLine();
        System.out.print("Isikan kota tujuan : ");
        String kota_tujuan = input.nextLine();
        int tarif = 20_000;
        int count = 0;
        boolean start = false;
        boolean stop = false;
            for(int i = 0; i < kota.length;i++){
                for(int j = 0; j < kota[i].length;j++){
                    if(kota[i][j].equalsIgnoreCase((kota_asal))){
                        start = true;
                        stop = false;
                    }
                    if(kota[i][j].equalsIgnoreCase(kota_tujuan)){
                        start = false;
                        stop = true;
                    }
                    if(start){
                        count++;
                    }
                }
            }
            int biaya = count * tarif;
            System.out.println("Biaya anda : "+biaya);
        }
    }

