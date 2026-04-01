package br.pucrs;

public class Passagem{

    private String cpf, nome;
    protected String assento; // Assento foi definido como protected para mostrar o funcionamento na herança
    private double custoPassagem; // Custo de passagem foi definido com private e precisa de setter para ser modificado nas subclasses

    public Passagem(String cpf, String nome, double custoPassagem) {
        this.cpf = cpf;
        this.nome = nome;
        this.custoPassagem = custoPassagem;
    }

    public void custoBagagem(int nroBagagens, int [] pesoDeCadaBagagem){
        for(int i=0; i< nroBagagens; i++)
            custoPassagem += pesoDeCadaBagagem[i] * 0.5;        
    }

    public double defineAssento(String assento){
        this.custoPassagem += 5.0;
        this.assento = assento;
        return 5.0;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
    
    public String getAssento() {
        return assento;
    }

    public double getCustoPassagem() {
        return custoPassagem;
    }

    public void adicionaCustoPassagem(double valor) {
        this.custoPassagem += valor;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "{" +
                "cpf='" + getCpf() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", assento='" + getAssento() + '\'' +
                ", custoPassagem=" + getCustoPassagem() +
                '}';
    }


}