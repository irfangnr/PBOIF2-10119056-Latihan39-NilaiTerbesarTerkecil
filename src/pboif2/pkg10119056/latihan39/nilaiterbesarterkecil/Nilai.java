/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan39.nilaiterbesarterkecil;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Nilai{
        Scanner masukan=new Scanner(System.in);
        public int min;
        public int max;
        
        public int nilaiMahasiswa(){
            System.out.print("Masukan Banyaknya Nilai Mahasiswa: ");
            int n=masukan.nextInt();
            int arr[]=new int[n]; 
               for(int i=0; i<n; i++){
               System.out.print("Masukan Nilai Mahasiswa Ke-"+(i+1)+" = ");
               arr[i]=masukan.nextInt();
               }
               min=arr[0];
               max=arr[0];
               for(int i=0; i<n; i++){
                 if(min>arr[i]){
                   min=arr[i];
                 }

                 if(max<arr[i]){
                   max=arr[i];  
                 }
               }
                return 0;
            }
}
