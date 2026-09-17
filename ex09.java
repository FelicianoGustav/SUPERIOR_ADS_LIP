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
public class ex09 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte primeiro número: ");
       double num1 = sc.nextDouble();
       System.out.println("Digíte segundo número: ");
       double num2 = sc.nextDouble();

       if(num1>num2){
           System.out.println("Número maior" + num1);
       }else if(num1<num2){
           System.out.println("número maior" + num2);
       }else{
           System.out.println("números iguais");
       }

    }
    
}
 

