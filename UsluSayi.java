/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uslusayi;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;

public class UsluSayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        
        System.out.print("Taban Sayisini Giriniz:");
        int a=inp.nextInt();
        
        System.out.print("Us Sayisini Giriniz:");
        int b=inp.nextInt();
        
        int toplam=1;
        
        for(int i=1;i<=b;i++){
            toplam*=a;
        }
        
        System.out.println("Toplam:"+toplam);
    }
    
}
