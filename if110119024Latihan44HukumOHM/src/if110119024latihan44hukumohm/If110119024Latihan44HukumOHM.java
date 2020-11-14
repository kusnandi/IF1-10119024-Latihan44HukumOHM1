/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110119024latihan44hukumohm;

/**
 *
 * @author acer
 * KUSNANDI PIRMANSYAH
 * IF-1
 * 10119024
 */
public class If110119024Latihan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai batt = new Baterai();
        Baterai batt1 = new Baterai(3, 12);
        System.out.println("Kuat Arus : " + batt1.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + batt1.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + batt1.hitungTegangan() + "volt");
    }
    
}
