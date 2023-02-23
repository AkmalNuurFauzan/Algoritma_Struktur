
import javax.swing.JOptionPane;

public class Switch {
    
    static String prodi;
    
    public static void main(String[] args) {
        
        prodi = JOptionPane.showInputDialog("Isikan Jurusan").toUpperCase();
        switch(prodi){
            case "TI" :
                JOptionPane.showMessageDialog(null,"Teknik Informatika");
                break;
            case "TE" :
                JOptionPane.showMessageDialog(null,"Teknik Elektro");
                break;
            case "TM" :
                JOptionPane.showMessageDialog(null,"Teknik Mesin");
                break;
            case "TS" :
                JOptionPane.showMessageDialog(null, "Teknik Sipil");
                break;
            default :
                JOptionPane.showMessageDialog(null, "Maaf Input Anda Salah!!");
                
        }
    }
    
}
