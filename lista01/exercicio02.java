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
public class exercicio02 {
    public void soma(int a, int b, int c){
        int soma = a + b + c;
        System.out.printf("soma = %d\n", soma);
    }
    
    public void produto(int a, int b, int c){
        int produto = a * b * c;
        System.out.printf("sproduto = %d\n", produto);
    }
    
    public void media(int a, int b, int c){
        double media = (a + b + c)/3;
        System.out.printf("media = %f\n", media);
    }
    
    public void ordenados(int a, int b, int c){
        if(a != b && a != c && c != b){
            if(a < b && a < c){
                if(b < c) System.out.printf("ordem: %d, %d, %d\n", a, b, c);
                else System.out.printf("%d, %d, %d\n", a, c, b);
            }
            if(b < a && b < c){
                if(a < c) System.out.printf("ordem: %d, %d, %d\n", b, a, c);
                else System.out.printf("ordem: %d, %d, %d\n", b, c, a);
            }
            if(c < a && c < b){
                if(a < b) System.out.printf("ordem: %d, %d, %d\n", c, a, b);
                else System.out.printf("ordem: %d, %d, %d\n", c, b, a);
            }
        }else if (a == b && a == c) System.out.printf("ordem: %d, %d, %d\n", c, b, a);
        else{
            if(a == b){
                if(a < c) System.out.printf("ordem: %d, %d, %d\n", a, b, c);
                else System.out.printf("ordem: %d, %d, %d\n", c, a, b);
            } 
            if(b == c){
                if(b < a) System.out.printf("ordem: %d, %d, %d\n", b, c, a);
                else System.out.printf("ordem: %d, %d, %d\n", a, b, c);
            }
            if(c == a){
                if(c < b) System.out.printf("ordem: %d, %d, %d\n", c, a, b);
                else System.out.printf("ordem: %d, %d, %d\n", b, a, c);
            }
        }   
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        exercicio02 classExerc = new exercicio02();
        System.out.print("insira 3 numeros para os calculos\n");
        System.out.print("A:\n");
        int a = scan.nextInt();
        System.out.print("B:\n");
        int b = scan.nextInt();
        System.out.print("C:\n");
        int c = scan.nextInt();
        classExerc.soma(a, b, c);    
        classExerc.produto(a, b, c);
        classExerc.media(a, b, c);
        classExerc.ordenados(a, b, c);
    }
}