package ADSII.alugaCarro.v1;

public class Intermediario implements Aluga, Valor{


    @Override
    public void alugaEconomico(){
        System.out.println("Carro de outra classe");
    }

    @Override
    public void alugaIntermediario(){
        System.out.println("Carro Intermediário");

    }

    @Override
    public void valorEconomico() {
        System.out.println("Valor inexistênte");
    }

    @Override
    public void valorIntermediario() {
        System.out.println("Valor Intermediário");
    }
}
