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
public class ex05 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte a temperatura em graus celsius");
       System.out.println("celsius: ");
       double celsius = sc.nextDouble();
       double Fahrenheit = celsius*1.8+32;
       System.out.println("Em Fahrenheit fica : " + Fahrenheit);


    }
    
}
 

