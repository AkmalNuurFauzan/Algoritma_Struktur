
import java.util.Scanner;
public class TarifAntarKota {
    public static void main(String[] args) {
        String kota[][] = {
            {"Jakarta","Depok","Bogor","Sukabumi"},
            {"Cianjur","Bandung","Garut","Tasik"},
            {"Ciamis","Cilacap","Banyuwangi","Purwokerto"},
            {"Magelang","Jogja","Klaten","Solo"},
        };
        Scanner input = new Scanner(System.in);
        System.out.println("Isikan uang anda : ");
        int uang = input.nextInt();
        int tarif = 20_000;
        if(uang >= tarif){
            for(int i = 0; i < kota.length;i++){
                for(int j = 0; j < kota[i].length;j++){
                    if(i!=0 || j!= 0){
                        uang -= tarif;
                        if(uang < tarif){
                            System.out.println("Anda Sampai di: "+kota[i][j]);
                            break;
                        }
                    }
                }
                if(uang < tarif){
                    break;
                }
            }
            System.out.println("Sisa Uang anda : "+uang);
        }else{
            System.out.println("Uang anda tidak Cukup");
        }
    }
}
