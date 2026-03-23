package br.pucrs;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DemoLeArquivo {
    public static void main(String args[]){
        // Obtem o caminho para o diretório corrente
        String currDir = Paths.get("").toAbsolutePath().toString();
        // Monta o nome do arquivo
        //String nameComplete = currDir+"\\"+"numeros.dat";
        // Cria acesso ao "diretorio" da mídia (disco)
        Path path = Paths.get(currDir, "numeros.dat");
        System.out.println(" Lendo de => "+path.toString());

        // o processamento do arquivo apontado
        int acum = 0;
        double media = 0.0;
        String linha = "";

         // Usa a classe scanner para fazer a leitura do arquivo
         try (Scanner sc = new Scanner(
                Files.newBufferedReader(path, StandardCharsets.UTF_8))
             ){
            linha = sc.nextLine();
         }catch (IOException x){
             System.err.format("Erro de E/S: %s%n", x);
         }

         System.out.println("O conteudo consumido é: "+linha);

         String[] numeros = linha.split(",");
         System.out.println("O conteúdo no vetor de string é "+ numeros);

         //for(int i=0;i<numeros.length;i++){         
             //acum += Integer.parseInt(numeros[i]);

        for(String valor: numeros){
            acum+=Integer.parseInt(valor);
        }

         media = acum/numeros.length;

         System.out.println("Quantidade de valores lidos: "+numeros.length);
         System.out.println("Somatorio: "+acum);
         System.out.println("Media: "+media);
    }
}