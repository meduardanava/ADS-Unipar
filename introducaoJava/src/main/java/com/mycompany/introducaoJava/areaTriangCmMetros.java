package com.mycompany.introducaoJava;

import java.util.Scanner;

public class areaTriangCmMetros {

    public static void main(String[] args) {
        
       Scanner ler = new Scanner(System.in);
       
       double base, altura, total, metros;
       
       System.out.println("Informe a base do triângulo em cm: ");
       base = ler.nextDouble();
       System.out.println("Informe a altura do triângulo em cm: ");
       altura = ler.nextDouble();
       
       total = base*altura/2;
       metros = total/100;
       
       System.out.println("A área do triângulo corresponde a "+metros+" metros.");
       
       if(metros > 10){
           System.out.println("Hello World");
        }else{
           System.out.println("...");
        }
    }
}
