package exercicio03;

import java.util.Random;

public class BilheteUnico {

    int numBilhete;
    String nomeUsuario;
    double saldo;
    static double tarifa= 5.40;
    String tipoTarifa;


    public BilheteUnico(String nomeUsuario, int numBilhete){
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
        double valor = tarifa;
        if (tipoTarifa.equalsIgnoreCase("estudante") ||
                      tipoTarifa.equalsIgnoreCase("professor")){
            valor = valor / 2;
        }

        if (saldo < valor) {
            return;
        }
    }



}
