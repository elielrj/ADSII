package ADSII.Aula11.s.v3;

import java.util.ArrayList;

public class ProcessadorDeBoletos {

    public void processa(ArrayList<Boleto> boletos, Fatura fatura){

        double total = 0;

        for(Boleto boleto: boletos){
            Pagamento pagamento = new Pagamento(boleto.getValor(),boleto);
            fatura.adicionar(pagamento);
            total+=boleto.getValor();
        }

        if(fatura.valorTotal() <= total){
            fatura.pagar();
        }
    }
}
