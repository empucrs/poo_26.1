package br.pucrs;

public class Funcionario{
    public static final double LIM_ISENCAO_IR = 2000;
    private String matricula;
    private String nome;
    private double salarioBruto;
    private String categoria; // "NORMAL"; "RISCO"; "PESQUISADOR"
    private int especializacao; // 1; 2; 3 até este momento só para pesquisadores
    
    public Funcionario(String matricula, String nome, double salarioBruto){
        this(matricula, nome, salarioBruto, "NORMAL", -1);
    }

    public Funcionario(String matricula, String nome, double salarioBruto, String categoria){
        this(matricula, nome, salarioBruto, "RISCO", -1);
    }

    public Funcionario(String matricula, String nome, double salarioBruto, String categoria, int especializacao){
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        if (especializacao != -1){
            this.categoria = "PESQUISADOR";
        }
        else{         
            this.categoria = categoria.toUpperCase();
        }

        if(this.categoria.equals("PESQUISADOR")){
            if (especializacao < 1 || especializacao > 3){
                throw new IllegalArgumentException("Especialização deve ser entre 1 e 3");
            }
            this.especializacao = especializacao;
        }
        else if(this.categoria.equals("RISCO")){
            this.especializacao = -1;
        }
        else if(!this.categoria.equals("PESQUISADOR")){
            this.especializacao = -1;
        }        
    }

	public String getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalarioBruto() {
        return salarioBruto;
	}
    
    public double getINSS(){
        return salarioBruto*0.1;
    }

    public double getImpRenda(){
        double NSBruto;
        if(!categoria.equals("RISCO")){            
            NSBruto = this.salarioBruto;
        }   
        else{
            NSBruto = salarioBruto+getAdicionalRisco();
        }

        if (NSBruto <= LIM_ISENCAO_IR){
            return 0.0;
        }else{
            double aux = NSBruto - LIM_ISENCAO_IR;
            double ir = aux * 0.2;
            return ir;
        }
    }

    private double getAdicionalRisco(){
        return (salarioBruto - getINSS())*0.25;
    }

    private double getAdicionalPesquisa(){
        double salarioBaseDeCalculo = salarioBruto - getINSS() - getImpRenda();
        if(especializacao == 1){
            return salarioBaseDeCalculo*0.05;
        }
        else if(especializacao == 2){
            return salarioBaseDeCalculo*0.1;
        }
        else if(especializacao == 3){
            return salarioBaseDeCalculo*0.2;
        }
        else{
            return 0.0;
        }
    }

    public double getSalarioLiquido(){
        if(categoria.equals("RISCO")){                    
            return salarioBruto + getAdicionalRisco() - getINSS() - getImpRenda();
        }
        else if(categoria.equals("PESQUISADOR")){
            return salarioBruto + getAdicionalPesquisa() - getINSS() - getImpRenda();   
        }
        else{
            return salarioBruto - getINSS() - getImpRenda();
        }
    }

    public String toString() {
        String aux = "";
        aux += "Categoria: "+this.categoria+"\n";
        aux += "Matricula: "+this.getMatricula()+"\n";
        aux += "Nome: "+this.getNome()+"\n";
        aux += "Salario bruto: "+this.getSalarioBruto()+"\n";
        aux += "(-) INSS: "+this.getINSS()+"\n";
        aux += "(-) IR: "+this.getImpRenda()+"\n";
        if(categoria.equals("RISCO")){
            aux += "(+) Adicional de risco: "+this.getAdicionalRisco()+"\n";
        }
        if(categoria.equals("PESQUISADOR")){
            aux += "(+) Adicional de pesquisa (N"+this.especializacao+"): "+this.getAdicionalPesquisa()+"\n";
        }
        aux += "Salario liquido: "+this.getSalarioLiquido()+"\n";
        aux += "----------";
        return aux;    
    }
}