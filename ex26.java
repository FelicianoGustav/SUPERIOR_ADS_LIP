/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author 50695011863
 */
public class ex26 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double numUser = 0;
        int qtd = 0;
        double soma = 0;
        
        while (true){   
            
            System.out.println("Digíte um número: ");
            numUser = sc.nextInt();
            
            if(numUser==0){
                double media = soma/qtd;
                System.out.println("Média: " + media);
                break;
            }
            
            soma = soma + numUser;
            qtd++; 
        }  
    }
    
}
 

