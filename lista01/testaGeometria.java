/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.aula_2_lpc;

/**
 *
 * @author Lucas Ghisloti
 */
public class testaGeometria {
    public static void main(String[] args){
        quadrado quad1 = new quadrado(4);
        quadrado quad2 = new quadrado(7);
        System.out.printf("Quadrado1\nArea: %f, Perimetro: %f\n", quad1.defineArea(), quad1.definePerimetro());
        System.out.printf("Quadrado2\nArea: %f, Perimetro: %f\n", quad2.defineArea(), quad2.definePerimetro());
        
        retangulo ret1 = new retangulo(4, 9);
        retangulo ret2 = new retangulo(10, 7);
        System.out.printf("retangulo1\nArea: %f, Perimetro: %f\n", ret1.defineArea(), ret1.definePerimetro());
        System.out.printf("retangulo2\nArea: %f, Perimetro: %f\n", ret2.defineArea(), ret2.definePerimetro());
        
        triangulo tri1 = new triangulo(4, 4, 6);
        triangulo tri2 = new triangulo(4, 5, 3);
        System.out.printf("triangulo1\nArea: %f, Perimetro: %f\n", tri1.defineArea(), tri1.definePerimetro());
        System.out.printf("triangulo2\nArea: %f, Perimetro: %f\n", tri2.defineArea(), tri2.definePerimetro());
        
        circulo circ1 = new circulo(12);
        circulo circ2 = new circulo(38);
        System.out.printf("circulo1\nArea: %f, Perimetro: %f\n", circ1.defineArea(), circ1.definePerimetro());
        System.out.printf("circulo2\nArea: %f, Perimetro: %f\n", circ2.defineArea(), circ2.definePerimetro());
    }
}
