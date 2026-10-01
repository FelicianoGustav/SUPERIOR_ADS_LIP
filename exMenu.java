/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author 50695011863
 */
public class exMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
        Escolha a opção para obter a conversão
        1 - Cadastrar usuário               
        2 - Listar usuários
        3 - Atualizar usuários
        4 - Excluir usuários
        0 - sair  
                         """);      
      System.out.println("Escolha a operação");
        int numUser = sc.nextInt();
        
       switch (numUser) {
                case 1:
                    System.out.println("Cadastrar usuário");
                    break;
                case 2:
                    System.out.println("Listar usuários");
                    break;
                case 3:
                    System.out.println("Atualizar usuários");
                    break;
                case 4:
                    System.out.println("Excluir usuários");
                    break;
                case 0:
                    System.out.println("sair");
                    break;
                default:
                    System.out.println("Opção inválido!") ;
       }
    }
}
