package br.pucrs;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroProdutos{
    //private static final int MAXPROD = 1000;
    private ArrayList<Produto> produtos;
    private int contProd;
    private static final String fName = "produtos.txt";

    public CadastroProdutos(){
        produtos = new ArrayList<>();
        contProd = 0;
    }

    public void carregaProdutos(){
        String currDir = Paths.get("").toAbsolutePath().toString();
        //String nameComplete = currDir+"\\"+fName;
        Path path = Paths.get(currDir, fName);
		
        try (Scanner sc = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))){
           while (sc.hasNext()){
               String linha = sc.nextLine();
			   
               String dados[] = linha.split(";");
			   
               int codigo = Integer.parseInt(dados[0]);
               String descricao = dados[1];
               double preco = Double.parseDouble(dados[2]);
			   
               Produto p = new Produto(codigo,descricao,preco);
               produtos.add(p);
               contProd++;
           }
        }catch (IOException x){
            System.err.format("Erro de E/S: %s%n", x);
        }
    }

    public void gravaProdutos(){
        String currDir = Paths.get("").toAbsolutePath().toString();
        //String nameComplete = currDir+"\\"+fName;
        Path path = Paths.get(currDir, fName);
		
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path, StandardCharsets.UTF_8))){
			
          for(int i=0;i<produtos.size();i++){
                String linha = produtos.get(i).getCodigo()+";"+
                               produtos.get(i).getDescricao()+";"+
                               produtos.get(i).getPrecoUnitario();
                System.out.println(">"+linha);
                writer.println(linha);
            }
        }catch (IOException x){
          System.err.format("Erro de E/S: %s%n", x);
      }
    }

    public void inflacionaProdutos(){
        /*
        for(int i=0;i<produtos.size();i++){
            double novoValor = produtos.get(i).getPrecoUnitario() * 1.1;
            produtos.get(i).setPrecoUnitario(novoValor);
        }
        */

        for(Produto p:produtos){
            double novoValor = p.getPrecoUnitario() * 1.1;
            p.setPrecoUnitario(novoValor);
        }
    }

    public String toString(){
        String str = "";
        for(int i=0;i<contProd;i++){
            str = str + produtos.get(i)+"\n";
        }
        return str;
    }
	
    public static void main(String[] args){
        CadastroProdutos cp = new CadastroProdutos();
        System.out.println("Lendo arquivo");
        cp.carregaProdutos();
        System.out.println("\nProdutos carregados:");
        System.out.println(cp);
        System.out.println("\nInflacionando ...");
        cp.inflacionaProdutos();
        System.out.println("\nGravando produtos inflacionados ...");
        cp.gravaProdutos();
        System.out.println("Fim");
    }

}
