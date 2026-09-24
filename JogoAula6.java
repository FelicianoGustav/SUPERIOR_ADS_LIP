/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;
import java.util.Scanner;
/**
 *
 * @author 50695011863
 */
public class JogoAula6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         int numerosorteado = (int)((Math.random()) * 100)+1;
         int escolhaUsuario = 0;
         int tentativas = 0;
         String dificuldade = "";
         boolean acerto = false;
             
         System.out.println("-------------------------------");
         System.out.println("Jogo de adivinhação!");
         System.out.println("-------------------------------");
         
         System.out.println("-------------------------------");
         System.out.println("Escolha a dificuldade: ");
         System.out.println("1 Facil");
         System.out.println("2 Medio");
         System.out.println("3 Dificil");
         
         while(true){
            
             dificuldade = sc.next().toLowerCase();
            
             switch(dificuldade){
                 case "dificil":
                 tentativas = 5;
                 break;
                 case "medio":
                 tentativas = 7;
                 break;
                 case "facil":
                 tentativas = 10;
                 break;
                 default:
                     System.out.println("Escolha inválida!");
                     continue;
             }        
             break;
         }
         
        System.out.println("-------------------------------");
        System.out.println("Jogo iniciado");
         
         for(int contador = 1;contador<=tentativas;contador++){
            
            System.out.println("Número de tentativas " + contador);
            System.out.println("Máximo de tentativas " + tentativas);
            System.out.print("Digíte sua tentativa :");
            escolhaUsuario = sc.nextInt();
            
            if(escolhaUsuario==numerosorteado){
                acerto = true;
                break;
            }else if(numerosorteado<escolhaUsuario){
                    System.out.println("O número sorteado é menor que: " + escolhaUsuario);
                }else{
                    System.out.println("O número sorteado é maior que: " + escolhaUsuario);
                }   
            }
         
         if(acerto){
             System.out.println("Parabéns você acertou!");
             System.out.println(
             """
                                                               
                                                               
                                                               
                                       ####                    
                                     ######                    
                                   ########                    
                                 ##########                    
                                 ##########                    
                               ############                    
                             ##############                    
                             ############################      
                 ########    ############################      
                 ########    ############################      
                 ########    ############################      
                 ########    ############################      
                 ########    ############################      
                 ########    ##########################        
                 ########    ########################          
                 ########    ########################          
                 ########    ######################            
                 ########    ######################                                                       
                                                               
             """
             );
         }else{
             System.out.println("Parabéns você Errou, seu merda!");
             
             System.out.println(
             """
             ⠀⠀⠀⠀⠀⠀⠀⢀⡤⠤⣄⠀⠀⠀⠀⠀⠀⠀
             ⠀⠀⠀⠀⠀⠀⠀⣾⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀
             ⠀⠀⠀⠀⠀⠀⠀⡏⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀
             ⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀
             ⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀
             ⠀⠀⠀⢀⡾⠋⠻⡇⠀⠀⢸⣧⣀⡀⠀⠀⠀⠀
             ⠀⠀⢀⣾⠁⠀⠀⡇⠀⠀⢸⠁⠀⢹⣀⠀⠀⠀
             ⢀⡴⠋⡟⠀⠀⢠⡇⠀⠀⢸⠀⠀⠀⡇⠉⢆⠀
             ⡎⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⠀⠈⣆
             ⢷⡀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸
             ⠀⠻⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾
             ⠀⠀⠈⠻⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠁
             ⠀⠀⠀⠀⠈⣷⠀⠀⠀⠀⠀⠀⠀⠀⢰⠋⠀⠀
             ⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⡏⠀⠀⠀
             ⠀⠀⠀⠀⠀⠛⠒⠒⠒⠒⠒⠒⠒⠚⠃⠀⠀⠀
             """
             );
             System.out.println("O número sorteado era: " + numerosorteado);
             
         }
         
             
             
    }
      
}
    
