package br.pucrs;
public class Premier extends Executive{

    public Premier(String cpf, String nome, double custoPassagem) {
        super(cpf, nome, custoPassagem);
    }

    @Override   
    public double defineAssento(String assento){
        this.assento = assento;        
        return 0.0; // Assentos são gratuitos para Premier
    }

    @Override
    public void custoBagagem(int nroBagagens, int [] pesoDeCadaBagagem){
        double valor=0;

        for(int i=2; i< nroBagagens; i++)
            valor += pesoDeCadaBagagem[i] * (0.25);

        adicionaCustoPassagem(valor);
    }

    @Override
    public int getMilhas(){
        return (super.getMilhas()*2);
    }

}