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
public class exercicio01 {
    public void printaPontos(int numero){
        int i, j;
        for(i=1; i<=numero; ++i){
            for(j=1; j<=i; ++j){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        exercicio01 classExerc = new exercicio01();
        System.out.print("insira um numero de 1 a 20:\n");
        int numero = scan.nextInt();
        if(numero < 1 || numero > 20){
            System.out.print("numero invalido!\n");
        }else classExerc.printaPontos(numero);    
    }
}
