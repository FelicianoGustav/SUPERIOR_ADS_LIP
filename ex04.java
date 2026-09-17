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
public class ex04 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte o raio do circulo");
       System.out.println("raio: ");
       double raio = sc.nextDouble();
       double perimetro = 2*3.14159*raio;
       double pi = 3.14159;
       double area = Math.pow(raio, 2)*pi;
       System.out.println("o perímetro total é: " + perimetro);
       System.out.println("a área total é: " + area);


    }
    
}
 

