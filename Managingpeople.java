/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managingpeople;

/**
 *
 * @author DHANI
 */
public class Managingpeople {

    public static void main(String[] args) {
     Person p1 = new Person ("Mohammad Rizky","Ramadhani","E41200809","Active");
     
     if (p1.getStuStatus().equals("Active")){
         System.out.println(p1.getfName() + " Adalah mahasiswa Aktif");
     }
    }
    
}
