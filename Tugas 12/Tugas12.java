import java.util.Scanner;
/**
 *
 * @author User Akmal Nuur Fauzan TI22A_20220040060
 */
public class Tugas12 {
    public static void main(String[] args) {
        String[][] dataMahasiswa = {
             { "1102021", "Andri Hariadi", "BANDUNG" },
             { "1102022", "Dewi Lestari", "SURABAYA" },
             { "1102023", "Dewi Agustin", "MALANG" },
             { "1102024", "Reni Indrayanti", "MALANG" },
             { "1102025", "Toni Sukmawan", "SURABAYA" },
             { "1102026", "Toni Gunawan", "BANDUNG" }
        };
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String SearchName = input.nextLine();
        
        int position = SearchLinear(dataMahasiswa, dataMahasiswa.length, SearchName);
        System.out.println("===========");
        System.out.println("Hasil Pencarian: ");
        
        if(position != -1){
            int number = 1;
            for(int i = 0;i < dataMahasiswa.length;i++){
                if(dataMahasiswa[i][1].contains(SearchName)){
                    System.out.println(number + "." + dataMahasiswa[i][0] + "-" + dataMahasiswa[i][1] + "-" + dataMahasiswa[i][2] + "- Data Nomor " + (i+1));
                    number++;
                }
            }
        } else {
            System.out.println("Data yang anda cari tidak dapat ditemukan");
        }
    }
    public static int SearchLinear(String[][] data, int N, String X) {
        int position = -1;
        int J = 0;
        
        while(J < N){
            if(data[J][1].contains(X)){
                position = J;
                break;
            }
            J++;
        }
        return position;
    }
}
