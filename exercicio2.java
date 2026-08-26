/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula3;
import java.util.Scanner;

/**
 *
 * @author 50695011863
 */
public class exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digíte dois números e descubra qual é o maior: ");
        System.out.println("1º Número ");
        double numero1 = sc.nextDouble();
        System.out.println("2º Número ");
        double numero2 = sc.nextDouble();
       
        if(numero1==numero2){
            System.out.println("Os números são iguais");
        }else if(numero1>numero2){
            System.out.println("O maior número é o 1º: " + numero1);
        }else{
            System.out.println("O maior número é o 2º: " + numero2);
        }
        sc.close();
    }
}
