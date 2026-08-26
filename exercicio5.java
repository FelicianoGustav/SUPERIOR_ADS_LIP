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
public class exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digíte três número e os ordene");
        
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();
        
        if(numero1 < numero2 && numero1 < numero3 ){
            
            if(numero2<numero3){
                System.out.println(numero1);
                System.out.println(numero2);
                System.out.println(numero3);
            
            }else if(numero3<numero2){
                System.out.println(numero1);
                System.out.println(numero3);
                System.out.println(numero2);
            }   
        }else if(numero2<numero3){
            
        }
                if(numero1<numero3){
                System.out.println(numero2);
                System.out.println(numero1);
                System.out.println(numero3);
        }else if(numero3<numero1){
                System.out.println(numero2);
                System.out.println(numero3);
                System.out.println(numero1); 
                }
    }
    
}
