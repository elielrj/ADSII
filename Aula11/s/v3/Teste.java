package ADSII.Aula11.s.v3;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Fatura fatura = new Fatura(new Cliente(),100);

        Boleto boleto1 = new Boleto(50);
        Boleto boleto2 = new Boleto(50);

        ArrayList<Boleto> boletos = new ArrayList<>();

        boletos.add(boleto1);
        boletos.add(boleto2);

        ProcessadorDeBoletos processador = new ProcessadorDeBoletos();

        processador.processa(boletos,fatura);

        System.out.println(fatura.valorTotal());
        System.out.println(fatura.estaPaga());

    }
}
