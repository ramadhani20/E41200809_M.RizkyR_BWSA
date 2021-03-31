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
public class TugasB {
   Scanner in = new Scanner(System.in); 
   public void counter(){
       int hitung = 1;
       do {
        System.out.print (" " + hitung);
        hitung=(hitung*2);
       }
       while (hitung<=100);
       }
        public static void main(String[] args) {
            System.out.println("Bilangan Kelipatan 2 (1-100)");
            TugasB start = new TugasB();
            start.counter();
            System.out.println();
        }
       }

