/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.aula_2_lpc;

/**
 *
 * @author Lucas Ghisloti
 */
public class retangulo implements geometria{
    double base, altura;
    public retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double defineArea(){
        return this.base * this.altura;
    }
    
    @Override
    public double definePerimetro(){
        return 2 * (this.base + this.altura);
    }
}
