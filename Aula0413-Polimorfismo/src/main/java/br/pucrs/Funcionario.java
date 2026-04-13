package br.pucrs;

public class Funcionario extends Pessoa{
    private String codigo;
    private double salario;
    public Funcionario(String nome, String cpf, String endereco, String codigo, double salario){
        super(nome, cpf, endereco);
        this.codigo = codigo;
        this.salario = salario;
    }

    // métodos que são específicos de funcionário, não existem na classe pessoa
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    public String getCodigo() {
        return codigo;
    }
    public double getSalario() {
        return salario; 
    }
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    
    @Override
    public String toString() {
        return "Funcionario [codigo=" + codigo + ", salario=" + salario + ", nome=" + getNome() + ", cpf=" + getCpf() + ", endereco="+getEndereco()+"]";
    }

}