//criar uma classe distinguindo 5 atributos de um animal
//depois criar uma classe pra cadastrar 5 animais

package com.mycompany.cadastroanimais;
import java.util.Scanner;

public class CadastroAnimais {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Atributos [] cadastroAnimais = new Atributos[5];
        
        for(int i=0;i<5;i++){
            System.out.println("Informe o nome do animal: ");
            String nome = ler.next();
            System.out.println("Informe a raça do animal: ");
            String raca = ler.next();
            System.out.println("Informe o peso do animal: ");
            double peso = ler.nextDouble();
            System.out.println("Informe o tamanho do animal:");
            int tamanho = ler.nextInt();
            System.out.println("Informe a cor do animal: ");
            String cor = ler.next();
            System.out.println("Informe a idade do animal: ");
            int idade = ler.nextInt();
            cadastroAnimais[i] = new Atributos(nome, raca, peso, tamanho, cor, idade);
        }
        
        System.out.println("\t***Lista de Animais***");
        
        for(int i=0;i<cadastroAnimais.length;i++){
            System.out.println("\nNome: \t\t"+cadastroAnimais[i].getNome());
            System.out.println("Raça: \t\t"+cadastroAnimais[i].getRaca());
            System.out.println("Peso: \t\t"+cadastroAnimais[i].getPeso());
            System.out.println("Tamanho: \t"+cadastroAnimais[i].getTamanho());
            System.out.println("Cor: \t\t"+cadastroAnimais[i].getCor());
            System.out.println("Idade: \t\t"+cadastroAnimais[i].getIdade());
            System.out.print("Late: \t\t");
            cadastroAnimais[i].latir();
        }
        
    }
}