/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.aula_2_lpc;

import java.util.Scanner;

/**
 *
 * @author Lucas Ghisloti
 */
public class exercicio07 {
    public double calculo(int valores[]){        
        if(valores.length == 1){ 
            return valores[0];
        }
        if(valores.length == 2){ 
            return valores[0] + Math.pow(valores[1], 2);
        }
        if(valores.length == 3){ 
            return valores[0] * Math.pow(valores[1], 2) + Math.pow(valores[2], 3);
        }
        if(valores.length == 4){ 
            return valores[0] + Math.pow(valores[1], 2) + Math.pow(valores[2], 3) + Math.pow(valores[3], 4);
        }
        return 0;
    }
    
    public static void main(String[] args){
        int grau, i;
        double resultado;
        System.out.print("Defina o grau da equacao:\n");
        Scanner scan = new Scanner(System.in);
        grau = scan.nextInt();
        if(grau < 1 || grau > 4) System.out.print("Grau nao permitido\n");
        else{
            int[] listavalores = new int[grau];
            for(i=0; i<grau; ++i){
                System.out.printf("Insira o %d valor:\n", i+1);
                listavalores[i] = scan.nextInt();
            }
            exercicio07 calcula = new exercicio07();
            resultado = calcula.calculo(listavalores);
            System.out.printf("Resultado: %f\n", resultado);
        }  
    }
}
