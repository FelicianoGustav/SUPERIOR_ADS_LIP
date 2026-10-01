/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author 50695011863
 */
public class exconversor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
        Escolha a opção para obter a conversão
        1 - Celsius para Fahrenheit               
        2 - Fahrenheit para Celsius            
                         """);
        
        System.out.println("Digíte conforme a opção escolhida");
        int numUm = sc.nextInt();
        
        System.out.println("Escolha a operação");
        int escolhaUser = sc.nextInt();
        double celsius = ((numUm*1.8)+32);
        double Fahrenheit = ((numUm-32)*5/9);
        
        switch (escolhaUser) {
                case 1:
                    System.out.println(celsius);
                    break;
                case 2:
                    System.out.println(Fahrenheit);
                    break;
                default:
                    System.out.println("Opção inválido!") ;
            }

    }
}
