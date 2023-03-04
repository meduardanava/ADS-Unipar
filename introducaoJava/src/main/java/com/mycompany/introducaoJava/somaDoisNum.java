package com.mycompany.introducaoJava;

import java.util.Scanner;

public class somaDoisNum {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.printf("Informe o primeiro valor: ");
        num1 = ler.nextInt();
        System.out.printf("Informe o segundo valor: ");
        num2 = ler.nextInt();
        
        System.out.printf("\nResultados:\n");
        System.out.printf("%d + %d = %3d\n", num1, num2, (num1 + num2));
        System.out.printf("%d - %d = %3d\n", num1, num2, (num1 - num2));
        System.out.printf("%d * %d = %3d\n", num1, num2, (num1 * num2));
        System.out.printf("%d / %d = %3d (divisão inteira)\n", num1, num2,(num1 / num2));
        System.out.printf("%d / %d = %6.3f (divisão exata)\n", num1, num2,((double)num1 / num2));

    }
}
