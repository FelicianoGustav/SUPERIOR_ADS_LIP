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
public class exercicio6 {
    public static void main(String[] args){
        System.out.println("Digíte um número menor que 1000 e veja eles separados: ");
        Scanner sc = new Scanner(System.in);
  
        int numero1 = sc.nextInt();
        
        if(numero1 <= 0 || numero1 > 1000 ){
            System.out.println("Número inválido");
        }else{
            
            int restante = numero1;
            
            int centenas = restante/100;
            restante = restante%100;
            
            int dezenas = restante/10;
            restante = restante%10;
            
            int unidades = restante/1;
            
            System.out.println("Centenas - " + centenas);
            System.out.println("dezenas - " + dezenas);
            System.out.println("unidades - " + unidades);
        }
        

        
        
        
    }
}
