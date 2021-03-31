/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author DHANI
 */
public class TugasC {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int i = 1;
        int nilai;
        double jumlah = 0;
        double rata = 0;
        int min = 100, max = 0;
        
        System.out.println("Masukkan banyaknya data nilai : ");
        nilai =in.nextInt();
        
        while (i <= nilai){
         int o = i + 1;
         int [] save = new int[o];
         
         System.out.print ("Masukkan data ke-" + i + " : ");
         save[i] = in.nextInt();
         jumlah =  save[i] + jumlah;
         if (save[i] > max){
             max= save[i];
         }
        if ((save [i] < min ) && (save[i]>=1)){
            min = save[i];
        }
        i++;
     }
        rata = jumlah / (i - 1);
        System.out.println("Nilai Minimum : " + min);
        System.out.println("Nilai Maksimum : " + max);
        System.out.println("Nilai rata-ratanya adalah : " + rata);
}
}