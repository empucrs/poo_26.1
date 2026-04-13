package br.pucrs;

public class Coordenador extends Funcionario{
    private String curso;
    public Coordenador(String nome, String cpf, String endereco, String codigo, double salario, String curso){
        super(nome, cpf, endereco, codigo, salario);
        this.curso = curso;
    }

    // este método é específico de coordenador, não existe na classe funcionário
    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Coordenador [Curso=" + curso + ", codigo=" + getCodigo() + ", salario=" + getSalario() + ", nome=" + getNome() + ", cpf=" + getCpf() + ", endereco="+getEndereco()+"]";
    }
}