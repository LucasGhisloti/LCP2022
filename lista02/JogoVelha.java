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
public class JogoVelha {
    public boolean jog1Venceu(char[][] hash){
        if((hash[0][0] == hash[0][1] && hash[0][0] == hash[0][2]) && hash[0][0] == 'X') return true;
        else if((hash[0][0] == hash[1][0] && hash[0][0] == hash[2][0]) && hash[0][0] == 'X') return true;
        else if((hash[0][2] == hash[1][2] && hash[0][2] == hash[2][2]) && hash[0][2] == 'X') return true;
        else if((hash[2][0] == hash[2][1] && hash[2][0] == hash[2][2]) && hash[2][0] == 'X') return true;
        else if((hash[1][0] == hash[1][1] && hash[1][0] == hash[1][2]) && hash[1][0] == 'X') return true;
        else if((hash[0][1] == hash[1][1] && hash[0][1] == hash[2][1]) && hash[0][1] == 'X') return true;
        else if((hash[0][0] == hash[1][1] && hash[0][0] == hash[2][2]) && hash[0][0] == 'X') return true;
        else if((hash[0][2] == hash[1][1] && hash[0][2] == hash[2][0]) && hash[0][2] == 'X') return true;
        else return false;
    }
    
    public boolean jog2Venceu(char[][] hash){
        if((hash[0][0] == hash[0][1] && hash[0][0] == hash[0][2]) && hash[0][0] == 'O') return true;
        else if((hash[0][0] == hash[1][0] && hash[0][0] == hash[2][0]) && hash[0][0] == 'O') return true;
        else if((hash[0][2] == hash[1][2] && hash[0][2] == hash[2][2]) && hash[0][2] == 'O') return true;
        else if((hash[2][0] == hash[2][1] && hash[2][0] == hash[2][2]) && hash[2][0] == 'O') return true;
        else if((hash[1][0] == hash[1][1] && hash[1][0] == hash[1][2]) && hash[1][0] == 'O') return true;
        else if((hash[0][1] == hash[1][1] && hash[0][1] == hash[2][1]) && hash[0][1] == 'O') return true;
        else if((hash[0][0] == hash[1][1] && hash[0][0] == hash[2][2]) && hash[0][0] == 'O') return true;
        else if((hash[0][2] == hash[1][1] && hash[0][2] == hash[2][0]) && hash[0][2] == 'O') return true;
        else return false;
    }
    
    public boolean empate(char[][] hash){
        int i, j, cont=0;
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                if(hash[i][j] != '_') cont++;
            }
        }
        if(cont == 9) return true;
        else return false;
    }
    
    public static void main(String[] args){
        int i, j, linha, coluna=0, turno=0;
        boolean fim=true, jog1 = false, jog2 = false;
        JogoVelha jogo = new JogoVelha();
        Scanner scan = new Scanner(System.in);
        System.out.print("JOGO DA VELHA\n");
        char[][] hash = {{'_','_','_'}, {'_','_','_'}, {'_','_','_'}};
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.printf("%c ", hash[i][j]);
            }
            System.out.printf("\n");
        }
        
        while(fim){
            if(jogo.empate(hash)){ 
                System.out.print("Empate!\n");
                fim = false;
            }
            else{
                if(turno % 2 == 0 || turno == 0){
                    System.out.print("jogador 1\nlinha:\n");
                    linha = scan.nextInt();
                    if(linha < 0 || linha > 2) System.out.print("linha invalida:\n");
                    else{
                        System.out.print("coluna:\n");
                        coluna = scan.nextInt();
                        if(coluna < 0 || coluna > 2) System.out.print("coluna invalida:\n");
                        else{
                            jog1=true;
                            turno++;
                        }
                    }
                }else{
                    System.out.print("jogador 2\nlinha:\n");
                    linha = scan.nextInt();
                    if(linha < 0 || linha > 2) System.out.print("linha invalida!\n");
                    else{
                        System.out.print("coluna:\n");
                        coluna = scan.nextInt();
                        if(coluna < 0 || coluna > 2) System.out.print("coluna invalida!\n");
                        else{
                            jog2=true;
                            turno++;
                        }
                    }
                }
                if(jog1){ 
                    if(hash[linha][coluna] == '_') hash[linha][coluna] = 'X';
                    else{ 
                        System.out.print("esse campo ja foi preenchido!\n");                        
                        turno--;
                    }
                }                
                else if(jog2){ 
                    if(hash[linha][coluna] == '_') hash[linha][coluna] = 'O';
                    else{ 
                        System.out.print("esse campo ja foi preenchido!\n");                        
                        turno--;
                    }
                }
                             
                if(jog1==true || jog2==true){
                    for(i=0; i<3; i++){
                        for(j=0; j<3; j++){
                            System.out.printf("%c ", hash[i][j]);
                        }
                        System.out.print("\n");
                    }
                    jog1=false; jog2=false;
                }
                
                if(jogo.jog1Venceu(hash)){                   
                    System.out.print("jogador 1 venceu!\n");
                    fim = false;
                }else if(jogo.jog2Venceu(hash)){                   
                    System.out.print("jogador 2 venceu!\n");
                    fim = false;
                }
            }
        }
    }
}
