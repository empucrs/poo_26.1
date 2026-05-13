/*
O objetivo é criar um programa que permite o cadastro de produtos por 
  categoria.
Cada produto possui um codigo, um nome e um preço. O programa deve 
  permitir a:
  * inserção de produtos
  * listagem de produtos por categoria
Nenhum produto pode ser cadastrado mais de uma vez, ou seja, o código 
  do produto deve ser único.
*/
package br.pucrs;
public class ExercicioBonus {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();

        Produto p1 = new Produto("001", "Camiseta", 29.99);
        Produto p2 = new Produto("002", "Calça Jeans", 79.99);
        Produto p3 = new Produto("003", "Tênis", 149.99);
        Produto p4 = new Produto("001", "Camiseta", 39.99);

        cadastro.adicionaProduto("Roupas", p1);
        cadastro.adicionaProduto("Roupas", p2);
        cadastro.adicionaProduto("Calçados", p3);
        cadastro.adicionaProduto("Roupas", p4);

        cadastro.listagem();
        
    }
}