package ADSII.Aula11.ocp;

public class DiaDosPais implements Desconto {
    private double desconto;

    public DiaDosPais(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double getDesconto() {
        return desconto;
    }
}
