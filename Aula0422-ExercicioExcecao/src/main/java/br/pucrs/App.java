package br.pucrs;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        ConverteParaInteiro cpi = new ConverteParaInteiro();

        try {
            cpi.getInt();            
        } catch (RuntimeException e) {
            System.out.println("Estou tratando a exceção para não aparecerem msgs estranhas para o usuario");
        }
        catch(UmaExcecaoNova e){
            System.out.println("Uma exceção do tipo UmaExceçãoNova foi observada");
        }
        catch(IOException e){
            System.out.println("Uma exceção genérica do tipo IOException foi observada");
        }
        catch(Exception e){
            System.out.println("Uma exceção genérica do tipo Exception foi observada");
        }

    }
}
