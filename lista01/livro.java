/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.aula_2_lpc;

/**
 *
 * @author Lucas Ghisloti
 */
public abstract class livro {
    String titulo;
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public abstract void setTitulo(String titulo);
}
