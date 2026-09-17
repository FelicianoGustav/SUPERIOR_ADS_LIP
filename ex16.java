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
public class ex16 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte sua 1° nota: ");
       double nota1 = sc.nextDouble();
       System.out.println("Digíte sua 2° nota: ");
       double nota2 = sc.nextDouble();
       System.out.println("Digíte sua 3° nota: ");
       double nota3 = sc.nextDouble();
       double media = (nota1+nota2+nota3)/3;
       

       if(media>=7){
           System.out.println("você está aprovado");
       }else if(media>5){
           System.out.println("você está de recuperação");
       }else{
           System.out.println("você está reprovado");
       }

    }
    
}
 

