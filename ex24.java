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
public class ex24 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte sua altura: ");
       double altura = sc.nextDouble();
       System.out.println("Digíte o seu peso: ");
       double peso = sc.nextDouble();
       double imc = peso/(altura*altura);
       
       
       if(imc < 18.5){
           System.out.println("Abaixo do peso");
       }else if(imc < 24.99){
           System.out.println("Peso ideal");
       }else if(imc < 29.99){
           System.out.println("Acima do peso");
       }else if(imc < 34.99){
           System.out.println("Obesidade");
       }

    }
    
}
 

