package br.pucrs;

public class Professor extends Funcionario{
    private String departamento;
    public Professor(String nome, String cpf, String endereco, String codigo, double salario, String departamento){
        super(nome, cpf, endereco, codigo, salario);
        this.departamento = departamento;
    }

    // este método é específico de professor, não existe na classe funcionário
    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "Professor [Departamento=" + departamento + ", codigo=" + getCodigo() + ", salario=" + getSalario() + ", nome=" + getNome() + ", cpf=" + getCpf() + ", endereco="+getEndereco()+"]";
    }
}