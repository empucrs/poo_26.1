package br.pucrs;

public class Aluno extends Pessoa{
    private String matricula;
    public Aluno(String nome, String cpf, String endereco, String matricula){
        super(nome, cpf, endereco);
        this.matricula = matricula;
    }

    // este método é específico de aluno, não existe na classe pessoa
    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + getNome() + ", cpf=" + getCpf() + ", endereco="+getEndereco()+"]";
    }
}