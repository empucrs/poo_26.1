package br.pucrs;

import javax.management.RuntimeErrorException;

public class Circulo {
    private int centrox;
    private int centroy;
    private int raio;

    public Circulo(int centrox, int centroy, int raio) {
        if (centrox < 0) {
            throw new IllegalArgumentException("Valor de centrox negativo");
        }
        if (centroy < 0) {
            throw new IllegalArgumentException("Valor de centroy negativo");
        }
        if (raio <= 0) {
            throw new IllegalArgumentException("Valor de raio não positivo");
        }
        this.centrox = centrox;
        this.centroy = centroy;
        this.raio = raio;
    }

    public int getCentrox() {
        return centrox;
    }

    public int getCentroy() {
        return centroy;
    }

    public int getRaio() {
        return raio;
    }

    public double area() {
        return Math.PI * raio * raio;
    }

    public void copia(Circulo umCirculo) throws CirculoInvalidoException {
        if (umCirculo == null) {
            throw new CirculoInvalidoException("Circulo não pode ser nulo");
        }
        this.centrox = umCirculo.centrox;
        this.centroy = umCirculo.centroy;
        this.raio = umCirculo.raio;

    }

    public static void main(String[] args) {
        try {
            System.out.println("criando o círculo c1");
            Circulo c1 = new Circulo(-1, 1, 5);
            System.out.println("Circulo1 criado com sucesso");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar o círculo: " + e.getMessage());
        }

        System.out.println("fim da try do circulo 1");

        try {
            System.out.println("criando o círculo c2");
            Circulo c2 = new Circulo(1, -1, 5);
            System.out.println("Circulo2 criado com sucesso");
        } catch (RuntimeException e) {
            System.out.println("Erro ao criar o círculo: " + e.getMessage());
        }

        System.out.println("fim da try do circulo 2");

        try {
            System.out.println("criando o círculo c3");
            Circulo c3 = new Circulo(1, 1, 0); // Isso lançará uma exceção
            System.out.println("Circulo3 criado com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao criar o círculo: " + e.getMessage());
        }

        System.out.println("fim da try do circulo 3");

        try {
            System.out.println("criando o círculo c4");
            Circulo c4 = new Circulo(-1, -1, -5); // Isso lançará uma exceção
            System.out.println("Circulo4 criado com sucesso");
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar o círculo: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Erro ao criar o círculo: " + e.getMessage());
        }

        System.out.println("fim da try do circulo 4");

        try {
            System.out.println("criando o círculo c5");
            Circulo c5 = new Circulo(1, 1, 5);
            System.out.println("Circulo5 criado com sucesso");

        } 
        catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar ou copiar o círculo: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Erro ao criar ou copiar o círculo: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Erro ao criar ou copiar o círculo: " + e.getMessage());
        }
    }
}
