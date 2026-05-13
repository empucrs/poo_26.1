package br.pucrs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio03 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: mvn exec:java -Dexec.mainClass=\"br.pucrs.Exercicio03\" -Dexec.args=\"caminho/arquivo.txt\"");
            System.exit(0);
        }

        try {
            List<String> palavras = lerPalavrasDoArquivo(args[0]);
            System.out.println("#Palavras lidas: " + palavras.size());
            Map<String, Integer> contagemPalavras = new HashMap<>();

            for(String palavra : palavras)
                if(contagemPalavras.containsKey(palavra)) 
                    contagemPalavras.put(palavra, contagemPalavras.get(palavra) + 1);
                else
                    contagemPalavras.put(palavra, 1);

            ArrayList<String> palavrasOrdenadas = new ArrayList<>(contagemPalavras.keySet());

            palavrasOrdenadas.sort(String.CASE_INSENSITIVE_ORDER);
            System.out.println("Lista de palavras ordenadas:");
            for (String palavra : palavrasOrdenadas) {
                System.out.println("- " + palavra + ": " + contagemPalavras.get(palavra));
            }            

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }


    }

    public static List<String> lerPalavrasDoArquivo(String caminhoArquivo) throws IOException {
        List<String> palavras = new ArrayList<>();

        for (String linha : Files.readAllLines(Path.of(caminhoArquivo))) {
            String palavra = linha.trim();
            if (!palavra.isEmpty()) {
                palavras.add(palavra);
            }
        }

        return palavras;
    }
}