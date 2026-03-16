package br.pucrs;

public class Cofrinho{

    // capacidade máxima de recepção de moedas
    private final int capacidadeMaximaDeMoedas = 20;
    private Moeda espacoParaMoedas [];
    private int quantidadeDeMoedas;

    public Cofrinho(){
        espacoParaMoedas = new Moeda[capacidadeMaximaDeMoedas];
        quantidadeDeMoedas=0;
    }

    // Insere uma moeda no cofrinho. 
    // Como um “cofrinho” tem capacidade limitada, deve retornar true se conseguiu inserir a moeda 
    //   e false caso contrário.
    public boolean insere(Moeda moeda){
        if(quantidadeDeMoedas<capacidadeMaximaDeMoedas){
            // então eu posso receber moedas no crofrinho
            espacoParaMoedas[quantidadeDeMoedas]=moeda;
            quantidadeDeMoedas++;
            return true;
        }
        else{
            // o crofrinho está cheio e não pode receber mais moedas
            return false;
        }
    }

    // Retira do cofrinho a última moeda inserida (se esta operação for chamada várias vezes 
    //   deve ir retirando todas as moedas na ordem inversa em que foram inseridas). 
    // Deve retornar a moeda retirada ou “null” caso o cofrinho esteja vazio
    public Moeda retira(){


        if(quantidadeDeMoedas!=0){
            // Tem moedas no cofrinho para serem retiradas
            quantidadeDeMoedas--;
            int posicaoDaUltimaInsercao = quantidadeDeMoedas;
            Moeda moedaASerRetornada = espacoParaMoedas[posicaoDaUltimaInsercao];
            espacoParaMoedas[posicaoDaUltimaInsercao]=null;
            return moedaASerRetornada;
        }
        else{
            // Não tem moedas no cofrinho
            return null;
        }
        //Alternativa 2
        /*
        if(quantidadeDeMoedas!=0){
            return espacoParaMoedas[--quantidadeDeMoedas];
        }
        return null;
        */        

        //Alternativa 3
        //return (quantidadeDeMoedas!=0)?espacoParaMoedas[--quantidadeDeMoedas]:null;
    }

    //Informa quantas moedas estão guardadas no cofrinho
    public int getQtdadeMoedas(){
        return quantidadeDeMoedas;        
    }

    //Informa quantas moedas de um certo tipo estão guardadas no cofrinho
    public int getQtdadeMoedasTipo( NomeMoeda nomeMoeda){

        int moedasPorTipo=0;

        for(int idx=0; idx<quantidadeDeMoedas; idx++)
            if(espacoParaMoedas[idx].getNomeMoeda()==nomeMoeda)
                moedasPorTipo++;

        return moedasPorTipo;

    }

    //Informa o valor total armazenado no cofrinho (em centavos)
    public int getValorTotalCentavos(){
        int totalCentavos=0;

        for(int idx=0; idx<quantidadeDeMoedas; idx++)
            totalCentavos+=espacoParaMoedas[idx].getValorCentavos();

        return totalCentavos;
    }

    //Informa o valor total armazenado no cofrinho (em reais)
    public double getValorTotalReais(){
        double totalCentavos=0;

        for(int idx=0; idx<quantidadeDeMoedas; idx++)
            totalCentavos+=espacoParaMoedas[idx].getValorReais();

        return totalCentavos;

    }

}