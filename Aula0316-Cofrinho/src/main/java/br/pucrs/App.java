package br.pucrs;

public class App {
    public static void main(String[] args) {

        Cofrinho c = new Cofrinho();
        c.insere(new Moeda(NomeMoeda.Cinco));
        c.insere(new Moeda(NomeMoeda.VinteCinco));
        c.insere(new Moeda(NomeMoeda.Um));
        c.insere(new Moeda(NomeMoeda.UmReal));
        c.insere(new Moeda(NomeMoeda.UmReal));
        c.insere(new Moeda(NomeMoeda.Cinquenta));
        c.insere(new Moeda(NomeMoeda.Dez));
        c.insere(new Moeda(NomeMoeda.UmReal));
        c.insere(new Moeda(NomeMoeda.Um));
        c.insere(new Moeda(NomeMoeda.VinteCinco));
        
        //a. Quantas moedas foram armazenadas no cofrinho.
        System.out.println("O cofrinho contem "+ c.getQtdadeMoedas()+" moedas.");

        //b. Quantas moedas de um real estão armazenadas no cofrinho.
        System.out.println("O cofrinho contem "+ c.getQtdadeMoedasTipo(NomeMoeda.UmReal)+ " moedas de um real.");
        
        //c. Quantas moedas de 50 centavos estão armazenadas no cofrinho.
        System.out.println("O cofrinho contem "+ c.getQtdadeMoedasTipo(NomeMoeda.Cinquenta)+ " moedas de cinquenta centavos.");

        //d. Qual o valor total em centavos armazenado no cofrinho.
        System.out.println("O cofrinho tem um total de " +c.getValorTotalCentavos() + " centavos armazenados");
        
        //e. Qual o valor total em reais armazenado no cofrinho.
        System.out.println("O cofrinho tem um total de " +c.getValorTotalReais() + " reais armazenados");
        
        //f. Qual o valor total em centavos armazenado no cofrinho após a retirada das duas últimas moedas inseridas.
        c.retira();
        c.retira();
        System.out.println("O cofrinho tem um total de " +c.getValorTotalCentavos() + " centavos armazenados depois da retirada das duas moedas");

    }
}
