package exercicio03;

import java.util.Random;

public class BilheteUnico {

    int numBilhete;
    String nomeUsuario;
    double saldo;
    static double tarifa= 5.40;
    int tipoTarifa;


    public BilheteUnico(String nomeUsuario, int tipoTarifa){
        Random r = new Random();
        this.numBilhete = r.nextInt(1000,9999);
        this.nomeUsuario = nomeUsuario;
        this.saldo = 0;
        this.tipoTarifa = tipoTarifa;
    }

    public void carregar(double valor){
        if(valor <= 0){
            return;
        }
        saldo += valor;
    }

    public void passarNaCatraca(){
        //VERIFICANDO O TIPO, A CONDIÇÃO E O VALOR COBRADO/RESTANTE DA TARIFA E CATRACA
        double valor = tarifa;
        if (tipoTarifa==1){
            if (saldo >= valor/2){
                saldo -= valor / 2;
                System.out.printf("Saldo restante: R$%.2f", saldo);
            }else {
                System.out.printf("Saldo insuficiente!");
            }
        } else if (tipoTarifa == 2) {
            if (saldo >= valor/2) {
                saldo -= valor;
                System.out.printf("Saldo restante: R$%.2f", saldo);
            }else {
                System.out.printf("Saldo insuficiente!");
            }
        } else {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.printf("Saldo restante: R$%.2f", saldo);
            }else {
                System.out.printf("Saldo insuficiente!");
            }

        }
    }





}
