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
public class ex23 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte o primeiro numero: ");
       double num1 = sc.nextDouble();
       System.out.println("Digíte o segundo numero: ");
       double num2 = sc.nextDouble();
       double soma = num1 + num2;
       double sub = num1 - num2;
       double div = num1 / num2;
       double mult = num1 * num2;

       System.out.println("1 - soma, 2 - sub, 3 - div, 4 - mult");
       int escolha = sc.nextInt();
        

       if(escolha == 1){
           System.out.println("Valor total: " + soma);
       }else if(escolha == 2){
           System.out.println("Valor total: " + sub);
       }else if(escolha == 3){
           System.out.println("Valor total: " + div);
       }else if(escolha == 4){
           System.out.println("Valor total: " + mult);
       }

    }
    
}
 

