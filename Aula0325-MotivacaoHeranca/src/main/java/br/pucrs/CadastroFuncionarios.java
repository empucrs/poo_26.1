package br.pucrs;
import java.util.ArrayList;

public class CadastroFuncionarios{
    private ArrayList<Funcionario> funcionarios;

    private void carregaFuncionarios(){
        funcionarios.add(new Funcionario("A3212","Huguinho Pato",1890.0));
        funcionarios.add(new Funcionario("A3312","Zezinho Pato",3720.0));
        funcionarios.add(new Funcionario("A3412","Luizinho Pato",8940.0));
        funcionarios.add(new Funcionario("B9931","Lala Pata",4220.0));
        funcionarios.add(new Funcionario("B9932","Lele Pata",1283.0));
        funcionarios.add(new Funcionario("B9933","Lili Pata",12438.0));
        funcionarios.add(new Funcionario("R9999","Riscovaldo",10000.0,"RISCO"));
        funcionarios.add(new Funcionario("P8888","Pesquisador1",10000.0,"PESQUISADOR",1));
        funcionarios.add(new Funcionario("P8889","Pesquisador2",10000.0,"PESQUISADOR",2));
        funcionarios.add(new Funcionario("P8890","Pesquisador3",10000.0,"PESQUISADOR",3));
    }

    public CadastroFuncionarios(){
        funcionarios = new ArrayList<>();
        carregaFuncionarios();
    }

    public void cadastraFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public Funcionario recuperaPorMatricula(String matricula){
        for(Funcionario func:funcionarios){
            if (func.getMatricula().equals(matricula)){
                return func;
            }
        }
        return null;
    }
}