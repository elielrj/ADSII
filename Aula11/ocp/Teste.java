package ADSII.Aula11.ocp;

public class Teste {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        System.out.println(pedido.total());
        pedido.definirDesconto(new Natal());
        System.out.println(pedido.total());




    }


}
