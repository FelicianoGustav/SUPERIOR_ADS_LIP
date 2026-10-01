/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios;
import java.util.Scanner;
/**
 *
 * @author 50695011863
 */
public class ex45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digíte um número e veja a soma dos algarismos");
        int numUser = sc.nextInt();
        int resultado = 0;
        int contador = 0;
        

        System.out.println("Sequência desejada abaixo:");

        while (contador <= numUser) {

          resultado += contador;

            contador++;
        }
        
        System.out.println(resultado);
        
    }
}
