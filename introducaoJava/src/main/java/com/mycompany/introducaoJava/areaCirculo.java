package com.mycompany.introducaoJava;

import java.util.Scanner;

public class areaCirculo {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        double raio, resul;
        
        System.out.println("Informe o raio do círculo que deseja calcular em cm: ");
        raio = ler.nextDouble();
       
        //resul = (raio*raio)*Math.PI;
        resul = (22*raio*raio)/7;
        
        //System.out.println("A área do círculo é de "+resul+" centímetros.");
        //System.out.println("A área do círculo é de "+resul/100+" metros.");
        
        System.out.printf("A área do círculo em centímetros é de: %.4f",resul);
        System.out.printf("\nA área do círculo em metros é de: %.4f",(resul/100));
    }
    
}
