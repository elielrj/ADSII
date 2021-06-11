package ADSII.alugaCarro.v1;

public class Economico  implements Aluga, Valor{

    @Override
    public void alugaEconomico(){
        System.out.println("Carro Econômico");
    }

    @Override
    public void alugaIntermediario(){
        System.out.println("Carro de outra classe");
    }


    @Override
    public void valorEconomico() {
        System.out.println("Valor Econômico");
    }

    @Override
    public void valorIntermediario() {
        System.out.println("Valor inexistênte");
    }
}
