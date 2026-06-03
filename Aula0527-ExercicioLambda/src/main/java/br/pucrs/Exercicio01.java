package br.pucrs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio01 {
    public Exercicio01() {
        List<String> list = 
            Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    //ITEM A
        System.out.println("Resolvendo item A");
        // Iterar sobre uma lista de strings e imprimir o conteúdo no console.
        // ALTERNATIVA A - MODO CLASSICO
        for (String s : list)
            System.out.println(s);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        // ALTERNATIVA B - EXPLORAR LAMBDA E INTERFACES FUNCIONAIS
          // -- 1º) Construir uma classe que implementa a interface consumer e implementar o método da interface
          // -- 2ª) Construir uma classe anônima 
          //    -- posso vincular a uma variável do tipo interface consumer
          //    -- posso passar esta classe anonima por parâmetro
          // -- 3ª) Construir uma expressão lambda
          //    -- posso vincular a uma variável do tipo interface consumer
          //    -- posso passar este lambda por parâmetro (ESCOLHA)
        list.forEach(t -> System.out.println(t));
        // list.forEach(System.out::println); // Alternativa válida para manipulação da coleção
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        // ALTERNATIVA C - EXPLORAR FLUXOS
        list.stream().forEach(t -> System.out.println(t));
        // list.stream().forEach(System.out::println); // Alternativa ao comando da linha superior



    //ITEM B
        System.out.println("Resolvendo item B");
        // Criar uma string que consiste na concatenação das primeiras letras de cada string contida em uma lista de strings.
        String resultadoItemB;
        resultadoItemB = list.stream().map(x -> (x.charAt(0)+"")).collect(Collectors.joining(";"));
        System.out.println(resultadoItemB);

    //ITEM C
        System.out.println("Resolvendo item C");
        //Transformar uma lista de strings em strings maiúsculas (ou seja, alterando a lista original).
        // ALTERNATIVA A
        List<String> resultadoItemC = new ArrayList<>();
        list.forEach(e -> resultadoItemC.add(e.toUpperCase()));
        resultadoItemC.forEach(System.out::println);

        // ALTERNATIVA B
        List<String> tempItemC = new ArrayList<>(list);
        List<String> rst = tempItemC.stream().
            map(y -> y.toUpperCase()).
            toList();
        rst.forEach(k -> System.out.println(k));

    //ITEM E
        System.out.println("Resolvendo item E");

        // ALTERNATIVA A
        int count=0;
        for(String s: list)
            if(s.length()>=6)
                count++;
        System.out.println(count);

        // ALTERNATIVA B
        long contagem = list.stream().filter(s -> (s.length())>=6).count();
        System.out.println(contagem);

    }
}