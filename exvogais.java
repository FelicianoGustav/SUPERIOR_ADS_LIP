/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author 50695011863
 */
public class exvogais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
        Digíte uma letra e veja se é vogal ou consoante:
                         """);      
        char escolhaUser = sc.next().charAt(0);
        
       switch (escolhaUser) {
                case 'a':
                    System.out.println("vogal");
                    break;
                case 'e':
                    System.out.println("vogal");
                    break;
                case 'i':
                    System.out.println("vogal");
                    break;
                case 'o':
                    System.out.println("vogal");
                    break;
                case 'u':
                    System.out.println("vogal");
                    break;
                default:
                    System.out.println("Consoante") ;
       }
    }
}
