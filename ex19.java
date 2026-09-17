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
public class ex19 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte um caracter: ");
       char carac = sc.next().charAt(0);
       
       if(carac == 'a' || carac == 'e' || carac == 'i' || carac == 'o' || carac == 'u'){
           System.out.println("Seu caracter é uma vogal");
       }else{
           System.out.println("Seu caracter é uma consoante");
       }
       

    }
    
}
 

