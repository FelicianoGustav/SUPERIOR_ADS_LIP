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
public class ex22 {
 
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Digíte o valor de compra: ");
       double compra = sc.nextDouble();
       double desconto = compra*0.1;
       double avista = compra-desconto;
       System.out.println("false --> para parcelado true --> para a vista");
       boolean escolha = sc.nextBoolean();
        
       if(escolha){
           System.out.println("Valor total: " + avista);
       }else{
           System.out.println("Valor total: " + compra);
       }     

    }
    
}
 

