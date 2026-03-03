package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double valor;
        int qntDisponivel;
        double porcentagem;

        System.out.print("Nome do produto --> ");
        nome = sc.next();

        System.out.print("Valor do produto --> R$ ");
        valor = sc.nextDouble();

        System.out.print("Quantidade disponível --> ");
        qntDisponivel = sc.nextInt();

        Produto produto = new Produto(nome, valor, qntDisponivel);

        System.out.print("Qual a porcentagem de aumento? ");
        porcentagem = sc.nextDouble();

        produto.aumentarValor(porcentagem);
        System.out.println(produto.valor);
    }
}
