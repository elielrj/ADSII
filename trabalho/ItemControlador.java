package ADSII.trabalho;

import java.util.ArrayList;

public class ItemControlador {
    private Item item;
    private RepositorioItem repositorioItem;

    public ItemControlador(RepositorioItem repositoriotem) {
        this.repositorioItem = repositoriotem;
        this.item = null;
    }

    public ArrayList<Item> escolherItem(Item item){
        return repositorioItem.buscaItensSimilaresPersonalizacao(item);
    }

    public void personalizar(Item item) {
        this.item = item;
    }

    public String imprimirItem() {
        return item.imprimirItem();
    }
}
