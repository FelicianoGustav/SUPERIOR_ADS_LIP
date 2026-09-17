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
public class ex06 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte a quantidade do produto: ");
       int quantidade = sc.nextInt();
       System.out.println("Digíte o valor do produto: ");
       double valor = sc.nextDouble();
       double total = valor*quantidade;
       System.out.println("O valo total é : " + total);


    }
    
}
 

