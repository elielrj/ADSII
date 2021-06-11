package ADSII.Aula11.s.v2;

import java.util.ArrayList;
import java.util.List;

public class Fatura {
    private Cliente cliente;
    private double valor;
    private boolean estaPaga;
    private List<Pagamento> pagamentos;

    public Fatura(Cliente cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.estaPaga = false;
        this.pagamentos = new ArrayList<>();
    }

    public void adicionar(Pagamento pagamento){
        pagamentos.add(pagamento);
    }

    public double valorTotal() {
        return valor;
    }
    public void pagar(){
        estaPaga = true;
    }

    public boolean estaPaga(){
        return estaPaga;
    }
}
