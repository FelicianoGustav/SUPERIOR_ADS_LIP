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
public class ex17 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte o 1° lado: ");
       double parte1 = sc.nextDouble();
       System.out.println("Digíte o 2° lado: ");
       double parte2 = sc.nextDouble();
       System.out.println("Digíte o 3° lado: ");
       double parte3 = sc.nextDouble();
         
       if(parte1==parte2 && parte1==parte3){
           System.out.println("o triângulo é equilátero");
       }else if(parte1==parte2 || parte1==parte3 || parte2==parte3){
           System.out.println("o triângulo é isósceles");
       }else{
           System.out.println("o triângulo é escaleno");
       }

    }
    
}
 

