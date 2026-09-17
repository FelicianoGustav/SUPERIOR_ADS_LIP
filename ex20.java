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
public class ex20 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte seu ano de nascimento: ");
       int Anonasc = sc.nextInt();
       System.out.println("Digíte o ano atual: ");
       int Anoatual = sc.nextInt();
       int idade = Anoatual - Anonasc;
       if(idade>=16){
           System.out.println("você pode votar");
       }else{
           System.out.println("você não pode votar");
       }
       

    }
    
}
 

