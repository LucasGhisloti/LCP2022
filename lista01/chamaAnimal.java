/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.aula_2_lpc;

/**
 *
 * @author Lucas Ghisloti
 */
public class chamaAnimal{
    public static void main(String[] args){
       cachorro dog = new cachorro("jorge", 5);
       System.out.printf("cachorro %s, de %d anos, faz %s e pode %s\n", dog.nome, dog.idade, dog.emiteSom(), dog.acao());
       
       gato cat = new gato("melissa", 8);
       System.out.printf("gata %s, de %d anos, faz %s e pode %s\n", cat.nome, cat.idade, cat.emiteSom(), cat.acao());
       
       passaro bird = new passaro("filinho", 3);
       System.out.printf("passaro %s, de %d anos, faz %s e pode %s", bird.nome, bird.idade, bird.emiteSom(), bird.acao());
    }
}
