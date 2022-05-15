/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.aula_2_lpc;

/**
 *
 * @author Lucas Ghisloti
 */
public class livroPago extends livro {
    double valor;
    
    public double getValor(){
        return this.valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    @Override
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
}
