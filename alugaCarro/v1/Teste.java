package ADSII.alugaCarro.v1;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
        Economico carroEconomico = new Economico();
        Intermediario carroIntermediario = new Intermediario();

        //CATEGORIAS
        ArrayList<Aluga> listaDeCategorias = new ArrayList<>();

        listaDeCategorias.add(carroEconomico);
        listaDeCategorias.add(carroIntermediario);

        AlugaCarro alugaCarro = new AlugaCarro();
        alugaCarro.alugaCarro(listaDeCategorias);

        //VALORES
        ArrayList<Valor> listaDeValores= new ArrayList<>();

        listaDeValores.add(carroEconomico);
        listaDeValores.add(carroIntermediario);
        alugaCarro.valorCategoria(listaDeValores);


    }
}
