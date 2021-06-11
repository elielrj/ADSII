package ADSII.Aula11.s.v2;

public class Boleto implements MeioDePagamento{

    private double valor;

    public Boleto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String meioDePagamento() {
        return null;
    }
}
