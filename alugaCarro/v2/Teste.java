package ADSII.alugaCarro.v2;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
        Economico carroEconomico = new Economico();
        Intermediario carroIntermediario = new Intermediario();

        //CATEGORIAS
        System.out.println("CATEGORIAS");
        ArrayList<Aluga> listaDeCategorias = new ArrayList<>();

        listaDeCategorias.add(carroEconomico);
        listaDeCategorias.add(carroIntermediario);

        AlugaCarroCategoria alugaCarroCategoria = new AlugaCarroCategoria();
        alugaCarroCategoria.alugaCarro(listaDeCategorias);

        //VALORES
        System.out.println("\nVALORES");
        ArrayList<Aluga> listaDeValores= new ArrayList<>();

        listaDeValores.add(carroEconomico);
        listaDeValores.add(carroIntermediario);

        AlugaCarroValorAluguel alugaCarroValorAluguel = new AlugaCarroValorAluguel();
        alugaCarroValorAluguel.valorAluguel(listaDeValores);

        //OU APENAS UMA MESMA LISTA IMPRIMIRIA A "CATEGORIA" DOS CARROS E "VALORES"
        System.out.println("\nOU APENAS UMA MESMA LISTA IMPRIMIRIA A \"CATEGORIA\" DOS CARROS E \"VALORES\"");
        alugaCarroCategoria.alugaCarro(listaDeValores);
        alugaCarroValorAluguel.valorAluguel(listaDeCategorias);

    }
}
