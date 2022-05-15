/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.aula_2_lpc;

/**
 *
 * @author Lucas Ghisloti
 */
public class biblioteca {
    
    public static void main(String[] args){
        livroGratuito livro1 = new livroGratuito();
        livro1.setTitulo("java para leigos");
        livroPago livro2 = new livroPago();
        livro2.setTitulo("a droga da obediencia");
        livro2.setValor(21.99);
        System.out.printf("Livro: %s, preco: gratuito\n", livro1.getTitulo());
        System.out.printf("Livro: %s, preco: %f", livro2.getTitulo(), livro2.getValor());
    }
}
