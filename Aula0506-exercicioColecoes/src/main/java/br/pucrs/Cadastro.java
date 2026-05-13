package br.pucrs;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Cadastro{

    private Map<String, Set<Produto>> categorias;

    public Cadastro() {
        this.categorias = new HashMap<>();
    }

    public void adicionaProduto(String categoria, Produto produto){
        if(categorias.containsKey(categoria)){
            Set<Produto> produtos = categorias.get(categoria);
            if(!produtos.add(produto)){
                System.out.println("Produto com código " + produto.getCodigo() + " já cadastrado na categoria " + categoria);
            }
        }
        else{
            Set<Produto> produtos = new HashSet<>();
            produtos.add(produto);
            categorias.put(categoria, produtos);
        }
    }

    public void listagem(){
        for(String categoria : categorias.keySet()){
            Set<Produto> produtos = categorias.get(categoria);
            System.out.println("Produtos na categoria " + categoria + ":");
            for(Produto produto : produtos){
                System.out.println("- " + produto.getNome() + " (Código: " + produto.getCodigo() + ", Preço: " + produto.getPreco() + ")");
            }
            System.out.println();
        }
    }
}