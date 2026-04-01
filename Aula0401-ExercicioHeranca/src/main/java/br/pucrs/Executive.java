package br.pucrs;

public class Executive extends Passagem{

    public Executive(String cpf, String nome, double custoPassagem) {
        super(cpf, nome, custoPassagem);
    }

    @Override
    public void custoBagagem(int nroBagagens, int [] pesoDeCadaBagagem){
        double valor=0;

        for(int i=2; i< nroBagagens; i++)
            valor += pesoDeCadaBagagem[i] * 0.5;

        adicionaCustoPassagem(valor);
    }

    public int getMilhas(){
        return (int) (getCustoPassagem() * 0.1);
    }

}