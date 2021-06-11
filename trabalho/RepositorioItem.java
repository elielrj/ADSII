package ADSII.trabalho;

import java.util.ArrayList;

public class RepositorioItem {

    private ArrayList<Item> itens;
    private ArrayList<Item> itensPossiveis;

    public RepositorioItem() {
        this.itens = new ArrayList<>();
        this.itensPossiveis = new ArrayList<>();
        this.itensPossiveis = this.itensPossiveis();
    }

    //1.1.1
    private ArrayList<Item> itensPossiveis() {
        Item itemPossivel1 = new Item(1,"Bicicleta", "Masculina", 17, "Azul");
        Item itemPossivel2 = new Item(2,"Bicicleta", "Feminina", 15, "Vermelha");

        this.itensPossiveis.add(itemPossivel1);
        this.itensPossiveis.add(itemPossivel2);

        //retorno deste repositório de apenas os itens possíveis
        return itensPossiveis;
    }

    public ArrayList<Item> buscaItensSimilaresPersonalizacao(Item item) {

        if(item.getNome() == "Bicicleta"){
            return itensPossiveis;
        }
        else return itensPossiveis = null;
    }

}
