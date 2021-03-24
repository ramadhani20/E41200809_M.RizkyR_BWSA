/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author DHANI
 */
import java.util.Scanner;
public class TugasD {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int harga1, harga2, harga3, harga4, harga5, total =0;
        String nama;
        
        System.out.println("=========================");
        System.out.println("Kharisma Agung Plaza (KAP) ");
        System.out.println("Promo Belanja Berhadiah");
        System.out.println("Khusus Permbelian 5 Barang Pertama");
        System.out.println("=========================");
        System.out.println();
        
        System.out.println("=========================");
        System.out.println("Masukkan Nama Pembeli : ");
        nama = input.nextLine();
        
        System.out.println("Masukkan Harga Barang Ke-1 : Rp ");
        harga1 = input.nextInt();
        System.out.println("Masukkan Harga Barang Ke-2 : Rp ");
        harga2 = input.nextInt();
        System.out.println("Masukkan Harga Barang Ke-3 : Rp ");
        harga3 = input.nextInt();
        System.out.println("Masukkan Harga Barang Ke-4 : Rp ");
        harga4 = input.nextInt();
        System.out.println("Masukkan Harga Barang Ke-5 : Rp ");
        harga5 = input.nextInt();
        
        total = harga1 + harga2 + harga3 + harga4 + harga5;
        System.out.println("Total Harga Pembelian Atas Nama " + nama + " Adalah " + total);
        System.out.println("Selamat.....");
        System.out.println("Anda Mendapatkan hadiah 1 buah mug cantik ");
        System.out.println("=========================");
        
        System.out.println("Terima Kasih");
        System.out.println("Anda Sudah Belanja di Agung Plaza");
    }
}

       

