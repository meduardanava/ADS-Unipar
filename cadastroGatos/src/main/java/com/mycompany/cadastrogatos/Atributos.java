package com.mycompany.cadastrogatos;


public class Atributos {
    
    private String nomeGato;
    private String cor;
    private String racao;
    private String raca;
    private String tutor;

    public Atributos(String nomeGato, String cor, String racao, String raca, String tutor) {
        this.nomeGato = nomeGato;
        this.cor = cor;
        this.racao = racao;
        this.raca = raca;
        this.tutor = tutor;
    }

    public String getNomeGato() {
        return nomeGato;
    }

    public void setNomeGato(String nomeGato) {
        this.nomeGato = nomeGato;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRacao() {
        return racao;
    }

    public void setRacao(String racao) {
        this.racao = racao;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

}
