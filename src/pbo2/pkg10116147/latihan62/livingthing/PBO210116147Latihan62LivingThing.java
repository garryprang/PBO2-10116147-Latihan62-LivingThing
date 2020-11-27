/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan62.livingthing;

/**
 *
 * @author
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM       : 10116147
 * Deskripsi : Program untuk menampilkan aktifitas seorang manusia.
 */
public class PBO210116147Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human human = new Human();
        human.setNama("Rizki Adam Kurniawan");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
