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
public class Exercicio03 {
    public static void main(String[] args){
        int i, j;
        boolean palindromo = true;
        Scanner scan = new Scanner(System.in);
        System.out.print("insira a palavra:\n");
        String palavra = scan.nextLine();
        palavra = palavra.toLowerCase();
        char[] palavraArray = palavra.toCharArray();
        for(i=0, j=palavraArray.length-1; i<palavraArray.length; i++, j--){
            if(palavraArray[i] != palavraArray[j]) palindromo = false;
        }
        if(palindromo) System.out.print("eh palindromo");
        else System.out.print("não eh palindromo");
    }
}
