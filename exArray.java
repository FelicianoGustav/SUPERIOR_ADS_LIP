/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author 50695011863
 */
public class exArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int qtdNotas = 0;
        int contador = 0;
        int contador2 = 0;
        double mediaR = 0;
        String[] alunos = new String[100];
        double[] media = new double[100];
        String[] situacao = new String[100];
        String novoAluno;
        
        System.out.print("""
        Vamos descobrir a média dos seus alunos.
                         """);
        
        while(true){
            
            System.out.print("Digíte o nome do aluno: ");
            alunos[contador] = sc.next();
            sc.nextLine();
            System.out.print("Digíte a quantidade de Notas do aluno " + alunos[contador] + " :");
            qtdNotas = sc.nextInt();
            
                for(contador2 = 1;contador2<=qtdNotas;contador2++){
                  System.out.print("Digíte a " + (contador2) + "° nota do aluno: ");
                  mediaR += sc.nextDouble();
                }
                
            media[contador] =  (mediaR/(contador2-1));
            
            
                if(media[contador]<5){
                    situacao[contador] = "Reprovado";
                }else if(media[contador]<7){
                    situacao[contador] = "Recuperação";
                }else{
                    situacao[contador] = "Aprovado";
                }
            
                
            System.out.print("Deseja realizar para um novo aluno?: N/S ");
            novoAluno = sc.next().toLowerCase();

                if(novoAluno.equals("n")){
                break;
            }
        contador ++;
        mediaR = 0;
        }
        
        System.out.print("Relatório final: ");
    
        for(int contador3 = 0;contador3<=contador;contador3++){
            System.out.println("--------------:");
            System.out.println("Aluno: " + alunos[contador3]);
            System.out.println("Média: " + media[contador3]);
            System.out.println("Situação: " + situacao[contador3]);
        }
        
 
    
    }   
    
}
