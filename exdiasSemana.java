/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author 50695011863
 */
public class exdiasSemana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dígite um número de 1 a 7");
        int numUser = sc.nextInt();
        
        switch (numUser) {
                case 1:
                    System.out.println("Segunda - Feira");
                    break;
                case 2:
                    System.out.println("Terça - Feira");
                    break;
                case 3:
                    System.out.println("Quarta - Feira");
                    break;
                case 4:
                    System.out.println("Quinta - Feira");
                    break;
                case 5:
                    System.out.println("Sexta - Feira");
                    break;
                case 6:
                    System.out.println("Sabádo");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Opção inválido!") ;
            }

    }
}
