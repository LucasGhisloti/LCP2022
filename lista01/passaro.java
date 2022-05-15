/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.aula_2_lpc;

/**
 *
 * @author Lucas Ghisloti
 */
public class passaro extends Animal {   
    public passaro(String nome, int idade){
        super.nome = nome;
        super.idade = idade;
    }
    
    @Override
    public String emiteSom(){
        return "Piu";
    }
    
    @Override
    public String acao(){
        return "voar";
    }
}
