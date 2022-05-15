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
public class exercicio08 {
    public double length(String numero){
        return numero.length();
    }
    
    public boolean verificaNum(int numero){
        int quociente = numero;
        double resto, guardaValor = 0, tamanho = this.length(Integer.toString(numero));
        do{
            resto = quociente%10;
            quociente = quociente/10;
            guardaValor = guardaValor + Math.pow(resto, tamanho);
        }while(quociente > 0);
        if (guardaValor == numero) return true;
        else return false;
    }
    
    public static void main(String[] args){
        exercicio08 validaNum = new exercicio08();
        Scanner scan = new Scanner(System.in);
        System.out.printf("Insira um numero:\n");
        int num = scan.nextInt();
        if(validaNum.verificaNum(num)) System.out.printf("Numero Valido!");
        else System.out.printf("Numero Invalido!");
    }
}
