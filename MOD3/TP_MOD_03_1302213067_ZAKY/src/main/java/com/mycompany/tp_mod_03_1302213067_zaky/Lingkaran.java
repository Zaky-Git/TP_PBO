/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_mod_03_1302213067_zaky;

/**
 *
 * @author mzaky
 */
public class Lingkaran {
    String Warna;
    double jariJari;
    
    void printWarna_1302213067(){
        System.out.println("Warna objek lingkaran adalah " + this.Warna);
    }
    
    void printKeliling_1302213067(){
        System.out.println("Keliling objek lingkaran adalah " + ((2 * Math.PI) * this.jariJari));
    }
    
    void printLuas_1302213067(){
        
        System.out.println("Luas objek lingkaran adalah " + (Math.PI * (Math.pow(this.jariJari, 2)) ));
    }
}
