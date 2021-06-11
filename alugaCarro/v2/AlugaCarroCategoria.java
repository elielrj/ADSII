package ADSII.alugaCarro.v2;

import java.util.ArrayList;
import java.util.List;

public class AlugaCarroCategoria {

    private ArrayList<Aluga> alugaCarroCategoria;

    public AlugaCarroCategoria() {
        alugaCarroCategoria = new ArrayList<>();
    }

    public void alugaCarro(List<Aluga> alugaCarroCategoria){
        for(Aluga aluga: alugaCarroCategoria){
            aluga.aluga();
        }
    }
}
