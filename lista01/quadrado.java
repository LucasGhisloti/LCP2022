/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.aula_2_lpc;

/**
 *
 * @author Lucas Ghisloti
 */
public class quadrado implements geometria{
    double lado;
    public quadrado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double defineArea(){
        return Math.pow(this.lado, 2);
    }
    
    @Override
    public double definePerimetro(){
        return this.lado * 4;
    }
}
