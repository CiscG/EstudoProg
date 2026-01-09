package aplicacao;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //aula objetos
        Scanner scan = new Scanner(System.in);
        Produtos produto = new Produtos();
        System.out.println("Nome do produto: ");
        produto.produto = scan.next();

        System.out.println("Insira a quantidade: ");
        produto.quantidade = scan.nextDouble();

        System.out.println("Insira o preço individual");
        produto.preco = scan.nextDouble();

        System.out.println("Confirmação: " + produto.produto+", Estoque atual: " + produto.quantidade + ", preço: "+ produto.preco);


        System.out.println("Deseja acrescentar produtos ao estoque? ");
        int estoque = scan.nextInt();
        produto.addProdutos(estoque);

        System.out.println("Confirmação Reabastecimento: " + produto.produto+", Estoque atual: " + produto.quantidade + ", preço: "+ produto.preco);

        System.out.println("Deseja remover produtos ao estoque? ");
        estoque = scan.nextInt();
        produto.subProdutos(estoque);

        System.out.println("Atualização pós venda: " + produto.produto+", Estoque pós venda: " + produto.quantidade + ", preço: "+ produto.preco + "Valor atual do estoque: " + produto.quantidade* produto.preco);


        JOptionPane.showInternalMessageDialog(null, "Atualização pós venda: " + produto.produto+", Estoque atual: " + produto.quantidade + ", preço: "+ produto.preco);
        scan.close();
    }
}
