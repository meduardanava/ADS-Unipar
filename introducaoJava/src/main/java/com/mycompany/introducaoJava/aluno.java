package com.mycompany.introducaoJava;

import java.util.Scanner;

public class aluno {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        String nome;
        char sexo;
            
        System.out.println("Informe o nome completo do(a) aluno(a): ");
        nome = ler.nextLine();
        System.out.println("Informe o sexo do(a) aluno(a)");
        System.out.println("F para feminino e M para masculino: ");
        sexo = ler.next().charAt(0);
        sexo = Character.toUpperCase(sexo);
        
        switch (sexo) {
            case 'F':
                System.out.println("A aluna se chama "+nome+" e é do sexo feminino.");
                break;
            case 'M':
                System.out.println("O aluno se chama "+nome+" e é do sexo masculino");
                break;
            case 'G':
                System.out.println("O(A) aluno(a) se chama "+nome+" e é gente boa");
                break;
            case 'L':
                System.out.println("O(A) aluno(a) se chama "+nome+" e é louco(a) da cabeça");
                break;
            default:
                System.out.println("O(a) aluno(a) se chama "+nome+" e é programador");
                break;
        }
    }
}

