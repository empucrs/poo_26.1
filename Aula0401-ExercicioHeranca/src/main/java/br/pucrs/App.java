package br.pucrs;

public class App {
    public static void main(String[] args) {
        Passagem p = new Passagem("12345678900", "João da Silva", 100.0);
        System.out.println(p);

        p.custoBagagem(2, new int[]{10, 20});
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(p);

        p.defineAssento("12A");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(p);

        Economy e = new Economy("98765432100", "Maria Oliveira", 100.0);
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println(e);

        e.custoBagagem(2, new int[]{10, 20});
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(e);

        e.defineAssento("14B");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(e);

        Executive ex = new Executive("55555555555", "Carlos Pereira", 100.0);
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println(ex);     

        ex.custoBagagem(3, new int[]{30, 20, 10});
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(ex);
        ex.defineAssento("1A");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");       
        System.out.println(ex);
        System.out.println("Milhas acumuladas: " + ex.getMilhas());

        Premier pr = new Premier("11111111111", "Ana Souza", 100.0);
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println(pr); 

        pr.custoBagagem(3, new int[]{30, 20, 10});
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(pr);

        pr.defineAssento("2B");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");   
        System.out.println(pr);
        System.out.println("Milhas acumuladas: " + pr.getMilhas());
    }
}
