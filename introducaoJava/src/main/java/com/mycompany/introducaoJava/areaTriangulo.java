
package com.mycompany.introducaoJava;

import java.util.Scanner;

public class areaTriangulo {

    public static void main(String[] args) {
        
       Scanner ler = new Scanner(System.in);
       
       int base, altura; 
       
       System.out.println("Informe a base do triângulo em cm: ");
       base = ler.nextInt();
       System.out.println("Informe a altura do triângulo em cm: ");
       altura = ler.nextInt();
       
       System.out.println("A área do triângulo corresponde a "+base*altura/2+" cm.");
       
    }
}
