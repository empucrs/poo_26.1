package br.pucrs;

public class App {
    public static void main(String[] args) {
        Circulo c = new Circulo(0, 0, 5);
        System.out.println(c);
        System.out.println("Área do círculo: " + c.area());

        Retangulo r = new Retangulo(0, 0, 4, 6);
        System.out.println(r);
        System.out.println("Área do retângulo: " + r.area());
    }
}
