package br.pucrs;

public class Pessoa{
    private String nome, cpf, endereco;
    public Pessoa(String nome, String cpf, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;    
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", endereco="+endereco+"]";
    }
}