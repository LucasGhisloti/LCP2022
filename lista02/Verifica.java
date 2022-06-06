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
public class Verifica {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o RG:\n");
        String RG = scan.nextLine();
        if(RG.matches("[0-9]{1,2}.[0-9]{3}.[0-9]{3}-[0-9|X]"))
            System.out.print("RG valido!");
        else System.out.print("RG invalido!");
    }
}
