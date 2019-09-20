/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialsearch;

/**
 *
 * @author ASUS GAMING PC
 */
public class tugaspraktikum2 {
    public static void main(String[] args) {
        
        int data[] = new int[]{83,76,45,90,85,80,78,74};
        System.out.println("Data pada array");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + "\t");
            
        }
        double ratarata = 0;
        for(int a = 0; a < data.length; a++)ratarata+=data[a];
        ratarata/=data.length;
        System.out.println("\n Rata-rata nilai array = " + ratarata);
        System.out.print("Nilai yang di atas rata-rata adalah : ");
        for(int  j = 0; j < data.length; j++){
            if(data[j] > ratarata){
                
                
                
                System.out.print(data[j] + "\t");
            }
        }

    }
}
