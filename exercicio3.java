/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula3;
import java.util.Scanner;
/**
 *
 * @author 50695011863
 */
public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos realizar um saque, digíte o valor que deseja sacar!");
        System.out.println("O valor mínimo é 10 reais e o valor máximo é 600 reais!");
        System.out.println("Digíte quanto deseja sacar:");
        
        int saque = sc.nextInt();
        int restante = saque;
        
        if(saque<10 || saque>600){
            System.out.println("Valor de saque inválido!:");
        }else{
            int notas100 = restante/100;
            restante = restante - notas100*100;
            Math.floor(restante);
            
            int notas50 = restante/50;
            restante = restante - notas50*50;
            Math.floor(restante);
            
            int notas10 = restante/10;
            restante = restante - notas10*10;
            Math.floor(restante);
            
            int notas5 = restante/5;
            restante = restante - notas5*5;
            Math.floor(restante);
            
            int notas1 = restante/1;

            
            System.out.println("Segue abaixo a quantidade de notas: ");
            System.out.println("Notas de 100 - " + notas100);
            System.out.println("Notas de 50 - " + notas50);
            System.out.println("Notas de 10 - " + notas10);
            System.out.println("Notas de 5 - " + notas5);
            System.out.println("Notasde 1 - " + notas1);
            
            
        }
             
        sc.close();
    }
    
}
