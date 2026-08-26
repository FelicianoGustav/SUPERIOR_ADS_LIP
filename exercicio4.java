/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula3;
import java.util.Scanner;

/**
 *
 * @author 50695011863
 */
public class exercicio4 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digíte um caractere e descubra se é numero, vogal ou consoante: ");
        
        char carac = sc.next().charAt(0);
        
        if(Character.isDigit(carac)){
            
            System.out.println("O caracter é um número");
            
        }else if(Character.isLetter(carac)){
            
        char caractere = Character.toLowerCase(carac);
        
        if(caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u'){
            System.out.println("O caracter é uma vogal");
        }else{
            System.out.println("O caracter é uma consoante");
        }
        
        }else{
            System.out.println("Caractere inválido");
        }
    }
}
