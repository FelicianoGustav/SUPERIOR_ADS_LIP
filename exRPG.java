/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author 50695011863
 */
public class exRPG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
        Escolha a opção para obter a conversão
        1 - Guerreiro               
        2 - Mago
        3 - Arqueiro
        4 - Assasino
        0 - sair  
                         """);      
      System.out.println("Escolha a operação");
        int numUser = sc.nextInt();
        
       switch (numUser) {
                case 1:
                    System.out.println("Classe Guerreiro");
                    System.out.println("Espada");
                    System.out.println("Soltar raio pelo olho");
                    break;
                case 2:
                    System.out.println("Classe Mago");
                    System.out.println("Magia");
                    System.out.println("Soltar raio pela orelha");
                    break;
                case 3:
                    System.out.println("Classe Arqueiro");
                    System.out.println("Arco");
                    System.out.println("Soltar raio pela Nariz");
                    break;
                case 4:
                    System.out.println("Classe Assanino");
                    System.out.println("Adaga");
                    System.out.println("Soltar raio pela boca");
                    break;
                case 0:
                    System.out.println("sair");
                    break;
                default:
                    System.out.println("Opção inválido!") ;
       }
    }
}
