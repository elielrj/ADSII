package ADSII.trabalho;


import java.util.ArrayList;

public class Sistema{

    private RepositorioItem repositorItem;
    private ItemControlador itemControlador;


    //1 inicializar
    //1.1 e 1.2
    public Sistema() {
        this.repositorItem = new RepositorioItem();
        this.itemControlador = new ItemControlador(repositorItem);
    }




    //2.1 escolherItem
    //1.1
    public ArrayList<Item> escolherItem(Item item){
        return itemControlador.escolherItem(item);
    }



    //3. 1 escolher item personalizado
    //1.1
    public void escolherItemPersonalizado(Item item){
        itemControlador.personalizar(item);
    }


    public String imprimirItem() {
        return itemControlador.imprimirItem();
    }
}
