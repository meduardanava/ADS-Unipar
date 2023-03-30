package com.mycompany.exemploaula2903;

import com.mycompany.exemploAula2903.Aluno;
import com.mycompany.exemploAula2903.Funcionario;
import com.mycompany.exemploAula2903.Professor;

import java.util.Date;

public class ExemploAula2903 {

    public static void main(String[] args) {
        
        Aluno a = new Aluno("José Francisco", "123.456.789-00", new Date()); 
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: "+ a.nome);
        System.out.println("CPF : "+ a.cpf);
        System.out.println("Data de Nascimento: "+ a.data_nascimento.toString());
        
        Professor b = new Professor("Fernando Junior ", "987.654.321-00 ", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: "+ b.nome);
        System.out.println("CPF : "+ b.cpf);
        System.out.println("Data de Nascimento: "+ b.data_nascimento.toString());
        
        Funcionario c = new Funcionario("Jonas Mateus ", "456.123.789-00 ", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: "+ a.nome);
        System.out.println("CPF : "+ a.cpf);
        System.out.println("Data de Nascimento: "+ a.data_nascimento.toString());
    }
}
