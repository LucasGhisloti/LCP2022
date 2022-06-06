/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lcp;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio01 {
    public static void main(String[] args){
        int i;
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        String[] string = nome.split(" ");
        char[] c;
        String resultado = "";
        for(String s : string){
            if(s.matches("[d][a-z]|[D][A-Z]")) resultado += s.toLowerCase() + " ";
            else{
                c = s.toCharArray();
                i=0;
                while(i < c.length){
                    if(i==0) resultado += Character.toUpperCase(c[i]);
                    else resultado += Character.toLowerCase(c[i]);
                    i++;
                }
                resultado += " ";
            }
        }
        resultado = resultado.trim();
        System.out.printf("%s", resultado);
        
    }
}

