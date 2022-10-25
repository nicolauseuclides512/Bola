/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arakhel.bola;

import java.util.Scanner;

/**
 *
 * @author nicoe
 */
public class BolaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bola b1=new Bola("Bola Basket", 10, 
                2, "Coklat");
        Bola b2=new Bola();
        b2.setNama(sc.next());
        b2.setWarna(sc.next());
        b2.setJariJari(5);
        b2.setBerat(1);
        
        
        double volumeB1= b1.hitungVolume();
//        System.out.println("Volume = "+b1.getVolume());
        System.out.println("Volume = "+volumeB1);
        double luasB1 = b1.hitungLuasPermukaan();
//        System.out.println("Luas = "+b1.getLuas());
        System.out.println("Luas = "+luasB1);
        System.out.println("\n");
        
        b1.infoBola();
        System.out.println("");
        System.out.println("diameter"+b1.getDiameter());
        System.out.println("volume"+b1.getVolume());
        System.out.println("luas"+b1.getLuas());
        
        System.out.println("\n");
        b2.infoBola();
    }
}
