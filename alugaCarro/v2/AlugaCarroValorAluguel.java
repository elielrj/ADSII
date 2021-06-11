package ADSII.alugaCarro.v2;

import java.util.ArrayList;
import java.util.List;

public class AlugaCarroValorAluguel {

    private ArrayList<Aluga> valorAluguelCategoria;

    public AlugaCarroValorAluguel() {
        valorAluguelCategoria = new ArrayList<>();
    }

    public void valorAluguel(List<Aluga> valorAluguelCategoria){
        for(Aluga aluga: valorAluguelCategoria){
                aluga.aluga();
        }
    }
}
