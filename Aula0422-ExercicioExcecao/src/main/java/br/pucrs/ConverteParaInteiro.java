package br.pucrs;
import java.io.IOException;
import java.util.Scanner;

public class ConverteParaInteiro{
    Scanner sc;

    public ConverteParaInteiro(){
        sc = new Scanner(System.in);
    }

    public int getInt() throws UmaExcecaoNova, IOException{

        int resultado=-1;
        try {
            System.out.print("Informe um valor inteiro: ");
            String str = sc.nextLine();
            System.out.println("O valor informado foi "+str);

            resultado = Integer.parseInt(str);

        } catch (Exception e) {
            System.out.println("Percebi uma exceção e estou tratando dentro da getInt");

            /* Excecao da primeira parte do exercicio */
            //IllegalArgumentException iae = new IllegalArgumentException("Minha anotação: "+e.getMessage());
            //throw iae;
            // Alternativa de lançamento da exceção
            //throw new IllegalArgumentException("Minha anotação: "+e.getMessage());

            /* Exceção da segunda parte do exercicio */
            UmaExcecaoNova uen = new UmaExcecaoNova("Uma exceção criada a partir de IOException");
            throw uen;

        }

        return resultado;
        
    }

}