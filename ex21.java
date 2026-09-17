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
public class ex21 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte um número entre 0 e 999: ");
       int num1 = sc.nextInt();
       int restante = num1;
       
       int centena = restante/100;
       restante = restante-(centena*100);
       
       int dezena = restante/10;
       restante = restante-(dezena*10);
       
       int unidade = restante/1;

       System.out.println("Centenas: " + centena);
       System.out.println("dezena: " + dezena);
       System.out.println("unidade: " + unidade);
       
       

    }
    
}
 

