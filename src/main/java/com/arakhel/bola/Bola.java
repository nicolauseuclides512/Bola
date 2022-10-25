/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.arakhel.bola;

/**
 *
 * @author nicoe
 */
public class Bola {
    private double jariJari, diameter, volume, luas;
    private int Berat;
    private String Warna, Nama;
    private final double pi=3.14;
    

    public Bola(String Nama, double jariJari, int Berat, String Warna) {
        this.jariJari = jariJari;
        this.diameter = 2*jariJari;
        this.Berat = Berat;
        this.Warna = Warna;
        this.Nama = Nama;
        this.volume = (4*this.pi*Math.pow(this.jariJari, 3))/3;
        this.luas = 3*this.pi*Math.pow(this.jariJari, 2);
    }

//    public double hitungVolume(){
//        return (4*this.pi*Math.pow(this.jariJari, 3))/3;
//    }
//    
//    public double hitungLuasPermukaan(){
//        return 3*this.pi*Math.pow(this.jariJari, 2);
//    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public int getBerat() {
        return Berat;
    }

    public void setBerat(int Berat) {
        this.Berat = Berat;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
}
