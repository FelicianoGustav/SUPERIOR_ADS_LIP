/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author 50695011863
 */
public class exArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
        Escolha a opção para obter a Área
        1 - Quadrado               
        2 - Retângulo
        3 - Triângulo
        4 - Circulo    
                         """);
        
        
        System.out.println("Escolha a operação");
        int escolhaUser = sc.nextInt();
        
        switch (escolhaUser) {
                case 1:
                    System.out.println("Digíte o valor do lado do quadrado: ");
                    double lado = sc.nextDouble();
                    System.out.println("Á área do quadrado é: " +(lado*lado));
                    break;
                case 2:
                    System.out.println("Digíte o valor da base do retângulo: ");
                    double base = sc.nextDouble();
                    System.out.println("Digíte o valor da altura do retângulo: ");
                    double altura = sc.nextDouble();                
                    System.out.println("Á área do Retângulo é: " + (base*altura));
                    break;
                case 3:
                    System.out.println("Digíte o valor da base do Triângulo: ");
                    double baseT = sc.nextDouble();
                    System.out.println("Digíte o valor da altura do Triângulo: ");
                    double alturaT = sc.nextDouble();
                    double total = ((baseT*alturaT)/2);
                    System.out.println("Á área do Triângulo é: "+total );
                    break;
                case 4:
                    System.out.println("Digíte o raio do círculo: ");
                    double raio = sc.nextDouble();
                    double area = 3.14*(raio*raio);
                    System.out.println("Á área do Circulo é: " + area);
                    
                    
                    break;
                default:
                    System.out.println("Opção inválido!") ;
            }

    }
}
