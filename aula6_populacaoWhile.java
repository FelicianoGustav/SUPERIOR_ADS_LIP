/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author 50695011863
 * Dois paises, A e B, hoje o pais A tem 500.000 e o B tem 800.000 mil habitantes
 * A taxa de crescimentos populacional do pais A é: 5,3% e a do pais B é: 2,0% ao ano!
 * Em quantos anos a população do pais A ultrapassará pais B
 */
public class aula6_populacaoWhile {
    public static void main(String[] args) {
        double popA = 0;
        double popB = 800000;
        double taxaA = 0.053;
        double taxaB = 0.02;
        int anos = 0;
        
        for(popA=500000;popA<=popB;){
            popA*=(1+taxaA);
            popB*=(1+taxaB);
            anos++;
        }
        
        System.out.printf("O pais A demorou %d anos para ultrapassar o pais B\n",anos);
        System.out.printf("Poulação do pais A %.0f\n",popA);
        System.out.printf("População do pais B %.0f",popB);
        
        
        
        
    }
    
}
