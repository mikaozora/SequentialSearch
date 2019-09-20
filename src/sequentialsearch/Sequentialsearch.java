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
public class Sequentialsearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cari;
        boolean found = false;
        int[] data = new int[]{29,4,10,94,96};
        Scanner mahal = new Scanner(System.in);
        System.out.print("Masukkan data yang ingin dicari : ");
        cari = mahal.nextInt();
        for(int i = 0; i < data.length;i++){
            if(cari == data[i]){
                found = true;
                break;
            }
        }
        if(found == true){
            System.out.println("Data ditemukan ");
        }else{
            System.out.println("Data tidak ditemukan");
        }
        
    }
    
}
