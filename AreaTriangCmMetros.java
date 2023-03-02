package com.mycompany.exercicioIntroJava;

import java.util.Scanner;

public class AreaTriangCmMetros {

    public static void main(String[] args) {
        
       Scanner ler = new Scanner(System.in);
       
       double base, altura, total;
       
       System.out.println("Informe a base do triângulo em cm: ");
       base = ler.nextDouble();
       System.out.println("Informe a altura do triângulo em cm: ");
       altura = ler.nextDouble();
       
       total = base*altura/2;
       
       System.out.println("A área do triângulo corresponde a "+total/100+" metros.");
       
    }
}
