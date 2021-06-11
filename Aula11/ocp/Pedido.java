package ADSII.Aula11.ocp;

public class Pedido {
    private Desconto desconto;

    public double total(){
        if(desconto == null){
            return 100;
        } else {
            return 100 - (100 * (desconto.getDesconto()/100));
        }
    }

    public void definirDesconto(Desconto desconto){
        this.desconto = desconto;
    }

}
