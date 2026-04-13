package br.pucrs;

public class Retangulo extends FiguraBidimensional {
    private int largura;
    private int altura;

    public Retangulo(int centrox, int centroy, int largura, int altura) {
        super(centrox, centroy);
        this.largura = largura;
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public double area() {
        return largura * altura;
    }

}