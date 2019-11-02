/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan44.hukumohm;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program hukum ohm
 */
public class IF110118005Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====Hukum Ohm=====");
        Baterai bt1 = new Baterai();
        Baterai bt2 = new Baterai(3,12);
        System.out.println("Kuat Arus : " + bt2.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + bt2.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + bt2.hitungTegangan() + " volt");
    }
    
}
