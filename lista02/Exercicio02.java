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
public class Exercicio02 {
    public static void main(String[] args){
        int i=0;
        boolean check=true;
        Scanner scan = new Scanner(System.in);
        System.out.print("insira a primeira string:\n");
        String ent1 = scan.nextLine();
        System.out.print("insira a segunda string:\n");
        String ent2 = scan.nextLine();
        char[] str1 = ent1.toCharArray();
        char[] str2 = ent2.toCharArray();
        String resultado= "";
        while(check){
            if(i == str1.length && i < str2.length){
                while(i < str2.length){
                    resultado += Character.toString(str2[i]);
                    i++;
                }
                check = false;
            }else if(i == str2.length && i < str1.length){
                while(i < str1.length){
                    resultado += Character.toString(str1[i]);
                    i++;
                }
                check = false;
            }else{
                resultado += Character.toString(str1[i])+Character.toString(str2[i]);
                i++;
                if(i == str2.length && i == str1.length) check = false;
            }
        }
        System.out.printf("%s\n", resultado);
    }
}







































