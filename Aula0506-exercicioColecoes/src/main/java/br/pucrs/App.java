package br.pucrs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Faltam argumento");
            System.out.println("Informe um número inteiro n como argumento");
            System.exit(0);
        }

        int n = Integer.parseInt(args[0]);

        Set<Integer> todosNumeros = new HashSet<>();
        for(int i=2; i<n+1; i++)
            todosNumeros.add(i);

        Set<Integer> [] numerosARemover = new TreeSet[(int)Math.sqrt(n)];

        int count=0;
        for(int i=2; i<((int)Math.sqrt(n))+1; i++){
            numerosARemover[count++]=new TreeSet<>();
            for(int val=i; val<n; val+=i)                
                if(i!=val) numerosARemover[count-1].add(val);
        }

        Set<Integer> resultado = new TreeSet(todosNumeros);
        for(int i=0; i<numerosARemover.length; i++){
            System.out.print("Conjunto formado pelo valor "+(i+2)+": ");
            if((numerosARemover[i]==null)||(numerosARemover[i].isEmpty()))
                System.out.println("Vazio");
            else{
                resultado.removeAll(numerosARemover[i]);
                System.out.println(numerosARemover[i]);
            } 
            System.out.println();
            
        }            

        System.out.println("Todos os numeros");
        System.out.println(todosNumeros);
        System.out.println("numeros primos");
        System.out.println(resultado);

    }
}
