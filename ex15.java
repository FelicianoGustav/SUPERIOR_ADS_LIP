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
public class ex15 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte um número");
       int num1 = 0;
       
       while (num1!=100) {
           num1 = sc.nextInt();
           if(num1==100){
               System.out.println("Número 100 digitado");
           }else{
               System.out.println("Digíte novamente");
           }
       }

    }
    
}
 

