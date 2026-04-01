package  br.pucrs;

public class Economy extends Passagem{

    public Economy(String cpf, String nome, double custoPassagem) {
        super(cpf, nome, custoPassagem);
    }

    @Override
    public void custoBagagem(int nroBagagens, int [] pesoDeCadaBagagem){
        super.custoBagagem(nroBagagens, pesoDeCadaBagagem);
        adicionaCustoPassagem(10.0 * nroBagagens);
    }

}