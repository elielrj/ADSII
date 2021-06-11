package ADSII.Aula10.polimorfisco;

public class Formal implements Cumprimento{
    private String valor;

    public Formal() {

    }

    @Override
    public String getValor() {
        return "Como vai?";
    }
}
