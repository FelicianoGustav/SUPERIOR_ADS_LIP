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
public class ex10 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte sua idade: ");
       double idade = sc.nextDouble();

       if(idade>=18){
           System.out.println("você é maior de idade");
       }else{
           System.out.println("Você é menor de idade");
       }

    }
    
}
 

