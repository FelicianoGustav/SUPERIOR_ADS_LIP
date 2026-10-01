/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios;
import java.util.Scanner;
/**
 *
 * @author 50695011863
 */
public class ex47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digíte um valor em minutos e descubra ele em horas, minutos e segundos");
        double numUser = sc.nextDouble();
        double restante = 0;
        
        double horas = Math.floor(numUser/60);
        restante = numUser%60;
        
        double minutos = Math.floor(restante/1);
        restante = numUser%1;
        
        double segundos = (numUser -(int)numUser)*60;
        
        System.out.println("Quantidade de horas: " + horas);
        System.out.println("Quantidade de minutos: " + minutos);
        System.out.println("Quantidade de segundos: " + segundos);
        
        
              
    }
}
