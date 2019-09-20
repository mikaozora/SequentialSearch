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
public class tugaspraktikum1 {
    public static void main(String[] args) {
        int cari;
        
        int data[] = new int[]{74,98,72,74,72,90,81,72};
        Scanner mahal = new Scanner(System.in);
        System.out.println("Data pada array");
        for(int i = 0; i < data.length; i++ ){
            System.out.print(data[i] +"\t");
             
        } 
        System.out.print("\n Masukkan nilai yang dicari : ");
        cari = mahal.nextInt();
        
        int a = 0;
        for(int i = 0; i < data.length; i++){
            if(cari == data[i]){
                a++;
            }
        }
        System.out.println("Data yang di cari ditemukan sebanyak " + a + " kali");
        if(a == 0){
            System.out.println("Data tidak ditemukan");
            
        }
    }
}
