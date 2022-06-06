/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lcp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lucas Ghisloti
 */
public class Exercicio07 {
    public static void main(String[] args){
        int i;
        String RA;
        boolean parada=true;
        Scanner scan = new Scanner(System.in);
        String acao;
        String[] aluno = new String[4];
        List<String> listaDeAlunos = new ArrayList<String>();
        while(parada){
            System.out.print("Digite o que deseja fazer:\n");
            System.out.print("adicionar novo aluno, remover aluno ou finalizar:\n");
            acao = scan.nextLine();
            if("adicionar novo aluno".equals(acao)){
                System.out.print("Nome:\n");
                aluno[0] = scan.nextLine();
                System.out.print("RA:\n");
                aluno[1] = scan.nextLine();
                System.out.print("Idade:\n");
                aluno[2] = scan.nextLine();
                System.out.print("Curso:\n");
                aluno[3] = scan.nextLine();
                for(i=0;i<4;i++){
                    listaDeAlunos.add(aluno[i]);
                }
            }else if("remover aluno".equals(acao)){
                if(listaDeAlunos.isEmpty()) System.out.print("Lista Vazia!\n");
                else{
                    System.out.print("Digite o RA do Aluno que será removido:\n");
                    RA = scan.nextLine();
                    if(listaDeAlunos.contains(RA)){
                        listaDeAlunos.remove(listaDeAlunos.indexOf(RA)-1);
                        listaDeAlunos.remove(listaDeAlunos.indexOf(RA)+1);
                        listaDeAlunos.remove(listaDeAlunos.indexOf(RA)+1);
                        listaDeAlunos.remove(listaDeAlunos.indexOf(RA));
                        System.out.print("Removido com sucesso\n");
                    }else System.out.print("O RA digitado não foi encontrado!:\n");   
                }
            }else if("finalizar".equals(acao)){
                System.out.print("See you space cowboy...\n");
                parada=false;
            }
            else System.out.print("Comando invalido!\n");
        }
    }
}
