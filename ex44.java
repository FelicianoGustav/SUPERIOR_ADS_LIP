/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios;
import java.util.Scanner;
/**
 *
 * @author 50695011863
 */
public class ex44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        int soma = 0;
        double media = 0;
        int numUser = 0;
        
        System.out.print("""
        "Digíte 10 números inteiros e descubra:
        O Maior Número;
        O Menor Número;
        A Média Total;
        A Soma Total;          
                         """);
        
        for(int contador = 1;contador<=10;contador++){
            System.out.println(contador+"° número");
            numUser = sc.nextInt();
            
            if(numUser>maior){
                maior = numUser;
            }
            
            if(numUser<menor||contador==1){
                menor = numUser;
            }
            
            soma+=numUser;           
        }
        
        media = soma/10;
        
        System.out.println("O Maior número é: " + maior);
        System.out.println("O Menor número é: " + menor);
        System.out.println("A Média do número é: " + media);
        System.out.println("A soma total do número é: " + soma);
               
              
    }
}
