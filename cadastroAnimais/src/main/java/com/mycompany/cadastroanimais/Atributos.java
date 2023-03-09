package com.mycompany.cadastroanimais;

    public class Atributos {
        
        private String nome;
        private String raca;
        private double peso;
        private int tamanho;
        private String cor;
        private int idade;

        public Atributos(String nome, String raca, double peso, int tamanho, String cor, int idade) {
            this.nome = nome;
            this.raca = raca;
            this.peso = peso;
            this.tamanho = tamanho;
            this.cor = cor;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getRaca() {
            return raca;
        }

        public void setRaca(String raca) {
            this.raca = raca;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public double getTamanho() {
            return tamanho;
        }

        public void setPeso(int tamanho) {
            this.tamanho = tamanho;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        } 
        
        public void latir(){
            if(this.tamanho > 60){
                System.out.print("Wooof, Wooof!");
            }else if(this.tamanho > 14){
                System.out.print("Ruff, Ruff!");
            }else{
                System.out.print("Yipi, Yipi!");
            }

        }
             
    }
