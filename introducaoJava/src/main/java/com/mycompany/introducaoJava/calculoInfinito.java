package com.mycompany.introducaoJava;

import java.util.Scanner;

public class calculoInfinito {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        int n, soma = 0;
        
        System.out.println("Informe quantos números deseja somar: ");
        n = ler.nextInt();
        int lista[] = new int[n];
        System.out.println("Informe os "+n+" números");
        
        for (int i =0;i<n;i++){
            System.out.println("Informe o "+ (i+1)+" número: ");
            lista[i] = ler.nextInt();
        }
        for(int i = 0; i< n; i++){
            soma+= (lista[i]);
        }
        System.out.println("O resultado da soma dos "+n+" números é : "+soma);
        
    }
    
}
