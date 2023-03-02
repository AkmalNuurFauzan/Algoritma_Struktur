
import java.util.Scanner;


public class ReverseWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Isikan Kalimat : ");
        
        String words = input.nextLine();
        String result = "";
        for(int i=0;i<words.length();i++){
            char alphabet = words.charAt(i);
            result = alphabet + result;
            
        }
        System.out.println(result);
    }
}
