/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.aula_2_lpc;

/**
 *
 * @author Lucas Ghisloti
 */
public class triangulo implements geometria{
    double lado1, lado2, lado3;
    public triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    @Override
    public double defineArea(){
        double S = (this.lado1 + this.lado2 + this.lado3)/2;
        return Math.sqrt(S*(S-this.lado1)*(S-this.lado2)*(S-this.lado3));
    }
    
    @Override
    public double definePerimetro(){
        return lado1 + lado2 + lado3;
    }
}
