/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios;

/**
 *
 * @author 50695011863
 */
public class ex34 {

    public static void main(String[] args) {
        System.out.println("Tabuada do 1 ao 10!");
        
        int contadorTabuada = 1;
        int tabuada = 1;
        int resultado = 0;
        
        for(contadorTabuada=1;contadorTabuada<=10;contadorTabuada++){
            
            while(tabuada <=10){
                
                resultado = contadorTabuada * tabuada;
                System.out.println("Valor: " + tabuada + " X " + contadorTabuada + " = "+resultado);

                tabuada++;
            }
            tabuada = 1;
        }
        
    }
}
