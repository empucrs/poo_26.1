package br.pucrs;

import java.util.Arrays;

public class App {

    /*
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.registrarDispositivo(new Lustre(3));
        controlador.registrarDispositivo(new Lustre(2));
        controlador.registrarDispositivo(new Lampada());
        controlador.ligarTodosDispositivos();
    }
    */

    public static void main(String[] args) {
        String[] letras = {"c","a","b"};
        System.out.println("Antes da ordenação da string:");
        imprimeArray(letras);
        Arrays.sort(letras);
        System.out.println("Depois da ordenação:");
        imprimeArray(letras);
/*
        PessoaV1[] pessoasv1 = new PessoaV1[3];
        pessoasv1[0] = new PessoaV1("John Doe", 22);
        pessoasv1[1] = new PessoaV1("Mary Doe", 20);
        pessoasv1[2] = new PessoaV1("Charles Xavier", 50);
        System.out.println("Antes da ordenação de V1:");
        imprimeArray(pessoasv1);
        Arrays.sort(pessoasv1);
        System.out.println("Depois da orndenação:");
        imprimeArray(pessoasv1);
 */
        PessoaV2[] pessoasv2 = new PessoaV2[3];
        pessoasv2[0] = new PessoaV2("John Doe", 22);
        pessoasv2[1] = new PessoaV2("Mary Doe", 20);
        pessoasv2[2] = new PessoaV2("Charles Xavier", 50);
        System.out.println("Antes da ordenação de V2:");
        imprimeArray(pessoasv2);
        Arrays.sort(pessoasv2);
        System.out.println("Depois da orndenação:");
        imprimeArray(pessoasv2);
    }

    public static void imprimeArray (Object[] array) {
        for(Object elemento : array) {
            System.out.println(elemento);
        }
    }

}
