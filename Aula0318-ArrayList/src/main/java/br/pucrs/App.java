package br.pucrs;

import java.util.ArrayList;


public class App {
    public static void main(String[] args) {

        ArrayList<String> listaDeNomes = new ArrayList<String>();

        listaDeNomes.add("Edson");
        listaDeNomes.add("Silvia");
        listaDeNomes.add("Francisco");
        listaDeNomes.add("Antonio");        

        System.out.println("size da lista: "+listaDeNomes.size());
        System.out.println("toString da lista: "+listaDeNomes.toString());
        listaDeNomes.remove(listaDeNomes.size()-1);
        System.out.println("toString da lista: "+listaDeNomes.toString());

        for(String str: listaDeNomes)
            System.out.println("Nome: "+str);

        for (int idx = 0; idx < listaDeNomes.size(); idx++)
            System.out.println("nome["+idx+"]: "+listaDeNomes.get(idx));
    }
}
