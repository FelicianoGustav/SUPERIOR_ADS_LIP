/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;
import java.util.Scanner;
/**
 *
 * @author 50695011863
 * Dois paises, A e B, hoje o pais A tem 500.000 e o B tem 800.000 mil habitantes
 * A taxa de crescimentos populacional do pais A é: 5,3% e a do pais B é: 2,0% ao ano!
 * Em quantos anos a população do pais A ultrapassará pais B
 */
public class aula6_populacaoDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digíte o valor da populaçao A");
        double popA = sc.nextDouble();
        System.out.println("Digíte o valor da populaçao B");
        double popB = sc.nextDouble();
        System.out.println("Digíte o valor da taxa A");
        double taxaA = sc.nextDouble();
        System.out.println("Digíte o valor da taxa B");
        double taxaB = sc.nextDouble();
        int anos = 0;
        
        if(popB<=popA || taxaA < taxaB){
            System.out.println("A população do país B não pode ser menor que a do pais A");
        }else{
            
            while(popA<=popB){
                popA*=(1+taxaA);
                popB*=(1+taxaB);
                anos++;
                System.out.printf("Poulacao do pais A %.0f\n",popA);
                System.out.printf("Populacao do pais B %.0f",popB);
                System.out.printf("Ano %d\n",anos);
            }  
            System.out.printf("O pais A demorou %d anos para ultrapassar o pais B\n",anos);
            System.out.printf("Poulacao do pais A %.0f\n",popA);
            System.out.printf("Populacao do pais B %.0f",popB); 
        }
                

        
        
        
        
    }
    
}
