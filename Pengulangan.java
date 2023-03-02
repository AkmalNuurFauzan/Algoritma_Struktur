/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author umum
 */
public class Pengulangan {
    public static void main(String[] args) {
//        for(int i=1;i<=10;i++){
//            System.out.println("Nilai i : "+i);
//        }
//          for(int i=10;i<=100;i=i+10){
//            System.out.println("Nilai i : "+i);
//        }
//          for(int i=10;i>0;i--){
//            System.out.println("Nilai i : "+i);
//        }
//          for(int i=1;i<=10;i++){
//            System.out.println("Nilai i : "+(11-i));
//        }
            //1 -2 3 -4 5 -6 7 -8 9 -10
//          for(int i=1;i<=10;i++){
//              if(i%2==0){
//                  System.out.print(-i + " ");
//              } else{
//                  System.out.print(i+ " ");
//              }
//        }
//          int sign = 1;
//          for(int i = 1; i <= 10; i++){
//              int result = i * sign;
//              System.out.print(result+" ");
//              sign *= -1;
//          }
            //Faktorial
//          int bil = 4;
//          int result = 1;
//          for(int i = 1; i <= bil; i++){
//              result *= i;
//          }
//          System.out.println("\nFaktorial "+ bil+" = "+result);
            int angka = 11;
//            int jumlah = 0;
            boolean isPrime = true;
            for (int i = 2;i< angka;i++){
                if(angka % i ==0){
                    isPrime = false;
                    break;
                }
            }
                
                if(isPrime){
                    System.out.println(angka + " Adalah Prima");
                }else{
                    System.out.println(angka+" Bukan Prima");
                }
            }
            
    }

