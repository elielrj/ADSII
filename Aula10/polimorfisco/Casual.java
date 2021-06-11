package ADSII.Aula10.polimorfisco;

public class Casual implements Cumprimento{

    private String valor;

    public Casual(String valor) {
        this.valor = valor;
    }

    @Override
    public String getValor() {
        return this.valor;
    }
}
