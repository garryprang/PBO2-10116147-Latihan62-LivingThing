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
public abstract class LivingThing {
    
    public abstract void walk(String nama);
    
    public void breath(String nama) {
        System.out.println(nama + " bernafas.");
    }
    
    public void eat(String nama) {
        System.out.println(nama + " makan.");
    }
}