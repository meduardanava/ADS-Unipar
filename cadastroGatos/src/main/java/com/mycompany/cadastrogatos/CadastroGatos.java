package com.mycompany.cadastrogatos;
import java.util.Scanner;

public class CadastroGatos {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Atributos [] cadastroGatos = new Atributos[5];
        
        String nomeGato, cor, racao, raca, tutor;

        System.out.println("***Cadastro de Gatos***");
        
        for(int i=0;i<5;i++){
            System.out.println("Informe o nome do gato: ");
            nomeGato = ler.next();
            System.out.println("Informe a cor do gato: ");
            cor = ler.next();
            System.out.println("Informe a ração que consome:");
            racao = ler.next();
            System.out.println("Informe a raça do gato: ");
            raca = ler.next();
            System.out.println("Informe o nome do tutor: ");
            tutor = ler.next();
            cadastroGatos[i] = new Atributos(nomeGato, cor, racao, raca, tutor);
        }
        
        System.out.println("\t***Lista dos Gatos***");
        
        for(int i=0;i<cadastroGatos.length;i++){
            System.out.println("\nNome: \t"+cadastroGatos[i].getNomeGato());
            System.out.println("Cor: \t"+cadastroGatos[i].getCor());
            System.out.println("Ração: \t"+cadastroGatos[i].getRacao());
            System.out.println("Raça: \t"+cadastroGatos[i].getRaca());
            System.out.println("Tutor: \t"+cadastroGatos[i].getTutor());

        }
        
    }
}