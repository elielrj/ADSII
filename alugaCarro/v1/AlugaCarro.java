package ADSII.alugaCarro.v1;

import java.util.ArrayList;
import java.util.List;

public class AlugaCarro {

    private ArrayList<Aluga> alugaCarro;
    private ArrayList<Valor> valorCategoria;

    public AlugaCarro() {
        alugaCarro = new ArrayList<>();
        valorCategoria = new ArrayList<>();
    }

    public void alugaCarro(List<Aluga> alugaCarro){
        for(Aluga aluga: alugaCarro){
            if(aluga instanceof Economico){
                aluga.alugaEconomico();
            }else if(aluga instanceof Intermediario){
                aluga.alugaIntermediario();
            }
        }
    }

    public void valorCategoria(List<Valor> valorCategoria){
        for(Valor valor: valorCategoria){
            if(valor instanceof Economico){
                valor.valorEconomico();
            }else if(valor instanceof Intermediario){
                valor.valorIntermediario();
            }
        }
    }
}
