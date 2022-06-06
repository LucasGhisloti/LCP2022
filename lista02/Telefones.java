/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lcp;

import java.util.Scanner;

/**
 *
 * @author Lucas Ghisloti
 */
public class Telefones {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o numero:\n");
        String numero = scan.nextLine();
        if(numero.matches("\\([0-9][0-9]\\)\\s[0-9]{4,5}-[0-9]{4}")){
            String[] dd_num = numero.split(" ");
            String[] ini_fim = dd_num[1].split("-");
            if(ini_fim[0].length() == 4) System.out.print("Este numero eh um telefone residencial\n");
            else System.out.print("Este numero eh um celular\n");
            dd_num[0] = dd_num[0].replace(")","");
            System.out.printf("O DDD eh %s e o numero eh %s", dd_num[0].replace("(",""), ini_fim[0]+ini_fim[1]);
        }else System.out.print("numero invalido!\n");
    }
}
