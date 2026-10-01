/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios;
import java.util.Scanner;
/**
 *
 * @author 50695011863
 */
public class ex43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Acesso ao menu!");
        int escolhaUser = 0;
        
        do{
            System.out.println("---------Menu---------");
            System.out.println("""
            1 - Adicionar Valor ao Saldo
            2 - Retirar valor do saldo
            3 - Exibir saldo Atual
            0 - Encerrar Sistema   
                           """);
            escolhaUser = sc.nextInt();
        
            switch (escolhaUser) {
                case 1:
                    System.out.println("Valor adicionado");
                    break;
                case 2:
                    System.out.println("Retirar do saldo");
                    break;
                case 3:
                    System.out.println("Exibir saldo");
                    break;
                case 0:
                    System.out.println("Encerrado");
                    break;
                default:
                    System.out.println("Valor inválido!") ;
            }       
        }while(escolhaUser!=0);
        
              
    }
}
