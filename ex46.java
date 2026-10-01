/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios;
import java.util.Scanner;
/**
 *
 * @author 50695011863
 */
public class ex46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digíte um número e veja se ele é a potência de 2");
        int numUser = sc.nextInt();
        int resultado = 1;
        

        while (true) {
         
         resultado*=2;
         
         if(resultado>numUser){
             System.out.println("o número não está na potência de 2");
             break;
         }else if(resultado==numUser){
             System.out.println("o número está na potência de 2");
             break;
         }
            
        }
              
    }
}
