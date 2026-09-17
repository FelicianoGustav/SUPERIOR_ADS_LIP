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
public class ex03 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte dois número inteiros: ");
       System.out.println("Número 1: ");
       double num1 = sc.nextDouble();
       System.out.println("Número2: ");
       double num2 = sc.nextDouble();
       
       System.out.println("Soma: " + (num1+num2));
       System.out.println("Subtração: " + (num1-num2));
       System.out.println("Multiplicação: " + (num1*num2));

    }
    
}
 

