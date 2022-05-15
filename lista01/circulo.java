/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.aula_2_lpc;

/**
 *
 * @author Lucas Ghisloti
 */
public class circulo implements geometria{
    double raio;
    public circulo(double raio){
        this.raio = raio;
    }
    
    @Override
    public double defineArea(){
        return Math.pow(this.raio, 2) * Math.PI;
    }
    
    @Override
    public double definePerimetro(){
        return 2 * this.raio * Math.PI;
    }
}
