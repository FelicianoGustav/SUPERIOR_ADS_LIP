/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author 50695011863
 */
public class excalculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
        Digíte dois números e escolha a operação
        1 - Soma               
        2 - Subtração
        3 - Multiplicação               
        4 - Divisão             
                         """);
        System.out.println("1° Número");
        int numUm = sc.nextInt();
        System.out.println("2° Número");
        int numDois = sc.nextInt();
        
        System.out.println("Escolha a operação");
        int escolhaUser = sc.nextInt();
        
        switch (escolhaUser) {
                case 1:
                    System.out.println((numUm+numDois));
                    break;
                case 2:
                    System.out.println((numUm-numDois));
                    break;
                case 3:
                    System.out.println((numUm*numDois));
                    break;
                case 4:
                    System.out.println((numUm/numDois));
                    break;
                default:
                    System.out.println("Opção inválido!") ;
            }

    }
}
