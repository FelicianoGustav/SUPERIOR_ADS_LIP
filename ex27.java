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
public class ex27 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digíte um número");
        double numUser = sc.nextInt();
        
        for(int contador = 1;contador<=10;contador++){
            System.out.println("Valor multiplicado: " + numUser +" X "+ contador +"= "+  numUser*contador);
        }
        
        
          
    }
    
}
 

