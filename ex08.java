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
public class ex08 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte um número: ");
       double num1 = sc.nextInt();
       double restante = num1%2;
       if(restante==0){
           System.out.println("Número par");
       }else{
           System.out.println("número ímpar");
       }

    }
    
}
 

