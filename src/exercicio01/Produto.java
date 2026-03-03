package exercicio01;

public class Produto {

    String nome;
    double valor;
    int qntDisponivel;


    public Produto(String nome, double valor, int qntDisponivel) {
        this.nome = nome;
        this.valor = valor;
        this.qntDisponivel = qntDisponivel;
    }

    public void aumentarValor(double porcentagem) {
        valor *= (1 + porcentagem/100);
    }
}
