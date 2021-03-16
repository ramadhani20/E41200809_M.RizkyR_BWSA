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
public class Person {
    String fName , IName , stuld , stuStatus;

    public Person(String fName, String IName, String stuld, String stuStatus) {
        this.fName = fName;
        this.IName = IName;
        this.stuld = stuld;
        this.stuStatus = stuStatus;
    }

    public String getfName() {
        return fName;
    }

    public String getIName() {
        return IName;
    }

    public String getStuld() {
        return stuld;
    }

    public String getStuStatus() {
        return stuStatus;
    }

     public static void main(String[] args) {
      
       Person p1 = new Person ("Mohammad Rizky" ,"Ramadhani" ,  "E41200809" , "active");
       System.out.print (p1.getfName()+ " ");
       System.out.println (p1.getIName());
       System.out.println (p1.getStuld());
       System.out.println (p1.getStuStatus());
    }
}
