/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialsearch;

import java.util.Scanner;

/**
 *
 * @author ASUS GAMING PC
 */
public class latihanpraktikum4 {
    public static void main(String[] args) {
        Scanner mahal = new Scanner(System.in);
        String cari;
        System.out.println("Masukkan sebuah kata/kalimat: ");
        cari = mahal.nextLine();
        
        int a = 0;
        for(int i = 0; i < cari.length(); i++){
            if(cari.charAt(i) == 'a'){
                a++;
            }
        }
        System.out.println("Jumlah huruf a pada kalimat tersebut  adalah " +a);
    }
    
}
