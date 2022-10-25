/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arakhel.bola;

/**
 *
 * @author nicoe
 */
public class BolaMain {
    public static void main(String[] args) {
        Bola b1=new Bola("Bola Basket", 10, 
                2, "Coklat");
//        double volumeB1= b1.hitungVolume();
        System.out.println("Volume = "+b1.getVolume());
//        double luasB1 = b1.hitungLuasPermukaan();
        System.out.println("Luas = "+b1.getLuas());
    }
}
