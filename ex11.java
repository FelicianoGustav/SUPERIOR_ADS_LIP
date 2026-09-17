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
public class ex11 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte sua nota: ");
       double nota = sc.nextDouble();

       if(nota>=6){
           System.out.println("você está aprovado");
       }else{
           System.out.println("você está reprovado");
       }

    }
    
}
 

