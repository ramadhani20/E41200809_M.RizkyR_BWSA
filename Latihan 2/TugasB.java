/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author DHANI
 */
public class TugasB {
 public static void main(String[] args) {
System.out.println("Tugas B:");
System.out.println();

System.out.println("jumlah angka yang ingin digunakan:");
Scanner sc = new Scanner(System.in);
int jumlah = sc.nextInt();

int[] ar1 = new int[jumlah];
for (int i = 0; i < ar1.length; i++){
    ar1[i] = (int) (Math.random() *50);
    System.out.print(ar1[i] + " ");
            
}
   System.out.println();
    
  }
}
