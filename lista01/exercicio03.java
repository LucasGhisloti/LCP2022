/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.aula_2_lpc;

/**
 *
 * @author Lucas Ghisloti
 */
public class exercicio03 {
    String nome;
    int idade;
    double salario;
    double contribEmp;
    double contribFunc;
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    void setcontribEmp(double contribEmp){
        this.contribEmp = contribEmp;
    }
    
    void setcontribFunc(double contribFunc){
        this.contribFunc = contribFunc;
    }
    
    void setIdade(int idade){
        this.idade = idade;
    }
	
    void setSalario(double salario){
        this.salario = salario;
    }
	
    String getNome() {
        return this.nome;
    }
    
    int getIdade() {
        return this.idade;
    }
	
    double getSalario() {
	return this.salario;
    }
    
    double getcontribFunc() {
	return this.contribFunc;
    }
    
    double getcontribEmp() {
	return this.contribEmp;
    }
    
    public exercicio03(String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
    
    public void calculaContrib(){
        double incid;
        if(this.salario < 5000.0){
            incid = this.salario;
        }else incid = 5000.0;
        
        if(this.idade < 30){
            this.setcontribEmp(incid * 0.18);
            this.setcontribFunc(incid * 0.2);
        }else if(this.idade>=30 && this.idade < 40){
            this.setcontribEmp(incid * 0.15);
            this.setcontribFunc(incid * 0.18);
        }else if(this.idade>=40 && this.idade < 50){
            this.setcontribEmp(incid * 0.15);
            this.setcontribFunc(incid * 0.12);
        }else if(this.idade>=50 && this.idade < 60){
            this.setcontribEmp(incid * 0.07);
            this.setcontribFunc(incid * 0.1);
        }else{
            this.setcontribEmp(incid * 0.03);
            this.setcontribFunc(incid * 0.04);
        }  
    }
    
    @Override
    public String toString(){
        return "Funcionario: "+ this.getNome() +" /Idade: "+ this.getIdade()+" /Salario: "+ 
                this.getSalario() + " /Contribuicao: "+ this.getcontribFunc() + 
                " /Salario com contribuicao descontada: "+ (this.salario-this.contribFunc)+
                " /Contribuicao da Empresa:"+ this.getcontribEmp()+"\n";
    }
    
    public static void main(String[] args){
        exercicio03 funcionario1 = new exercicio03("Luis", 45, 6300);
        funcionario1.calculaContrib();
        System.out.print(funcionario1.toString());
        
        exercicio03 funcionario2 = new exercicio03("Renan", 20, 1200);
        funcionario2.calculaContrib();
        System.out.print(funcionario2.toString());
        
        exercicio03 funcionario3 = new exercicio03("Marcelo", 37, 10000);
        funcionario3.calculaContrib();
        System.out.print(funcionario3.toString());
        
        exercicio03 funcionario4 = new exercicio03("Roberval", 52, 4000);
        funcionario4.calculaContrib();
        System.out.print(funcionario4.toString());
        
        exercicio03 funcionario5 = new exercicio03("Jose", 63, 19958.66);
        funcionario5.calculaContrib();
        System.out.print(funcionario5.toString());
    }
}
