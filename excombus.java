/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author 50695011863
 */
public class excombus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
        Escolha o combustível:
        g - Gasolina               
        e - Etanol
        d - Diesel
 
                         """);      
      System.out.println("Escolha a operação");
        char escolhaUser = sc.next().charAt(0);
        
       switch (escolhaUser) {
                case 'g':
                    System.out.println("Gasolina");
                    break;
                case 'e':
                    System.out.println("Etanol");
                    break;
                case 'd':
                    System.out.println("Diesel");
                    break;
                default:
                    System.out.println("Opção inválido!") ;
       }
    }
}
