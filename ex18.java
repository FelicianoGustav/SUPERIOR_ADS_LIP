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
public class ex18 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte o seu salário por horas: ");
       double ganho = sc.nextDouble();
       System.out.println("Digíte a quantidade de horas trabalhadas: ");
       double horas = sc.nextDouble();
       double salario = horas*ganho;
       salario = salario-(salario*0.08);
       System.out.println("Seu salário fica: " + salario);
       

    }
    
}
 

