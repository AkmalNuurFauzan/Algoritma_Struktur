/*
Nama    : Akmal Nuur Fauzan
Kelas   : TI22A
NIM     : 20220040060
*/
import java.util.Scanner;

public class Playlist{
    static final int MAX_SIZE = 10;
    static String[] playlist = new String[MAX_SIZE];
    static int top = -1;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do{
            System.out.println("\nMenu Playlist:");
            System.out.println("1. Tampilkan Data Playlist");
            System.out.println("2. Tambah Data Playlist");
            System.out.println("3. Hapus Data Playlist");
            System.out.println("4. Tambah Data Playlist di urutan tertentu");
            System.out.println("5. Hapus Data Playlist di urutan tertentu");
            System.out.println("6. Hapus semua Playlist");
            System.out.println("0. Keluar");
            System.out.println("============================================");

            System.out.print("Masukkan pilihan Anda: ");
            choice = scanner.nextInt();
            
            switch(choice){
                case 1:
                    displayPlaylist();
                    break;
                case 2:
                    System.out.print("Masukkan judul lagu baru: ");
                    String title = scanner.next();
                    addSong(title);
                    break;
                case 3:
                    removeSong();
                    break;
                case 4:
                    addSongAt();
                    break;
                case 5:
                    removeSongAt();
                    break;
                case 6:
                    removeAllSongs();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silahkan coba lagi");
            }
        }while(choice != 0);
        
        scanner.close();
    }
    public static void displayPlaylist(){
        if((top == -1)){
            System.out.println("Playlist Kosong");
        }else{
            System.out.println("Playlist anda:");
            for(int i = top; i  >= 0;i--){
                System.out.println((top - i + 1)+". "+playlist[i]);
            }
        }
    }
    
    public static void addSong(String title){
        if(top == MAX_SIZE - 1){
            System.out.println("Playlist penuh, tidak dapat ditambahkan lagu");
        }else{
            top++;
            playlist[top] = title;
            System.out.println("Lagu \""+title+"\" berhasil ditambahkan di playlist");
        }
    }
    
    public static void removeSong(){
        if(top == -1){
            System.out.println("Playlist kosong, tidak ada lagu yang dihapus");
        }else{
            System.out.println("Lagu \""+playlist[top]+"\" telah dihapus dari playlist");
            top--;
        }
    }
    
    public static void addSongAt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan judul lagu: ");
        String title = sc.nextLine();
        System.out.print("Masukkan urutan lagu (1-"+(top+1)+ "): ");
        int index = sc.nextInt() - 1;
        sc.nextLine();
        if(index < 0 || index > top+1){
            System.out.println("Urutam lagi tidak valid!");
            return;
        }
        for(int i = top; i >= index; i--){
            playlist[i+1] = playlist[i];
        }
        playlist[index] = title;
        top++;
        System.out.println("Lagu berhasil ditambahkan!");
    }
    
    public static void removeSongAt(){
        if(top == -1){
            System.out.println("Playlist kosong!");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan urutan lagu yang akan dihapus (1-"+(top+1)+"}: ");
        int index = sc.nextInt()-1;
        if(index < 0 || index > top){
            System.out.println("Urutan lagu tidak valid!");
            return;
        }
        for(int i = index; i < top; i++){
            playlist[i] = playlist[i+1];
        }
        top--;
        System.out.println("Lagu berhasil dihapus!");
    }
    public static void removeAllSongs(){
        playlist = new String[MAX_SIZE];
        top = -1;
        System.out.println("Semua lagu berhasil di hapus!");
    }
}